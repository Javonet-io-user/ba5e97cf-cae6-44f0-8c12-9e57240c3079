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

public class CrosstabCellGroupLabel extends CrosstabCellBase {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setShowSpanLabel(java.lang.String value) {
    try {
      javonetHandle.set("ShowSpanLabel", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getShowSpanLabel() {
    try {
      java.lang.String res = javonetHandle.get("ShowSpanLabel");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public PropertySortOrderAscending getSortOrderAscending() {
    try {
      Object res = javonetHandle.<NObject>get("SortOrderAscending");
      if (res == null) return null;
      return new PropertySortOrderAscending((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public PropertyMaxEntryCount getMaxEntryCount() {
    try {
      Object res = javonetHandle.<NObject>get("MaxEntryCount");
      if (res == null) return null;
      return new PropertyMaxEntryCount((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public PropertyAutoFill getAutoFill() {
    try {
      Object res = javonetHandle.<NObject>get("AutoFill");
      if (res == null) return null;
      return new PropertyAutoFill((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setExpandable(java.lang.String value) {
    try {
      javonetHandle.set("Expandable", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getExpandable() {
    try {
      java.lang.String res = javonetHandle.get("Expandable");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public CrosstabCellGroupLabel(NObject handle) {
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
