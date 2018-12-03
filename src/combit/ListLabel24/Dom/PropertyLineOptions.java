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

public class PropertyLineOptions extends DomItem {
  protected NObject javonetHandle;
  /** GetProperty */
  public PropertyFooterLinesOptions getFooter() {
    try {
      Object res = javonetHandle.<NObject>get("Footer");
      if (res == null) return null;
      return new PropertyFooterLinesOptions((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public PropertyGroupFooterLinesOptions getGroupFooter() {
    try {
      Object res = javonetHandle.<NObject>get("GroupFooter");
      if (res == null) return null;
      return new PropertyGroupFooterLinesOptions((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public PropertyGroupHeaderLinesOptions getGroupHeader() {
    try {
      Object res = javonetHandle.<NObject>get("GroupHeader");
      if (res == null) return null;
      return new PropertyGroupHeaderLinesOptions((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public PropertyDataLinesOptions getData() {
    try {
      Object res = javonetHandle.<NObject>get("Data");
      if (res == null) return null;
      return new PropertyDataLinesOptions((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public PropertyLineOptions(NObject handle) {
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
