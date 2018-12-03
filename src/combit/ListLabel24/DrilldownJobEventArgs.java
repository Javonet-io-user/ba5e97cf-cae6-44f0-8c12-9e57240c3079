package combit.ListLabel24;

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
import jio.System.*;
import combit.ListLabel24.*;
import jio.System.Globalization.*;

public class DrilldownJobEventArgs extends EventArgs {
  protected NObject javonetHandle;
  /** GetProperty */
  public java.lang.Integer getUserParameter() {
    try {
      java.lang.Integer res = javonetHandle.get("UserParameter");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public java.lang.Integer getWindowHandle() {
    try {
      java.lang.Integer res = javonetHandle.get("WindowHandle");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public java.lang.Integer getJobId() {
    try {
      java.lang.Integer res = javonetHandle.get("JobId");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public java.lang.String getProjectFileName() {
    try {
      java.lang.String res = javonetHandle.get("ProjectFileName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getParentTableName() {
    try {
      java.lang.String res = javonetHandle.get("ParentTableName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getRelationName() {
    try {
      java.lang.String res = javonetHandle.get("RelationName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getTableName() {
    try {
      java.lang.String res = javonetHandle.get("TableName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getParentKey() {
    try {
      java.lang.String res = javonetHandle.get("ParentKey");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getChildKey() {
    try {
      java.lang.String res = javonetHandle.get("ChildKey");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getKeyValue() {
    try {
      java.lang.String res = javonetHandle.get("KeyValue");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getPreviewFileName() {
    try {
      java.lang.String res = javonetHandle.get("PreviewFileName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getTooltipText() {
    try {
      java.lang.String res = javonetHandle.get("TooltipText");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getTabText() {
    try {
      java.lang.String res = javonetHandle.get("TabText");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public LlDrilldownJob getFunction() {
    try {
      Object res = javonetHandle.<NEnum>get("Function");
      if (res == null) return null;
      return LlDrilldownJob.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setReturnValue(java.lang.Integer value) {
    try {
      javonetHandle.set("ReturnValue", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getReturnValue() {
    try {
      java.lang.Integer res = javonetHandle.get("ReturnValue");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public java.lang.Integer getAttachInfo() {
    try {
      java.lang.Integer res = javonetHandle.get("AttachInfo");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setCultureInfo(CultureInfo value) {
    try {
      javonetHandle.set("CultureInfo", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public CultureInfo getCultureInfo() {
    try {
      Object res = javonetHandle.<NObject>get("CultureInfo");
      if (res == null) return null;
      return new CultureInfo((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.String getReportId() {
    try {
      java.lang.String res = javonetHandle.get("ReportId");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getExportFormat() {
    try {
      java.lang.String res = javonetHandle.get("ExportFormat");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public DrilldownJobEventArgs(LlDrilldownJobInfo callbackData) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.DrilldownJobEventArgs", callbackData);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DrilldownJobEventArgs(NObject handle) {
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
