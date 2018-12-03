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

public class TableFieldText extends TableFieldBase {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setAdjusted(java.lang.String value) {
    try {
      javonetHandle.set("Adjusted", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getAdjusted() {
    try {
      java.lang.String res = javonetHandle.get("Adjusted");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setLineSpacing(java.lang.String value) {
    try {
      javonetHandle.set("LineSpacing", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getLineSpacing() {
    try {
      java.lang.String res = javonetHandle.get("LineSpacing");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public PropertyAlignmentHorizontal getAlignmentHorizontal() {
    try {
      Object res = javonetHandle.<NObject>get("AlignmentHorizontal");
      if (res == null) return null;
      return new PropertyAlignmentHorizontal((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setAlignmentVertical(java.lang.String value) {
    try {
      javonetHandle.set("AlignmentVertical", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getAlignmentVertical() {
    try {
      java.lang.String res = javonetHandle.get("AlignmentVertical");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setContents(java.lang.String value) {
    try {
      javonetHandle.set("Contents", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getContents() {
    try {
      java.lang.String res = javonetHandle.get("Contents");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setDirection(java.lang.String value) {
    try {
      javonetHandle.set("Direction", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getDirection() {
    try {
      java.lang.String res = javonetHandle.get("Direction");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
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
  /** GetProperty */

  public PropertyFieldWrapping getWrapping() {
    try {
      Object res = javonetHandle.<NObject>get("Wrapping");
      if (res == null) return null;
      return new PropertyFieldWrapping((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setOptimizeSpaces(java.lang.String value) {
    try {
      javonetHandle.set("OptimizeSpaces", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getOptimizeSpaces() {
    try {
      java.lang.String res = javonetHandle.get("OptimizeSpaces");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public PropertyOutputFormatterBase getOutputFormatter() {
    try {
      Object res = javonetHandle.<NObject>get("OutputFormatter");
      if (res == null) return null;
      return new PropertyOutputFormatterBase((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
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

  public TableFieldText(CollectionTableFieldBases itemCollection) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.Dom.TableFieldText", itemCollection);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TableFieldText(CollectionTableFieldBases itemCollection, java.lang.Integer index) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.Dom.TableFieldText", itemCollection, index);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TableFieldText(NObject handle) {
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
