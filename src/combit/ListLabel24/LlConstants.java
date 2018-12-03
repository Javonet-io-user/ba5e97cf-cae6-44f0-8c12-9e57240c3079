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

public class LlConstants extends ValueType {
  protected NObject javonetHandle;
  /** GetFiled */
  public static java.lang.Integer getWrnRepeatData() {
    try {
      java.lang.Integer res = Javonet.getType("LlConstants").get("WrnRepeatData");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setWrnRepeatData(java.lang.Integer param) {
    try {
      Javonet.getType("LlConstants").set("WrnRepeatData", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getWrnTableChange() {
    try {
      java.lang.Integer res = Javonet.getType("LlConstants").get("WrnTableChange");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setWrnTableChange(java.lang.Integer param) {
    try {
      Javonet.getType("LlConstants").set("WrnTableChange", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.String getNullValue() {
    try {
      java.lang.String res = Javonet.getType("LlConstants").get("NullValue");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public static void setNullValue(java.lang.String param) {
    try {
      Javonet.getType("LlConstants").set("NullValue", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getPageHide() {
    try {
      java.lang.Integer res = Javonet.getType("LlConstants").get("PageHide");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setPageHide(java.lang.Integer param) {
    try {
      Javonet.getType("LlConstants").set("PageHide", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCopiesHide() {
    try {
      java.lang.Integer res = Javonet.getType("LlConstants").get("CopiesHide");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCopiesHide(java.lang.Integer param) {
    try {
      Javonet.getType("LlConstants").set("CopiesHide", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getSkipReturnAtEndOfRtf() {
    try {
      java.lang.Integer res = Javonet.getType("LlConstants").get("SkipReturnAtEndOfRtf");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setSkipReturnAtEndOfRtf(java.lang.Integer param) {
    try {
      Javonet.getType("LlConstants").set("SkipReturnAtEndOfRtf", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getHashFactorPrimeNumber() {
    try {
      java.lang.Integer res = Javonet.getType("LlConstants").get("HashFactorPrimeNumber");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setHashFactorPrimeNumber(java.lang.Integer param) {
    try {
      Javonet.getType("LlConstants").set("HashFactorPrimeNumber", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getHashSeedPrimeNumber() {
    try {
      java.lang.Integer res = Javonet.getType("LlConstants").get("HashSeedPrimeNumber");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setHashSeedPrimeNumber(java.lang.Integer param) {
    try {
      Javonet.getType("LlConstants").set("HashSeedPrimeNumber", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getIdentifierTranslationOnLoad() {
    try {
      java.lang.Integer res = Javonet.getType("LlConstants").get("IdentifierTranslationOnLoad");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setIdentifierTranslationOnLoad(java.lang.Integer param) {
    try {
      Javonet.getType("LlConstants").set("IdentifierTranslationOnLoad", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getIdentifierTranslationOnSave() {
    try {
      java.lang.Integer res = Javonet.getType("LlConstants").get("IdentifierTranslationOnSave");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setIdentifierTranslationOnSave(java.lang.Integer param) {
    try {
      Javonet.getType("LlConstants").set("IdentifierTranslationOnSave", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LlConstants(NObject handle) {
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
