package combit.ListLabel24.Dom;

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
import combit.ListLabel24.Dom.*;
import jio.System.Collections.*;
import jio.System.*;

public class CollectionEnumerator<T> implements IEnumerator, Iterator<Object> {
  protected NObject javonetHandle;

  @Override
  public boolean hasNext() {
    return (java.lang.Boolean) this.MoveNext();
  }

  @Override
  public Object next() {
    return (Object) this.get_Current();
  }
  /** GetProperty */

  public T get_CurrentProperty(Class<?> returnType) {
    try {
      Object res = javonetHandle.invoke("get_Current");
      if (res == null) return null;
      return (T) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public CollectionEnumerator(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.Boolean MoveNext() {
    try {
      java.lang.Boolean res = javonetHandle.invoke("MoveNext");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public void Reset() {
    try {
      javonetHandle.invoke("Reset");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Boolean IEnumerator_MoveNext() {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("jio.System.Collections.IEnumerator").invoke("MoveNext");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public Object get_Current() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Collections.IEnumerator")
              .invoke("get_Current");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void IEnumerator_Reset() {
    try {
      javonetHandle.explicitInterface("jio.System.Collections.IEnumerator").invoke("Reset");
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
