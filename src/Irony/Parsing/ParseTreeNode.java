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
import jio.System.*;

public class ParseTreeNode {
  protected NObject javonetHandle;
  /** GetProperty */
  public ParseTreeNodeList getChildNodes() {
    try {
      Object res = javonetHandle.<NObject>get("ChildNodes");
      if (res == null) return null;
      return new ParseTreeNodeList((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetFiled */

  public Object getAstNode() {
    try {
      Object res = javonetHandle.<NObject>get("AstNode");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setAstNode(Object param) {
    try {
      javonetHandle.set("AstNode", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public Token getToken() {
    try {
      Object res = javonetHandle.<NObject>get("Token");
      if (res == null) return null;
      return new Token((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setToken(Token param) {
    try {
      javonetHandle.set("Token", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public BnfTerm getTerm() {
    try {
      Object res = javonetHandle.<NObject>get("Term");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setTerm(BnfTerm param) {
    try {
      javonetHandle.set("Term", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.Integer getPrecedence() {
    try {
      java.lang.Integer res = javonetHandle.get("Precedence");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public void setPrecedence(java.lang.Integer param) {
    try {
      javonetHandle.set("Precedence", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public Associativity getAssociativity() {
    try {
      Object res = javonetHandle.<NEnum>get("Associativity");
      if (res == null) return null;
      return Associativity.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setAssociativity(Associativity param) {
    try {
      javonetHandle.set("Associativity", NEnum.fromJavaEnum(param));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public SourceSpan getSpan() {
    try {
      Object res = javonetHandle.<NObject>get("Span");
      if (res == null) return null;
      return new SourceSpan((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setSpan(SourceSpan param) {
    try {
      javonetHandle.set("Span", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.Boolean getIsError() {
    try {
      java.lang.Boolean res = javonetHandle.get("IsError");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetFiled */

  public void setIsError(java.lang.Boolean param) {
    try {
      javonetHandle.set("IsError", param);
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
  /** GetFiled */

  public TokenList getComments() {
    try {
      Object res = javonetHandle.<NObject>get("Comments");
      if (res == null) return null;
      return new TokenList((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setComments(TokenList param) {
    try {
      javonetHandle.set("Comments", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ParseTreeNode(Token token) {
    try {
      javonetHandle = Javonet.New("Irony.Parsing.ParseTreeNode", token);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ParseTreeNode(ParserState initialState) {
    try {
      javonetHandle = Javonet.New("Irony.Parsing.ParseTreeNode", initialState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ParseTreeNode(NonTerminal term, SourceSpan span) {
    try {
      javonetHandle = Javonet.New("Irony.Parsing.ParseTreeNode", term, span);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ParseTreeNode(NObject handle) {
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

  public java.lang.String FindTokenAndGetText() {
    try {
      java.lang.String res = javonetHandle.invoke("FindTokenAndGetText");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public Token FindToken() {
    try {
      Object res = javonetHandle.invoke("FindToken");
      if (res == null) return null;
      return new Token((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Boolean IsPunctuationOrEmptyTransient() {
    try {
      java.lang.Boolean res = javonetHandle.invoke("IsPunctuationOrEmptyTransient");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Boolean IsOperator() {
    try {
      java.lang.Boolean res = javonetHandle.invoke("IsOperator");
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
