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

public class LlNtfyReportparametersCollected extends ValueType {
  protected NObject javonetHandle;
  /** GetFiled */
  public java.lang.String gettriggerPrintID() {
    try {
      java.lang.String res = javonetHandle.get("triggerPrintID");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public void settriggerPrintID(java.lang.String param) {
    try {
      javonetHandle.set("triggerPrintID", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.String getneedDataError() {
    try {
      java.lang.String res = javonetHandle.get("needDataError");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public void setneedDataError(java.lang.String param) {
    try {
      javonetHandle.set("needDataError", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.String getneedDataErrorClient() {
    try {
      java.lang.String res = javonetHandle.get("needDataErrorClient");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public void setneedDataErrorClient(java.lang.String param) {
    try {
      javonetHandle.set("needDataErrorClient", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.Integer getstreamRPDefinitions() {
    try {
      java.lang.Integer res = javonetHandle.get("streamRPDefinitions");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public void setstreamRPDefinitions(java.lang.Integer param) {
    try {
      javonetHandle.set("streamRPDefinitions", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.Integer getstreamRPContents() {
    try {
      java.lang.Integer res = javonetHandle.get("streamRPContents");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public void setstreamRPContents(java.lang.Integer param) {
    try {
      javonetHandle.set("streamRPContents", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LlNtfyReportparametersCollected(NObject handle) {
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
