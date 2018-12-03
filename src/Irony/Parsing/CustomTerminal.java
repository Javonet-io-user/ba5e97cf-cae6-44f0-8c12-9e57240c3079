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

public class CustomTerminal extends Terminal {
  protected NObject javonetHandle;
  /** GetProperty */
  public MatchHandler getHandler() {
    try {
      Object res = javonetHandle.<NObject>get("Handler");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetFiled */

  public StringList getPrefixes() {
    try {
      Object res = javonetHandle.<NObject>get("Prefixes");
      if (res == null) return null;
      return new StringList((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setPrefixes(StringList param) {
    try {
      javonetHandle.set("Prefixes", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CustomTerminal(java.lang.String name, MatchHandler handler, java.lang.String[] prefixes) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("Irony.Parsing.CustomTerminal", name, handler, new Object[] {prefixes});
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CustomTerminal(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
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
