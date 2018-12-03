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

public class MultiToken extends Token {
  protected NObject javonetHandle;
  /** GetFiled */
  public TokenList getChildTokens() {
    try {
      Object res = javonetHandle.<NObject>get("ChildTokens");
      if (res == null) return null;
      return new TokenList((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setChildTokens(TokenList param) {
    try {
      javonetHandle.set("ChildTokens", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public MultiToken(Token[] tokens) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Irony.Parsing.MultiToken", new Object[] {tokens});
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public MultiToken(Terminal term, SourceLocation location, TokenList childTokens) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Irony.Parsing.MultiToken", term, location, childTokens);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public MultiToken(NObject handle) {
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
