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

public class ScannerData {
  protected NObject javonetHandle;
  /** GetFiled */
  public LanguageData getLanguage() {
    try {
      Object res = javonetHandle.<NObject>get("Language");
      if (res == null) return null;
      return new LanguageData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setLanguage(LanguageData param) {
    try {
      javonetHandle.set("Language", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public TerminalLookupTable getTerminalsLookup() {
    try {
      Object res = javonetHandle.<NObject>get("TerminalsLookup");
      if (res == null) return null;
      return new TerminalLookupTable((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setTerminalsLookup(TerminalLookupTable param) {
    try {
      javonetHandle.set("TerminalsLookup", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public TerminalList getMultilineTerminals() {
    try {
      Object res = javonetHandle.<NObject>get("MultilineTerminals");
      if (res == null) return null;
      return new TerminalList((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setMultilineTerminals(TerminalList param) {
    try {
      javonetHandle.set("MultilineTerminals", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public TerminalList getNoPrefixTerminals() {
    try {
      Object res = javonetHandle.<NObject>get("NoPrefixTerminals");
      if (res == null) return null;
      return new TerminalList((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setNoPrefixTerminals(TerminalList param) {
    try {
      javonetHandle.set("NoPrefixTerminals", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public TerminalLookupTable getNonGrammarTerminalsLookup() {
    try {
      Object res = javonetHandle.<NObject>get("NonGrammarTerminalsLookup");
      if (res == null) return null;
      return new TerminalLookupTable((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setNonGrammarTerminalsLookup(TerminalLookupTable param) {
    try {
      javonetHandle.set("NonGrammarTerminalsLookup", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ScannerData(LanguageData language) {
    try {
      javonetHandle = Javonet.New("Irony.Parsing.ScannerData", language);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ScannerData(NObject handle) {
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
