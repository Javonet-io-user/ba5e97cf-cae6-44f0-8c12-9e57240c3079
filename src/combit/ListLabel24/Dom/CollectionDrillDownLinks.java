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

public class CollectionDrillDownLinks extends DomCollectionBase
    implements IList, ICollection, IEnumerable, Iterable<Object> {
  protected NObject javonetHandle;

  @Override
  public Iterator<Object> iterator() {
    return (Iterator<Object>) this.GetEnumerator();
  }
  /** GetProperty */

  public DrillDownLinkBase get_Item(java.lang.Integer index) {
    try {
      Object res = javonetHandle.invoke("get_Item", index);
      if (res == null) return null;
      return new DrillDownLinkBase((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public CollectionDrillDownLinks(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public DrillDownLink AddNewDrillDownLink() {
    try {
      Object res = javonetHandle.invoke("AddNewDrillDownLink");
      if (res == null) return null;
      return new DrillDownLink((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public DrillDownLinkForParameterizedSubreport AddNewDrillDownLinkForParameterizedSubreport() {
    try {
      Object res = javonetHandle.invoke("AddNewDrillDownLinkForParameterizedSubreport");
      if (res == null) return null;
      return new DrillDownLinkForParameterizedSubreport((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public CollectionEnumerator<DrillDownLink> GetEnumerator() {
    try {
      Object res = javonetHandle.invoke("GetEnumerator");
      if (res == null) return null;
      return new CollectionEnumerator<DrillDownLink>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void CopyFrom(DomCollectionBase source) {
    try {
      javonetHandle.invoke("CopyFrom", source);
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
