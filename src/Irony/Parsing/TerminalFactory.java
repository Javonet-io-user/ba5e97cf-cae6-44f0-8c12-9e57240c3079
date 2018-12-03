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

public class TerminalFactory {
  protected NObject javonetHandle;

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public static StringLiteral CreateCSharpString(java.lang.String name) {
    try {
      Object res = Javonet.getType("TerminalFactory").invoke("CreateCSharpString", name);
      if (res == null) return null;
      return new StringLiteral((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static StringLiteral CreateCSharpChar(java.lang.String name) {
    try {
      Object res = Javonet.getType("TerminalFactory").invoke("CreateCSharpChar", name);
      if (res == null) return null;
      return new StringLiteral((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static StringLiteral CreateVbString(java.lang.String name) {
    try {
      Object res = Javonet.getType("TerminalFactory").invoke("CreateVbString", name);
      if (res == null) return null;
      return new StringLiteral((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static StringLiteral CreatePythonString(java.lang.String name) {
    try {
      Object res = Javonet.getType("TerminalFactory").invoke("CreatePythonString", name);
      if (res == null) return null;
      return new StringLiteral((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static NumberLiteral CreateCSharpNumber(java.lang.String name) {
    try {
      Object res = Javonet.getType("TerminalFactory").invoke("CreateCSharpNumber", name);
      if (res == null) return null;
      return new NumberLiteral((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static NumberLiteral CreateVbNumber(java.lang.String name) {
    try {
      Object res = Javonet.getType("TerminalFactory").invoke("CreateVbNumber", name);
      if (res == null) return null;
      return new NumberLiteral((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static NumberLiteral CreatePythonNumber(java.lang.String name) {
    try {
      Object res = Javonet.getType("TerminalFactory").invoke("CreatePythonNumber", name);
      if (res == null) return null;
      return new NumberLiteral((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static NumberLiteral CreateSchemeNumber(java.lang.String name) {
    try {
      Object res = Javonet.getType("TerminalFactory").invoke("CreateSchemeNumber", name);
      if (res == null) return null;
      return new NumberLiteral((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static IdentifierTerminal CreateCSharpIdentifier(java.lang.String name) {
    try {
      Object res = Javonet.getType("TerminalFactory").invoke("CreateCSharpIdentifier", name);
      if (res == null) return null;
      return new IdentifierTerminal((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static IdentifierTerminal CreatePythonIdentifier(java.lang.String name) {
    try {
      Object res = Javonet.getType("TerminalFactory").invoke("CreatePythonIdentifier", name);
      if (res == null) return null;
      return new IdentifierTerminal((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static IdentifierTerminal CreateSqlExtIdentifier(Grammar grammar, java.lang.String name) {
    try {
      Object res =
          Javonet.getType("TerminalFactory").invoke("CreateSqlExtIdentifier", grammar, name);
      if (res == null) return null;
      return new IdentifierTerminal((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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
