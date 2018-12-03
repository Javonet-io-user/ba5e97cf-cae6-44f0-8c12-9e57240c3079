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

public class SubItemStaticTable extends SubItemTableBase {
  protected NObject javonetHandle;
  /** GetProperty */
  public PropertyLineOptionsStaticTable getLineOptions() {
    try {
      Object res = javonetHandle.<NObject>get("LineOptions");
      if (res == null) return null;
      return new PropertyLineOptionsStaticTable((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public PropertyTableLinesStaticTable getLines() {
    try {
      Object res = javonetHandle.<NObject>get("Lines");
      if (res == null) return null;
      return new PropertyTableLinesStaticTable((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public SubItemStaticTable(CollectionSubItemBasesBase itemCollection) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.Dom.SubItemStaticTable", itemCollection);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SubItemStaticTable(CollectionSubItemBasesBase itemCollection, java.lang.Integer index) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("combit.ListLabel24.Dom.SubItemStaticTable", itemCollection, index);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SubItemStaticTable(NObject handle) {
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
