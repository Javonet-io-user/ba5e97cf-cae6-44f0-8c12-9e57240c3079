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

public class ObjectEllipse extends ObjectBase {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setCircle(java.lang.String value) {
    try {
      javonetHandle.set("Circle", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getCircle() {
    try {
      java.lang.String res = javonetHandle.get("Circle");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public PropertyFillingExt getFilling() {
    try {
      Object res = javonetHandle.<NObject>get("Filling");
      if (res == null) return null;
      return new PropertyFillingExt((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public PropertyRectangleFrame getFrame() {
    try {
      Object res = javonetHandle.<NObject>get("Frame");
      if (res == null) return null;
      return new PropertyRectangleFrame((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setExportAsPicture(java.lang.String value) {
    try {
      javonetHandle.set("ExportAsPicture", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getExportAsPicture() {
    try {
      java.lang.String res = javonetHandle.get("ExportAsPicture");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public ObjectEllipse(CollectionObjectBases objectCollection) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.Dom.ObjectEllipse", objectCollection);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ObjectEllipse(CollectionObjectBases objectCollection, java.lang.Integer index) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.Dom.ObjectEllipse", objectCollection, index);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ObjectEllipse(NObject handle) {
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
