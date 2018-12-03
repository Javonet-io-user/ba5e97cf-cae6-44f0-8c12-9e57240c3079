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

public class TableInputFieldBase extends TableField {
  protected NObject javonetHandle;
  /** GetProperty */
  public CollectionConditionalFormatterItems getConditionalFormatter() {
    try {
      Object res = javonetHandle.<NObject>get("ConditionalFormatter");
      if (res == null) return null;
      return new CollectionConditionalFormatterItems((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public PropertyFontExt getFont() {
    try {
      Object res = javonetHandle.<NObject>get("Font");
      if (res == null) return null;
      return new PropertyFontExt((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setFixedHeight(java.lang.String value) {
    try {
      javonetHandle.set("FixedHeight", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getFixedHeight() {
    try {
      java.lang.String res = javonetHandle.get("FixedHeight");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public PropertyFillingWithBitmap getFillingAsTableInputFieldBase() {
    try {
      Object res = javonetHandle.<NObject>get("Filling");
      if (res == null) return null;
      return new PropertyFillingWithBitmap((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setToolTip(java.lang.String value) {
    try {
      javonetHandle.set("ToolTip", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getToolTip() {
    try {
      java.lang.String res = javonetHandle.get("ToolTip");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public TableInputFieldBase(
      java.lang.String objectType,
      CollectionTableFieldBases itemCollection,
      java.lang.Integer index) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "combit.ListLabel24.Dom.TableInputFieldBase", objectType, itemCollection, index);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TableInputFieldBase(java.lang.String objectType, DomItem item) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.Dom.TableInputFieldBase", objectType, item);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TableInputFieldBase(NObject handle) {
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
