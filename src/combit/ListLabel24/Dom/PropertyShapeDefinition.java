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

public class PropertyShapeDefinition extends DomItem {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setProjection(java.lang.String value) {
    try {
      javonetHandle.set("Projection", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getProjection() {
    try {
      java.lang.String res = javonetHandle.get("Projection");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public PropertyShapeDefinitionData getData() {
    try {
      Object res = javonetHandle.<NObject>get("Data");
      if (res == null) return null;
      return new PropertyShapeDefinitionData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public ForegroundShapes getForegroundShapes() {
    try {
      Object res = javonetHandle.<NObject>get("ForegroundShapes");
      if (res == null) return null;
      return new ForegroundShapes((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public BackgroundShapes getBackgroundShapes() {
    try {
      Object res = javonetHandle.<NObject>get("BackgroundShapes");
      if (res == null) return null;
      return new BackgroundShapes((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public PropertyShapeDefinition(NObject handle) {
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
