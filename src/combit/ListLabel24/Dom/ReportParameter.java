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
import jio.System.*;

public class ReportParameter extends DomItem implements IEquatable<ReportParameter> {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setAllowBlank(java.lang.String value) {
    try {
      javonetHandle.set("AllowBlank", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getAllowBlank() {
    try {
      java.lang.String res = javonetHandle.get("AllowBlank");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setAllowMultipleValues(java.lang.String value) {
    try {
      javonetHandle.set("AllowMultipleValues", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getAllowMultipleValues() {
    try {
      java.lang.String res = javonetHandle.get("AllowMultipleValues");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setAllowNull(java.lang.String value) {
    try {
      javonetHandle.set("AllowNull", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getAllowNull() {
    try {
      java.lang.String res = javonetHandle.get("AllowNull");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public PropertyDefaultValues getDefaultValues() {
    try {
      Object res = javonetHandle.<NObject>get("DefaultValues");
      if (res == null) return null;
      return new PropertyDefaultValues((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.String getId() {
    try {
      java.lang.String res = javonetHandle.get("Id");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setIdentifier(java.lang.String value) {
    try {
      javonetHandle.set("Identifier", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getIdentifier() {
    try {
      java.lang.String res = javonetHandle.get("Identifier");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setParentId(java.lang.String value) {
    try {
      javonetHandle.set("ParentId", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getParentId() {
    try {
      java.lang.String res = javonetHandle.get("ParentId");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setPrompt(java.lang.String value) {
    try {
      javonetHandle.set("Prompt", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getPrompt() {
    try {
      java.lang.String res = javonetHandle.get("Prompt");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public PropertySource getSource() {
    try {
      Object res = javonetHandle.<NObject>get("Source");
      if (res == null) return null;
      return new PropertySource((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setTooltip(java.lang.String value) {
    try {
      javonetHandle.set("Tooltip", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getTooltip() {
    try {
      java.lang.String res = javonetHandle.get("Tooltip");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setControlType(LlDomControlType value) {
    try {
      javonetHandle.set("ControlType", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public LlDomControlType getControlType() {
    try {
      Object res = javonetHandle.<NEnum>get("ControlType");
      if (res == null) return null;
      return LlDomControlType.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setVisible(java.lang.String value) {
    try {
      javonetHandle.set("Visible", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getVisible() {
    try {
      java.lang.String res = javonetHandle.get("Visible");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setCurrentContentsAsObject(Object value) {
    try {
      javonetHandle.set("CurrentContentsAsObject", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Object getCurrentContentsAsObject() {
    try {
      Object res = javonetHandle.<NObject>get("CurrentContentsAsObject");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setCurrentContents(java.lang.String value) {
    try {
      javonetHandle.set("CurrentContents", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getCurrentContents() {
    try {
      java.lang.String res = javonetHandle.get("CurrentContents");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public ReportParameter(CollectionReportParameters reportParametersCollection) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("combit.ListLabel24.Dom.ReportParameter", reportParametersCollection);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ReportParameter(
      CollectionReportParameters reportParametersCollection, java.lang.Integer index) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("combit.ListLabel24.Dom.ReportParameter", reportParametersCollection, index);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ReportParameter(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void CopyFrom(DomItem source) {
    try {
      javonetHandle.invoke("CopyFrom", source);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Boolean Equals(ReportParameter other) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("Equals", other);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
