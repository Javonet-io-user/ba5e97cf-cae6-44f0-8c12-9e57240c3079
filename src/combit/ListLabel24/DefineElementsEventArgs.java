package combit.ListLabel24;

import Common.Activation;
import static Common.Helper.Convert;
import static Common.Helper.getGetObjectName;
import static Common.Helper.getReturnObjectName;
import static Common.Helper.ConvertToConcreteInterfaceImplementation;
import Common.Helper;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import jio.System.*;
import combit.ListLabel24.*;

public class DefineElementsEventArgs extends EventArgs {
  protected NObject javonetHandle;
  /** GetProperty */
  public Object getUserData() {
    try {
      Object res = javonetHandle.<NObject>get("UserData");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.Boolean getIsDesignMode() {
    try {
      java.lang.Boolean res = javonetHandle.get("IsDesignMode");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setProgressPercent(java.lang.Integer value) {
    try {
      javonetHandle.set("ProgressPercent", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getProgressPercent() {
    try {
      java.lang.Integer res = javonetHandle.get("ProgressPercent");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setIsLastRecord(java.lang.Boolean value) {
    try {
      javonetHandle.set("IsLastRecord", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getIsLastRecord() {
    try {
      java.lang.Boolean res = javonetHandle.get("IsLastRecord");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setResetProjectState(java.lang.Boolean value) {
    try {
      javonetHandle.set("ResetProjectState", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getResetProjectState() {
    try {
      java.lang.Boolean res = javonetHandle.get("ResetProjectState");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public DefineElementsEventArgs(
      Object userData,
      java.lang.Boolean isDesignMode,
      java.lang.Integer progressPercent,
      java.lang.Boolean isLastRecord,
      java.lang.Boolean resetProjectState) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "combit.ListLabel24.DefineElementsEventArgs",
              userData,
              isDesignMode,
              progressPercent,
              isLastRecord,
              resetProjectState);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DefineElementsEventArgs(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
