package combit.ListLabel24.DesignerExtensions;

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
import combit.ListLabel24.DesignerExtensions.*;
import jio.System.*;

public abstract class DesignerProperty implements IDesignerProperty, IDisposable {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setName(java.lang.String value) {
    try {
      javonetHandle.set("Name", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getName() {
    try {
      java.lang.String res = javonetHandle.get("Name");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setDisplayName(java.lang.String value) {
    try {
      javonetHandle.set("DisplayName", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getDisplayName() {
    try {
      java.lang.String res = javonetHandle.get("DisplayName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setDescription(java.lang.String value) {
    try {
      javonetHandle.set("Description", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getDescription() {
    try {
      java.lang.String res = javonetHandle.get("Description");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setGroup(java.lang.String value) {
    try {
      javonetHandle.set("Group", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getGroup() {
    try {
      java.lang.String res = javonetHandle.get("Group");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setDefaultValue(Object value) {
    try {
      javonetHandle.set("DefaultValue", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Object getDefaultValue() {
    try {
      Object res = javonetHandle.<NObject>get("DefaultValue");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setAllowFormula(java.lang.Boolean value) {
    try {
      javonetHandle.set("AllowFormula", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getAllowFormula() {
    try {
      java.lang.Boolean res = javonetHandle.get("AllowFormula");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setEnabled(java.lang.Boolean value) {
    try {
      javonetHandle.set("Enabled", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getEnabled() {
    try {
      java.lang.Boolean res = javonetHandle.get("Enabled");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setFormula(Object value) {
    try {
      javonetHandle.set("Formula", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Object getFormula() {
    try {
      Object res = javonetHandle.<NObject>get("Formula");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.Boolean getHasChanged() {
    try {
      java.lang.Boolean res = javonetHandle.get("HasChanged");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  public Object getValue() {
    try {
      Object res = javonetHandle.<NObject>get("Value");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public DesignerProperty(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void Dispose() {
    try {
      javonetHandle.explicitInterface("jio.System.IDisposable").invoke("Dispose");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Integer GetHashCode() {
    try {
      java.lang.Integer res = javonetHandle.invoke("GetHashCode");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer SetLLJob(java.lang.Integer jobHandle, java.lang.Integer baseInterface) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerProperty")
              .invoke("SetLLJob", jobHandle, baseInterface);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer GetName(AtomicReference<java.lang.String> name) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerProperty")
              .invoke(
                  "GetName", new NOut(name, Helper.JavaToDotnetType.get(java.lang.String.class)));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer SetPropertyItem(Object propertyItem) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerProperty")
              .invoke("SetPropertyItem", propertyItem);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer GetOption(java.lang.String option, Object value) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerProperty")
              .invoke("GetOption", option, value);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer NotifyChanged() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerProperty")
              .invoke("NotifyChanged");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer NotifyButtonClicked() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DesignerExtensions.IDesignerProperty")
              .invoke("NotifyButtonClicked");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Event */

  private java.util.ArrayList<EventHandler<EventArgs>> _ValueChangedListeners =
      new java.util.ArrayList<EventHandler<EventArgs>>();

  public void addValueChanged(EventHandler<EventArgs> toAdd) {
    _ValueChangedListeners.add(toAdd);
  }

  public void removeValueChanged(EventHandler<EventArgs> toRemove) {
    _ValueChangedListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
