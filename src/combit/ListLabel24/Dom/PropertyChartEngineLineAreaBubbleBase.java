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

public abstract class PropertyChartEngineLineAreaBubbleBase extends PropertyChartEngineBase {
  protected NObject javonetHandle;
  /** GetProperty */
  public PropertyFilling getFilling() {
    try {
      Object res = javonetHandle.<NObject>get("Filling");
      if (res == null) return null;
      return new PropertyFilling((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public PropertyChartSecondaryValueAxis getSecondaryValueAxis() {
    try {
      Object res = javonetHandle.<NObject>get("SecondaryValueAxis");
      if (res == null) return null;
      return new PropertyChartSecondaryValueAxis((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public PropertyCategoryAxisX getXAxis() {
    try {
      Object res = javonetHandle.<NObject>get("XAxis");
      if (res == null) return null;
      return new PropertyCategoryAxisX((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public PropertyCategoryAxisY getYAxis() {
    try {
      Object res = javonetHandle.<NObject>get("YAxis");
      if (res == null) return null;
      return new PropertyCategoryAxisY((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public PropertyValueZAxisArray getZAxes() {
    try {
      Object res = javonetHandle.<NObject>get("ZAxes");
      if (res == null) return null;
      return new PropertyValueZAxisArray((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public PropertyChartEngineLineAreaBubbleBase(NObject handle) {
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
