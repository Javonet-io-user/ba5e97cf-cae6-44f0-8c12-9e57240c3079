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

public class PropertyTableArea extends DomItem {
  protected NObject javonetHandle;
  /** GetProperty */
  public PropertyCell getDurationCell() {
    try {
      Object res = javonetHandle.<NObject>get("DurationCell");
      if (res == null) return null;
      return new PropertyCell((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public PropertyCell getEndDateCell() {
    try {
      Object res = javonetHandle.<NObject>get("EndDateCell");
      if (res == null) return null;
      return new PropertyCell((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public PropertyIndexCell getIndexCell() {
    try {
      Object res = javonetHandle.<NObject>get("IndexCell");
      if (res == null) return null;
      return new PropertyIndexCell((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public PropertyLabelCell getLabelCell() {
    try {
      Object res = javonetHandle.<NObject>get("LabelCell");
      if (res == null) return null;
      return new PropertyLabelCell((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public PropertyCell getPercentageCompleteCell() {
    try {
      Object res = javonetHandle.<NObject>get("PercentageCompleteCell");
      if (res == null) return null;
      return new PropertyCell((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public PropertyCell getStartDateCell() {
    try {
      Object res = javonetHandle.<NObject>get("StartDateCell");
      if (res == null) return null;
      return new PropertyCell((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public PropertyTableArea(NObject handle) {
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
