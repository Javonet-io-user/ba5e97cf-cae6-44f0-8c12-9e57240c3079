package Irony.Parsing;

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
import Irony.Parsing.*;

public class SourceLocation extends ValueType {
  protected NObject javonetHandle;
  /** GetProperty */
  public static SourceLocation getEmpty() {
    try {
      Object res = Javonet.getType("SourceLocation").<NObject>get("Empty");
      if (res == null) return null;
      return new SourceLocation((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetFiled */

  public java.lang.Integer getPosition() {
    try {
      java.lang.Integer res = javonetHandle.get("Position");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public void setPosition(java.lang.Integer param) {
    try {
      javonetHandle.set("Position", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.Integer getLine() {
    try {
      java.lang.Integer res = javonetHandle.get("Line");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public void setLine(java.lang.Integer param) {
    try {
      javonetHandle.set("Line", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.Integer getColumn() {
    try {
      java.lang.Integer res = javonetHandle.get("Column");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public void setColumn(java.lang.Integer param) {
    try {
      javonetHandle.set("Column", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SourceLocation(
      java.lang.Integer position, java.lang.Integer line, java.lang.Integer column) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Irony.Parsing.SourceLocation", position, line, column);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SourceLocation(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.String ToString() {
    try {
      java.lang.String res = javonetHandle.invoke("ToString");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.String ToUiString() {
    try {
      java.lang.String res = javonetHandle.invoke("ToUiString");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public static java.lang.Integer Compare(SourceLocation x, SourceLocation y) {
    try {
      java.lang.Integer res = Javonet.getType("SourceLocation").invoke("Compare", x, y);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
