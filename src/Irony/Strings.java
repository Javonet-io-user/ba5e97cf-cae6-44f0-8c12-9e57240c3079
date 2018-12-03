package Irony;

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
import Irony.*;
import jio.System.Collections.Generic.*;

public class Strings {
  protected NObject javonetHandle;
  /** GetFiled */
  public static java.lang.String getAllLatinLetters() {
    try {
      java.lang.String res = Javonet.getType("Strings").get("AllLatinLetters");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public static void setAllLatinLetters(java.lang.String param) {
    try {
      Javonet.getType("Strings").set("AllLatinLetters", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.String getDecimalDigits() {
    try {
      java.lang.String res = Javonet.getType("Strings").get("DecimalDigits");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public static void setDecimalDigits(java.lang.String param) {
    try {
      Javonet.getType("Strings").set("DecimalDigits", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.String getOctalDigits() {
    try {
      java.lang.String res = Javonet.getType("Strings").get("OctalDigits");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public static void setOctalDigits(java.lang.String param) {
    try {
      Javonet.getType("Strings").set("OctalDigits", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.String getHexDigits() {
    try {
      java.lang.String res = Javonet.getType("Strings").get("HexDigits");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public static void setHexDigits(java.lang.String param) {
    try {
      Javonet.getType("Strings").set("HexDigits", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.String getBinaryDigits() {
    try {
      java.lang.String res = Javonet.getType("Strings").get("BinaryDigits");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public static void setBinaryDigits(java.lang.String param) {
    try {
      Javonet.getType("Strings").set("BinaryDigits", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public static java.lang.String JoinStrings(
      java.lang.String separator, IEnumerable<java.lang.String> values) {
    try {
      java.lang.String res = Javonet.getType("Strings").invoke("JoinStrings", separator, values);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
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
