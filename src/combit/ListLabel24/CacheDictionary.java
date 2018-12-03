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

public class CacheDictionary<TKey, TValue> {
  protected NObject javonetHandle;
  /** GetProperty */
  public TValue get_Item(TKey key, Class<?> returnType) {
    try {
      Object res = javonetHandle.invoke("get_Item", key);
      if (res == null) return null;
      return (TValue) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GenericConstructor */

  public CacheDictionary(java.lang.Integer capacity, Class<?> TKey, Class<?> TValue) {
    try {
      javonetHandle =
          Javonet.getType(
                  "combit.ListLabel24.CacheDictionary`2",
                  getReturnObjectName(TKey),
                  getReturnObjectName(TValue))
              .create();
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CacheDictionary(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void Add(TKey key, TValue value) {
    try {
      javonetHandle.invoke("Add", key, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Boolean ContainsKey(TKey key) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("ContainsKey", key);
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
