package jio.System.Data;

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
import jio.System.ComponentModel.*;
import jio.System.Data.*;
import jio.System.*;
import jio.System.Collections.*;

public class DataViewManager extends MarshalByValueComponent
    implements IComponent,
        IDisposable,
        IServiceProvider,
        IBindingList,
        IList,
        ICollection,
        IEnumerable,
        ITypedList,
        Iterable<Object> {
  protected NObject javonetHandle;

  @Override
  public Iterator<Object> iterator() {
    return (Iterator<Object>) this.IEnumerable_GetEnumerator();
  }

  public DataViewManager() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Data.DataViewManager");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DataViewManager(DataSet dataSet) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Data.DataViewManager", dataSet);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DataViewManager(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.Boolean get_AllowNew() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("jio.System.ComponentModel.IBindingList")
              .invoke("get_AllowNew");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public Object AddNew() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.ComponentModel.IBindingList")
              .invoke("AddNew");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Boolean get_AllowEdit() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("jio.System.ComponentModel.IBindingList")
              .invoke("get_AllowEdit");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Boolean get_AllowRemove() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("jio.System.ComponentModel.IBindingList")
              .invoke("get_AllowRemove");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Boolean get_SupportsChangeNotification() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("jio.System.ComponentModel.IBindingList")
              .invoke("get_SupportsChangeNotification");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Boolean get_SupportsSearching() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("jio.System.ComponentModel.IBindingList")
              .invoke("get_SupportsSearching");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Boolean get_SupportsSorting() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("jio.System.ComponentModel.IBindingList")
              .invoke("get_SupportsSorting");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Boolean get_IsSorted() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("jio.System.ComponentModel.IBindingList")
              .invoke("get_IsSorted");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public PropertyDescriptor get_SortProperty() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.ComponentModel.IBindingList")
              .invoke("get_SortProperty");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public ListSortDirection get_SortDirection() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.ComponentModel.IBindingList")
              .invoke("get_SortDirection");
      if (res == null) return null;
      return ListSortDirection.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void AddIndex(PropertyDescriptor property) {
    try {
      javonetHandle
          .explicitInterface("jio.System.ComponentModel.IBindingList")
          .invoke("AddIndex", property);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void ApplySort(PropertyDescriptor property, ListSortDirection direction) {
    try {
      javonetHandle
          .explicitInterface("jio.System.ComponentModel.IBindingList")
          .invoke("ApplySort", property, NEnum.fromJavaEnum(direction));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Integer Find(PropertyDescriptor property, Object key) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("jio.System.ComponentModel.IBindingList")
              .invoke("Find", property, key);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public void RemoveIndex(PropertyDescriptor property) {
    try {
      javonetHandle
          .explicitInterface("jio.System.ComponentModel.IBindingList")
          .invoke("RemoveIndex", property);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void RemoveSort() {
    try {
      javonetHandle
          .explicitInterface("jio.System.ComponentModel.IBindingList")
          .invoke("RemoveSort");
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

  public void IList_Clear() {
    try {
      javonetHandle.explicitInterface("jio.System.Collections.IList").invoke("Clear");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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

  public void IList_RemoveAt(java.lang.Integer index) {
    try {
      javonetHandle.explicitInterface("jio.System.Collections.IList").invoke("RemoveAt", index);
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

  public java.lang.Integer get_Count() {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("jio.System.Collections.ICollection").invoke("get_Count");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public Object get_SyncRoot() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Collections.ICollection")
              .invoke("get_SyncRoot");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Boolean get_IsSynchronized() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("jio.System.Collections.ICollection")
              .invoke("get_IsSynchronized");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
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
  /** Method */

  public java.lang.String GetListName(PropertyDescriptor[] listAccessors) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("jio.System.ComponentModel.ITypedList")
              .invoke("GetListName", new Object[] {listAccessors});
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public PropertyDescriptorCollection GetItemProperties(PropertyDescriptor[] listAccessors) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.ComponentModel.ITypedList")
              .invoke("GetItemProperties", new Object[] {listAccessors});
      if (res == null) return null;
      return new PropertyDescriptorCollection((NObject) res);
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
