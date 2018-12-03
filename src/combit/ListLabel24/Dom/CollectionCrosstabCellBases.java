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

public class CollectionCrosstabCellBases extends DomCollectionBase
    implements IList, ICollection, IEnumerable, Iterable<Object> {
  protected NObject javonetHandle;

  @Override
  public Iterator<Object> iterator() {
    return (Iterator<Object>) this.GetEnumerator();
  }

  public CollectionCrosstabCellBases(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void CopyFrom(DomCollectionBase source) {
    try {
      javonetHandle.invoke("CopyFrom", source);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public CollectionCrosstabCellBases.CrosstabCellBaseEnumerator GetEnumerator() {
    try {
      Object res = javonetHandle.invoke("GetEnumerator");
      if (res == null) return null;
      return new CollectionCrosstabCellBases.CrosstabCellBaseEnumerator((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public static class CrosstabCellBaseEnumerator implements IEnumerator, Iterator<Object> {
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

    public CrosstabCellBase getCurrent() {
      try {
        Object res = javonetHandle.<NObject>get("Current");
        if (res == null) return null;
        return new CrosstabCellBase((NObject) res);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }

    public CrosstabCellBaseEnumerator(NObject handle) {
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
    /** Method */

    public java.lang.Object Reset() {
      try {
        Object res =
            javonetHandle.explicitInterface("jio.System.Collections.IEnumerator").invoke("Reset");
        if (res == null) return null;
        return ConvertToConcreteInterfaceImplementation(res);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** Method */

    public java.lang.Object MoveNext() {
      try {
        Object res =
            javonetHandle
                .explicitInterface("jio.System.Collections.IEnumerator")
                .invoke("MoveNext");
        if (res == null) return null;
        return ConvertToConcreteInterfaceImplementation(res);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
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
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
