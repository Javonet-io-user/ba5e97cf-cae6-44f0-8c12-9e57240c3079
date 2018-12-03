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
import jio.System.Collections.Generic.*;
import Irony.*;

public class CommentTerminal extends Terminal {
  protected NObject javonetHandle;
  /** GetFiled */
  public java.lang.String getStartSymbol() {
    try {
      java.lang.String res = javonetHandle.get("StartSymbol");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public void setStartSymbol(java.lang.String param) {
    try {
      javonetHandle.set("StartSymbol", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public StringList getEndSymbols() {
    try {
      Object res = javonetHandle.<NObject>get("EndSymbols");
      if (res == null) return null;
      return new StringList((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setEndSymbols(StringList param) {
    try {
      javonetHandle.set("EndSymbols", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CommentTerminal(
      java.lang.String name, java.lang.String startSymbol, java.lang.String[] endSymbols) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Irony.Parsing.CommentTerminal", name, startSymbol, new Object[] {endSymbols});
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CommentTerminal(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void Init(GrammarData grammarData) {
    try {
      javonetHandle.invoke("Init", grammarData);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public Token TryMatch(ParsingContext context, ISourceStream source) {
    try {
      Object res = javonetHandle.invoke("TryMatch", context, source);
      if (res == null) return null;
      return new Token((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public IList<java.lang.String> GetFirsts() {
    try {
      Object res = javonetHandle.invoke("GetFirsts");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
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
