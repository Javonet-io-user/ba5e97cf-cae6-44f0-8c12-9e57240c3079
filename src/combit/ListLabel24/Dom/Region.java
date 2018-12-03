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
import jio.System.Drawing.Printing.*;

public class Region extends DomItem {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setCollate(java.lang.String value) {
    try {
      javonetHandle.set("Collate", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getCollate() {
    try {
      java.lang.String res = javonetHandle.get("Collate");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getIsStandardRegion() {
    try {
      java.lang.String res = javonetHandle.get("IsStandardRegion");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setUseForOutput(java.lang.String value) {
    try {
      javonetHandle.set("UseForOutput", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getUseForOutput() {
    try {
      java.lang.String res = javonetHandle.get("UseForOutput");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setCondition(java.lang.String value) {
    try {
      javonetHandle.set("Condition", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getCondition() {
    try {
      java.lang.String res = javonetHandle.get("Condition");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setCopies(java.lang.String value) {
    try {
      javonetHandle.set("Copies", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getCopies() {
    try {
      java.lang.String res = javonetHandle.get("Copies");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public PropertyDevice getDevice() {
    try {
      Object res = javonetHandle.<NObject>get("Device");
      if (res == null) return null;
      return new PropertyDevice((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setDuplex(java.lang.String value) {
    try {
      javonetHandle.set("Duplex", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getDuplex() {
    try {
      java.lang.String res = javonetHandle.get("Duplex");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setFitPage(java.lang.String value) {
    try {
      javonetHandle.set("FitPage", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getFitPage() {
    try {
      java.lang.String res = javonetHandle.get("FitPage");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setForcePaperFormat(java.lang.String value) {
    try {
      javonetHandle.set("ForcePaperFormat", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getForcePaperFormat() {
    try {
      java.lang.String res = javonetHandle.get("ForcePaperFormat");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public PropertyLayout getLayout() {
    try {
      Object res = javonetHandle.<NObject>get("Layout");
      if (res == null) return null;
      return new PropertyLayout((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
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
  /** GetProperty */

  public PropertyPaper getPaper() {
    try {
      Object res = javonetHandle.<NObject>get("Paper");
      if (res == null) return null;
      return new PropertyPaper((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setSourceTray(java.lang.String value) {
    try {
      javonetHandle.set("SourceTray", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getSourceTray() {
    try {
      java.lang.String res = javonetHandle.get("SourceTray");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setUsePhysicalPaper(java.lang.String value) {
    try {
      javonetHandle.set("UsePhysicalPaper", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getUsePhysicalPaper() {
    try {
      java.lang.String res = javonetHandle.get("UsePhysicalPaper");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setShowInPrintDialog(java.lang.String value) {
    try {
      javonetHandle.set("ShowInPrintDialog", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getShowInPrintDialog() {
    try {
      java.lang.String res = javonetHandle.get("ShowInPrintDialog");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public Region(CollectionRegions regionCollection) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.Dom.Region", regionCollection);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Region(CollectionRegions regionCollection, java.lang.Integer index) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.Dom.Region", regionCollection, index);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Region(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void Set(PrinterSettings printerSettings) {
    try {
      javonetHandle.invoke("Set", printerSettings);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Set(PrinterSettings printerSettings, PageSettings pageSettings) {
    try {
      javonetHandle.invoke("Set", printerSettings, pageSettings);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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
