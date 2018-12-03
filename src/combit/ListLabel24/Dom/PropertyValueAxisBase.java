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

public class PropertyValueAxisBase extends PropertyValueAxisBaseMinimal {
  protected NObject javonetHandle;
  /** GetProperty */
  public PropertyChartLabelCoordinate getCoordinateLabel() {
    try {
      Object res = javonetHandle.<NObject>get("CoordinateLabel");
      if (res == null) return null;
      return new PropertyChartLabelCoordinate((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public PropertyChartLabel getLabel() {
    try {
      Object res = javonetHandle.<NObject>get("Label");
      if (res == null) return null;
      return new PropertyChartLabel((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public PropertyChartLabelCoordinateOnObject getCoordinateLabelOnObject() {
    try {
      Object res = javonetHandle.<NObject>get("CoordinateLabelOnObject");
      if (res == null) return null;
      return new PropertyChartLabelCoordinateOnObject((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public CoordinateLabelPlacement getCoordinateLabelPlacement() {
    try {
      Object res = javonetHandle.<NObject>get("CoordinateLabelPlacement");
      if (res == null) return null;
      return new CoordinateLabelPlacement((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public PropertyGridLines getGridLines() {
    try {
      Object res = javonetHandle.<NObject>get("GridLines");
      if (res == null) return null;
      return new PropertyGridLines((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setTickmarkColor(java.lang.String value) {
    try {
      javonetHandle.set("TickmarkColor", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getTickmarkColor() {
    try {
      java.lang.String res = javonetHandle.get("TickmarkColor");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public PropertyTickmarks getTickmarks() {
    try {
      Object res = javonetHandle.<NObject>get("Tickmarks");
      if (res == null) return null;
      return new PropertyTickmarks((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setIntermediateTickCount(java.lang.String value) {
    try {
      javonetHandle.set("IntermediateTickCount", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getIntermediateTickCount() {
    try {
      java.lang.String res = javonetHandle.get("IntermediateTickCount");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public PropertyFillingExt getZebraPattern() {
    try {
      Object res = javonetHandle.<NObject>get("ZebraPattern");
      if (res == null) return null;
      return new PropertyFillingExt((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public PropertyValueAxisBase(NObject handle) {
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
