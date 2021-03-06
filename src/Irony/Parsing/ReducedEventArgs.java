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

public class ReducedEventArgs extends ParsingEventArgs {
  protected NObject javonetHandle;
  /** GetFiled */
  public Production getReducedProduction() {
    try {
      Object res = javonetHandle.<NObject>get("ReducedProduction");
      if (res == null) return null;
      return new Production((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setReducedProduction(Production param) {
    try {
      javonetHandle.set("ReducedProduction", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public ParseTreeNode getResultNode() {
    try {
      Object res = javonetHandle.<NObject>get("ResultNode");
      if (res == null) return null;
      return new ParseTreeNode((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setResultNode(ParseTreeNode param) {
    try {
      javonetHandle.set("ResultNode", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ReducedEventArgs(
      ParsingContext context, Production reducedProduction, ParseTreeNode resultNode) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("Irony.Parsing.ReducedEventArgs", context, reducedProduction, resultNode);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ReducedEventArgs(NObject handle) {
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
