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

public class ParserData {
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

  public ParserState getInitialState() {
    try {
      Object res = javonetHandle.<NObject>get("InitialState");
      if (res == null) return null;
      return new ParserState((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setInitialState(ParserState param) {
    try {
      javonetHandle.set("InitialState", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public ParserStateTable getInitialStates() {
    try {
      Object res = javonetHandle.<NObject>get("InitialStates");
      if (res == null) return null;
      return new ParserStateTable((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setInitialStates(ParserStateTable param) {
    try {
      javonetHandle.set("InitialStates", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public ParserStateList getStates() {
    try {
      Object res = javonetHandle.<NObject>get("States");
      if (res == null) return null;
      return new ParserStateList((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setStates(ParserStateList param) {
    try {
      javonetHandle.set("States", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public ParserAction getErrorAction() {
    try {
      Object res = javonetHandle.<NObject>get("ErrorAction");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setErrorAction(ParserAction param) {
    try {
      javonetHandle.set("ErrorAction", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ParserData(LanguageData language) {
    try {
      javonetHandle = Javonet.New("Irony.Parsing.ParserData", language);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ParserData(NObject handle) {
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
