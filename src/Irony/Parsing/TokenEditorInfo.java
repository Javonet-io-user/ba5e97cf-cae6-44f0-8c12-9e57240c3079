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
import Irony.Parsing.*;

public class TokenEditorInfo {
  protected NObject javonetHandle;
  /** GetFiled */
  public TokenType getType() {
    try {
      Object res = javonetHandle.<NEnum>get("Type");
      if (res == null) return null;
      return TokenType.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setType(TokenType param) {
    try {
      javonetHandle.set("Type", NEnum.fromJavaEnum(param));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public TokenColor getColor() {
    try {
      Object res = javonetHandle.<NEnum>get("Color");
      if (res == null) return null;
      return TokenColor.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setColor(TokenColor param) {
    try {
      javonetHandle.set("Color", NEnum.fromJavaEnum(param));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public TokenTriggers getTriggers() {
    try {
      Object res = javonetHandle.<NEnum>get("Triggers");
      if (res == null) return null;
      return TokenTriggers.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setTriggers(TokenTriggers param) {
    try {
      javonetHandle.set("Triggers", NEnum.fromJavaEnum(param));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.String getToolTip() {
    try {
      java.lang.String res = javonetHandle.get("ToolTip");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public void setToolTip(java.lang.String param) {
    try {
      javonetHandle.set("ToolTip", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.Integer getUnderlineType() {
    try {
      java.lang.Integer res = javonetHandle.get("UnderlineType");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public void setUnderlineType(java.lang.Integer param) {
    try {
      javonetHandle.set("UnderlineType", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TokenEditorInfo(TokenType type, TokenColor color, TokenTriggers triggers) {
    try {
      javonetHandle =
          Javonet.New(
              "Irony.Parsing.TokenEditorInfo",
              NEnum.fromJavaEnum(type),
              NEnum.fromJavaEnum(color),
              NEnum.fromJavaEnum(triggers));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TokenEditorInfo(NObject handle) {
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
