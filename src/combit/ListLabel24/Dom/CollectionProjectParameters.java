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
import combit.ListLabel24.*;
import jio.System.Collections.*;

public class CollectionProjectParameters extends DomCollectionBase
    implements IList, ICollection, IEnumerable, Iterable<Object> {
  protected NObject javonetHandle;

  @Override
  public Iterator<Object> iterator() {
    return (Iterator<Object>) this.GetEnumerator();
  }
  /** GetProperty */

  public ProjectParameter get_Item(java.lang.Integer index) {
    try {
      Object res = javonetHandle.invoke("get_Item", index);
      if (res == null) return null;
      return new ProjectParameter((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public ProjectParameter get_Item(java.lang.String itemName) {
    try {
      Object res = javonetHandle.invoke("get_Item", itemName);
      if (res == null) return null;
      return new ProjectParameter((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public ProjectParameter get_Item(LlProjectParameter parameter) {
    try {
      Object res = javonetHandle.invoke("get_Item", NEnum.fromJavaEnum(parameter));
      if (res == null) return null;
      return new ProjectParameter((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public CollectionProjectParameters(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public CollectionEnumerator<ProjectParameter> GetEnumerator() {
    try {
      Object res = javonetHandle.invoke("GetEnumerator");
      if (res == null) return null;
      return new CollectionEnumerator<ProjectParameter>((NObject) res);
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
