package combit.ListLabel24.DataProviders;

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
import combit.ListLabel24.DataProviders.*;
import combit.ListLabel24.*;

public class TranslateFilterSyntaxEventArgs extends EventArgs {
  protected NObject javonetHandle;
  /** GetProperty */
  public LlExpressionPart getPart() {
    try {
      Object res = javonetHandle.<NEnum>get("Part");
      if (res == null) return null;
      return LlExpressionPart.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.Integer getArgumentCount() {
    try {
      java.lang.Integer res = javonetHandle.get("ArgumentCount");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public Object getName() {
    try {
      Object res = javonetHandle.<NObject>get("Name");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public Object[] getArguments(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("Arguments");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setResult(Object value) {
    try {
      javonetHandle.set("Result", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Object getResult() {
    try {
      Object res = javonetHandle.<NObject>get("Result");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setHandled(java.lang.Boolean value) {
    try {
      javonetHandle.set("Handled", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getHandled() {
    try {
      java.lang.Boolean res = javonetHandle.get("Handled");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public TranslateFilterSyntaxEventArgs(
      LlExpressionPart part,
      java.lang.Integer argumentCount,
      Object name,
      Object[] arguments,
      Object result) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "combit.ListLabel24.DataProviders.TranslateFilterSyntaxEventArgs",
              NEnum.fromJavaEnum(part),
              argumentCount,
              name,
              new Object[] {arguments},
              result);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TranslateFilterSyntaxEventArgs(NObject handle) {
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
