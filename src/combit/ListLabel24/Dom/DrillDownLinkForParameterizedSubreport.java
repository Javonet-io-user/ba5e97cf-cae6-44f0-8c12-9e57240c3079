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

public class DrillDownLinkForParameterizedSubreport extends DrillDownLinkBase {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setShowReportParameterPreviewPane(java.lang.Boolean value) {
    try {
      javonetHandle.set("ShowReportParameterPreviewPane", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getShowReportParameterPreviewPane() {
    try {
      java.lang.Boolean res = javonetHandle.get("ShowReportParameterPreviewPane");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setSubReportDescription(java.lang.String value) {
    try {
      javonetHandle.set("SubReportDescription", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getSubReportDescription() {
    try {
      java.lang.String res = javonetHandle.get("SubReportDescription");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public CollectionDrillDownReportParameter getReportParameterList() {
    try {
      Object res = javonetHandle.<NObject>get("ReportParameterList");
      if (res == null) return null;
      return new CollectionDrillDownReportParameter((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public DrillDownLinkForParameterizedSubreport(CollectionDrillDownLinks drillDownLinkCollection) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "combit.ListLabel24.Dom.DrillDownLinkForParameterizedSubreport",
              drillDownLinkCollection);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DrillDownLinkForParameterizedSubreport(
      CollectionDrillDownLinks drillDownLinkCollection, java.lang.Integer index) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "combit.ListLabel24.Dom.DrillDownLinkForParameterizedSubreport",
              drillDownLinkCollection,
              index);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DrillDownLinkForParameterizedSubreport(NObject handle) {
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
