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
import Irony.*;
import jio.System.*;

public class ParseTree {
  protected NObject javonetHandle;
  /** GetProperty */
  public ParseTreeStatus getStatus() {
    try {
      Object res = javonetHandle.<NEnum>get("Status");
      if (res == null) return null;
      return ParseTreeStatus.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetFiled */

  public java.lang.String getSourceText() {
    try {
      java.lang.String res = javonetHandle.get("SourceText");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public void setSourceText(java.lang.String param) {
    try {
      javonetHandle.set("SourceText", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.String getFileName() {
    try {
      java.lang.String res = javonetHandle.get("FileName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public void setFileName(java.lang.String param) {
    try {
      javonetHandle.set("FileName", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public TokenList getTokens() {
    try {
      Object res = javonetHandle.<NObject>get("Tokens");
      if (res == null) return null;
      return new TokenList((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setTokens(TokenList param) {
    try {
      javonetHandle.set("Tokens", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public TokenList getOpenBraces() {
    try {
      Object res = javonetHandle.<NObject>get("OpenBraces");
      if (res == null) return null;
      return new TokenList((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setOpenBraces(TokenList param) {
    try {
      javonetHandle.set("OpenBraces", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public ParseTreeNode getRoot() {
    try {
      Object res = javonetHandle.<NObject>get("Root");
      if (res == null) return null;
      return new ParseTreeNode((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setRoot(ParseTreeNode param) {
    try {
      javonetHandle.set("Root", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public LogMessageList getParserMessages() {
    try {
      Object res = javonetHandle.<NObject>get("ParserMessages");
      if (res == null) return null;
      return new LogMessageList((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setParserMessages(LogMessageList param) {
    try {
      javonetHandle.set("ParserMessages", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.Long getParseTimeMilliseconds() {
    try {
      java.lang.Long res = javonetHandle.get("ParseTimeMilliseconds");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setParseTimeMilliseconds(java.lang.Long param) {
    try {
      javonetHandle.set("ParseTimeMilliseconds", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public Object getTag() {
    try {
      Object res = javonetHandle.<NObject>get("Tag");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setTag(Object param) {
    try {
      javonetHandle.set("Tag", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ParseTree(java.lang.String sourceText, java.lang.String fileName) {
    try {
      javonetHandle = Javonet.New("Irony.Parsing.ParseTree", sourceText, fileName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ParseTree(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.Boolean HasErrors() {
    try {
      java.lang.Boolean res = javonetHandle.invoke("HasErrors");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
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
