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

public class PropertyCrosstabDimension extends DomItem {
  protected NObject javonetHandle;
  /** GetProperty */
  public CollectionFormulas getGroupings() {
    try {
      Object res = javonetHandle.<NObject>get("Groupings");
      if (res == null) return null;
      return new CollectionFormulas((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public CollectionCrosstabCellGroupLabels getGroupLabel() {
    try {
      Object res = javonetHandle.<NObject>get("GroupLabel");
      if (res == null) return null;
      return new CollectionCrosstabCellGroupLabels((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public CollectionCrosstabCellSumLabels getSumLabel() {
    try {
      Object res = javonetHandle.<NObject>get("SumLabel");
      if (res == null) return null;
      return new CollectionCrosstabCellSumLabels((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public PropertyCrosstabDimension(NObject handle) {
    super(handle);
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
