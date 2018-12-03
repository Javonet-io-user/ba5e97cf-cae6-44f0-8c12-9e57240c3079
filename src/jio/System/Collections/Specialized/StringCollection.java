package jio.System.Collections.Specialized;

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
import jio.System.Collections.Specialized.*;
import jio.System.*;
import jio.System.Collections.*;

public class StringCollection implements IList, ICollection, IEnumerable, Iterable<Object> {
  protected NObject javonetHandle;

  @Override
  public Iterator<Object> iterator() {
    return (Iterator<Object>) this.GetEnumerator();
  }
  /** SetProperty */

  public void set_Item(java.lang.Integer index, java.lang.String value) {
    try {
      javonetHandle.invoke("set_Item", index, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String get_Item(java.lang.Integer index) {
    try {
      java.lang.String res = javonetHandle.invoke("get_Item", index);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.Integer getCount() {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("jio.System.Collections.ICollection").invoke("Count");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public java.lang.Boolean getIsReadOnly() {
    try {
      java.lang.Boolean res = javonetHandle.get("IsReadOnly");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  public java.lang.Boolean getIsSynchronized() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("jio.System.Collections.ICollection")
              .invoke("IsSynchronized");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  public Object getSyncRoot() {
    try {
      Object res =
          javonetHandle.explicitInterface("jio.System.Collections.ICollection").invoke("SyncRoot");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public StringCollection() {
    try {
      javonetHandle = Javonet.New("System.Collections.Specialized.StringCollection");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StringCollection(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.Integer Add(java.lang.String value) {
    try {
      java.lang.Integer res = javonetHandle.invoke("Add", value);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public void AddRange(java.lang.String[] value) {
    try {
      javonetHandle.invoke("AddRange", new Object[] {value});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void IList_Clear() {
    try {
      javonetHandle.explicitInterface("jio.System.Collections.IList").invoke("Clear");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Boolean Contains(java.lang.String value) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("Contains", value);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public void CopyTo(java.lang.String[] array, java.lang.Integer index) {
    try {
      javonetHandle.invoke("CopyTo", new Object[] {array}, index);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public StringEnumerator GetEnumerator() {
    try {
      Object res = javonetHandle.invoke("GetEnumerator");
      if (res == null) return null;
      return new StringEnumerator((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Integer IndexOf(java.lang.String value) {
    try {
      java.lang.Integer res = javonetHandle.invoke("IndexOf", value);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public void Insert(java.lang.Integer index, java.lang.String value) {
    try {
      javonetHandle.invoke("Insert", index, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Remove(java.lang.String value) {
    try {
      javonetHandle.invoke("Remove", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void IList_RemoveAt(java.lang.Integer index) {
    try {
      javonetHandle.explicitInterface("jio.System.Collections.IList").invoke("RemoveAt", index);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public Object IList_get_Item(java.lang.Integer index) {
    try {
      Object res =
          javonetHandle.explicitInterface("jio.System.Collections.IList").invoke("get_Item", index);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void IList_set_Item(java.lang.Integer index, Object value) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Collections.IList")
          .invoke("set_Item", index, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Integer IList_Add(Object value) {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("jio.System.Collections.IList").invoke("Add", value);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Boolean IList_Contains(Object value) {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("jio.System.Collections.IList").invoke("Contains", value);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Boolean IList_get_IsReadOnly() {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("jio.System.Collections.IList").invoke("get_IsReadOnly");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Boolean IList_get_IsFixedSize() {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("jio.System.Collections.IList").invoke("get_IsFixedSize");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Integer IList_IndexOf(Object value) {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("jio.System.Collections.IList").invoke("IndexOf", value);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public void IList_Insert(java.lang.Integer index, Object value) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Collections.IList")
          .invoke("Insert", index, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void IList_Remove(Object value) {
    try {
      javonetHandle.explicitInterface("jio.System.Collections.IList").invoke("Remove", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void CopyTo(java.lang.reflect.Array array, java.lang.Integer index) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Collections.ICollection")
          .invoke("CopyTo", array, index);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public IEnumerator IEnumerable_GetEnumerator() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Collections.IEnumerable")
              .invoke("GetEnumerator");
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
