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

public class CollectionBackgroundShapesItems extends DomCollectionBase
    implements IList, ICollection, IEnumerable, Iterable<Object> {
  protected NObject javonetHandle;

  @Override
  public Iterator<Object> iterator() {
    return (Iterator<Object>) this.GetEnumerator();
  }
  /** GetProperty */

  public PropertyBackgroundShapesItem get_Item(java.lang.Integer index) {
    try {
      Object res = javonetHandle.invoke("get_Item", index);
      if (res == null) return null;
      return new PropertyBackgroundShapesItem((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public CollectionBackgroundShapesItems(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public CollectionEnumerator<PropertyBackgroundShapesItem> GetEnumerator() {
    try {
      Object res = javonetHandle.invoke("GetEnumerator");
      if (res == null) return null;
      return new CollectionEnumerator<PropertyBackgroundShapesItem>((NObject) res);
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
