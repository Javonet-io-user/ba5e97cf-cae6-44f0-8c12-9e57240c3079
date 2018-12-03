package combit.ListLabel24;

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
import combit.ListLabel24.*;
import jio.System.*;

public abstract class LoggerBase implements ILlLogger {
  protected NObject javonetHandle;

  public LoggerBase(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.Boolean WantOutput(LogLevels level, LogCategory category) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.ILlLogger")
              .invoke("WantOutput", NEnum.fromJavaEnum(level), NEnum.fromJavaEnum(category));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public void Debug(LogCategory category, java.lang.String message, Object[] args) {
    try {
      javonetHandle
          .explicitInterface("combit.ListLabel24.ILlLogger")
          .invoke("Debug", NEnum.fromJavaEnum(category), message, new Object[] {args});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Debug(
      java.lang.Integer indentationDelta,
      LogCategory category,
      java.lang.String message,
      Object[] args) {
    try {
      javonetHandle
          .explicitInterface("combit.ListLabel24.ILlLogger")
          .invoke(
              "Debug",
              indentationDelta,
              NEnum.fromJavaEnum(category),
              message,
              new Object[] {args});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Info(LogCategory category, java.lang.String message, Object[] args) {
    try {
      javonetHandle
          .explicitInterface("combit.ListLabel24.ILlLogger")
          .invoke("Info", NEnum.fromJavaEnum(category), message, new Object[] {args});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Info(
      java.lang.Integer indentationDelta,
      LogCategory category,
      java.lang.String message,
      Object[] args) {
    try {
      javonetHandle
          .explicitInterface("combit.ListLabel24.ILlLogger")
          .invoke(
              "Info", indentationDelta, NEnum.fromJavaEnum(category), message, new Object[] {args});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Warn(LogCategory category, java.lang.String message, Object[] args) {
    try {
      javonetHandle
          .explicitInterface("combit.ListLabel24.ILlLogger")
          .invoke("Warn", NEnum.fromJavaEnum(category), message, new Object[] {args});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Error(LogCategory category, java.lang.String message, Object[] args) {
    try {
      javonetHandle
          .explicitInterface("combit.ListLabel24.ILlLogger")
          .invoke("Error", NEnum.fromJavaEnum(category), message, new Object[] {args});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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
