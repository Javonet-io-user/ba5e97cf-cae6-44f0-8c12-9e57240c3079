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
import combit.ListLabel24.*;
import jio.System.IO.*;
import jio.System.*;
import jio.System.Drawing.Printing.*;
import jio.System.Collections.Generic.*;
import jio.System.Collections.ObjectModel.*;

public class LlCore implements IDisposable {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setParentHandle(java.lang.Integer value) {
    try {
      javonetHandle.set("ParentHandle", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getParentHandle() {
    try {
      java.lang.Integer res = javonetHandle.get("ParentHandle");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public static LlCore.ProcessType getCurrentProcessType() {
    try {
      Object res = Javonet.getType("LlCore").<NEnum>get("CurrentProcessType");
      if (res == null) return null;
      return LlCore.ProcessType.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public FieldCollection getFields() {
    try {
      Object res = javonetHandle.<NObject>get("Fields");
      if (res == null) return null;
      return new FieldCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public VariableCollection getVariables() {
    try {
      Object res = javonetHandle.<NObject>get("Variables");
      if (res == null) return null;
      return new VariableCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public ChartFieldCollection getChartFields() {
    try {
      Object res = javonetHandle.<NObject>get("ChartFields");
      if (res == null) return null;
      return new ChartFieldCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setSkipInitDataSource(java.lang.Boolean value) {
    try {
      javonetHandle.set("SkipInitDataSource", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getSkipInitDataSource() {
    try {
      java.lang.Boolean res = javonetHandle.get("SkipInitDataSource");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setBitmapCaching(java.lang.Boolean value) {
    try {
      javonetHandle.set("BitmapCaching", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getBitmapCaching() {
    try {
      java.lang.Boolean res = javonetHandle.get("BitmapCaching");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  public java.lang.Integer getHandle() {
    try {
      java.lang.Integer res = javonetHandle.get("Handle");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public java.lang.Boolean getIsPrinting() {
    try {
      java.lang.Boolean res = javonetHandle.get("IsPrinting");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetFiled */

  public ListLabel getm_Parent() {
    try {
      Object res = javonetHandle.<NObject>get("m_Parent");
      if (res == null) return null;
      return new ListLabel((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setm_Parent(ListLabel param) {
    try {
      javonetHandle.set("m_Parent", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getm_nMajorVersion() {
    try {
      java.lang.Integer res = Javonet.getType("LlCore").get("m_nMajorVersion");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setm_nMajorVersion(java.lang.Integer param) {
    try {
      Javonet.getType("LlCore").set("m_nMajorVersion", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LlCore() {
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.LlCore");
      javonetHandle.addEventListener(
          "DrilldownJob",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DrilldownJobHandler handler : _DrilldownJobListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DrilldownJobEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LlCore(ListLabel parent) {
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.LlCore", parent);
      javonetHandle.addEventListener(
          "DrilldownJob",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DrilldownJobHandler handler : _DrilldownJobListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DrilldownJobEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LlCore(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.Integer LlProjectOpen(
      LlProject projectType,
      Stream projectStream,
      Stream printerSettingsStream,
      java.lang.Integer flags) {
    try {
      java.lang.Integer res =
          javonetHandle.invoke(
              "LlProjectOpen",
              NEnum.fromJavaEnum(projectType),
              projectStream,
              printerSettingsStream,
              flags);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer LlProjectOpen(
      LlProject projectType, java.lang.String projectFile, java.lang.Integer flags) {
    try {
      java.lang.Integer res =
          javonetHandle.invoke(
              "LlProjectOpen", NEnum.fromJavaEnum(projectType), projectFile, flags);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public void LlProjectSave(java.lang.String projectFile) {
    try {
      javonetHandle.invoke("LlProjectSave", projectFile);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlProjectClose() {
    try {
      javonetHandle.invoke("LlProjectClose");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlAssociatePreviewControl(java.lang.Integer controlHandle, java.lang.Integer flags) {
    try {
      javonetHandle.invoke("LlAssociatePreviewControl", controlHandle, flags);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static java.lang.String LlGetErrortext(java.lang.Integer errorCode) {
    try {
      java.lang.String res = Javonet.getType("LlCore").invoke("LlGetErrortext", errorCode);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.String LlUtilsGetResourceString(java.lang.Integer resourceID) {
    try {
      java.lang.String res = javonetHandle.invoke("LlUtilsGetResourceString", resourceID);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.Integer LlLocAddDictionaryEntry(
      java.lang.Integer LCID,
      java.lang.String pszKey,
      java.lang.String pszValue,
      LlDictionaryType nType) {
    try {
      java.lang.Integer res =
          javonetHandle.invoke(
              "LlLocAddDictionaryEntry", LCID, pszKey, pszValue, NEnum.fromJavaEnum(nType));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public void LlJobStateSave(Stream stream, java.lang.Boolean packed, JobStateFlags flags) {
    try {
      javonetHandle.invoke("LlJobStateSave", stream, packed, NEnum.fromJavaEnum(flags));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlJobStateSave(Stream stream, java.lang.Boolean packed, java.lang.Integer flags) {
    try {
      javonetHandle.invoke("LlJobStateSave", stream, packed, flags);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlJobStateRestore(Stream stream, JobStateFlags flags) {
    try {
      javonetHandle.invoke("LlJobStateRestore", stream, NEnum.fromJavaEnum(flags));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlJobStateRestore(Stream stream, java.lang.Integer flags) {
    try {
      javonetHandle.invoke("LlJobStateRestore", stream, flags);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlDesignerTriggerJobInUIThread(java.lang.Integer nUserData) {
    try {
      javonetHandle.invoke("LlDesignerTriggerJobInUIThread", nUserData);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlDesignerShowMessage(
      java.lang.String title, java.lang.String message, java.lang.Integer flags) {
    try {
      javonetHandle.invoke("LlDesignerShowMessage", title, message, flags);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Integer LlExprTranslateToHostExpression(
      java.lang.Integer expression,
      Object filter,
      Object filterParameters,
      java.lang.String currentTableName) {
    try {
      java.lang.Integer res =
          javonetHandle.invoke(
              "LlExprTranslateToHostExpression",
              expression,
              filter,
              filterParameters,
              currentTableName);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public static void LlUtilsAddResourcefilesStream(
      java.lang.String name, Stream stream, java.lang.Boolean packed) {
    try {
      Javonet.getType("LlCore").invoke("LlUtilsAddResourcefilesStream", name, stream, packed);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public LlProject LlUtilsGetProjectType(java.lang.String projectFileOrID) {
    try {
      Object res = javonetHandle.invoke("LlUtilsGetProjectType", projectFileOrID);
      if (res == null) return null;
      return LlProject.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static java.lang.Integer LlAddDebugSinkForCurrentThread(java.lang.Integer debugSink) {
    try {
      java.lang.Integer res =
          Javonet.getType("LlCore").invoke("LlAddDebugSinkForCurrentThread", debugSink);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public static void LlRemoveDebugSinkForCurrentThread(java.lang.Integer pDebugSink) {
    try {
      Javonet.getType("LlCore").invoke("LlRemoveDebugSinkForCurrentThread", pDebugSink);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static java.lang.String LlUtilsIDFromOrgIDStatic(
      java.lang.String rawName, java.lang.Integer hJob) {
    try {
      java.lang.String res =
          Javonet.getType("LlCore").invoke("LlUtilsIDFromOrgIDStatic", rawName, hJob);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public void LlRepositoryCreateItemFromFile(
      java.lang.Integer pFileRepository,
      java.lang.String type,
      java.lang.String itemId,
      java.lang.String parentItemId,
      java.lang.String filePath,
      java.lang.String importUserData) {
    try {
      javonetHandle.invoke(
          "LlRepositoryCreateItemFromFile",
          pFileRepository,
          type,
          itemId,
          parentItemId,
          filePath,
          importUserData);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void LlRepositoryCreateItemForType(
      java.lang.Integer pFileRepository,
      java.lang.String type,
      java.lang.String itemId,
      java.lang.String parentItemId) {
    try {
      Javonet.getType("LlCore")
          .invoke("LlRepositoryCreateItemForType", pFileRepository, type, itemId, parentItemId);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static java.lang.String LlRepositoryGetNewId() {
    try {
      java.lang.String res = Javonet.getType("LlCore").invoke("LlRepositoryGetNewId");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public static Object GetVariantFromProfContents(java.lang.String text) {
    try {
      Object res = Javonet.getType("LlCore").invoke("GetVariantFromProfContents", text);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static java.lang.String GetProfContentsFromVariant(Object input) {
    try {
      java.lang.String res = Javonet.getType("LlCore").invoke("GetProfContentsFromVariant", input);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public static java.lang.Boolean IsListProject(LlProject project) {
    try {
      java.lang.Boolean res =
          Javonet.getType("LlCore").invoke("IsListProject", NEnum.fromJavaEnum(project));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public static void LlAddCtlSupport(
      java.lang.Integer windowHandle, LlCtlOption flags, java.lang.String iniFile) {
    try {
      Javonet.getType("LlCore")
          .invoke("LlAddCtlSupport", windowHandle, NEnum.fromJavaEnum(flags), iniFile);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.String LlPrintGetFilterExpression() {
    try {
      java.lang.String res = javonetHandle.invoke("LlPrintGetFilterExpression");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.Boolean LlPrintWillMatchFilter() {
    try {
      java.lang.Boolean res = javonetHandle.invoke("LlPrintWillMatchFilter");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Boolean LlPrintDidMatchFilter() {
    try {
      java.lang.Boolean res = javonetHandle.invoke("LlPrintDidMatchFilter");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.String LlGetFieldContents(java.lang.String name) {
    try {
      java.lang.String res = javonetHandle.invoke("LlGetFieldContents", name);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.String LlGetVariableContents(java.lang.String name) {
    try {
      java.lang.String res = javonetHandle.invoke("LlGetVariableContents", name);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.math.BigDecimal LlGetSumVariableContents(java.lang.String name) {
    try {
      java.math.BigDecimal res = javonetHandle.invoke("LlGetSumVariableContents", name);
      if (res == null) return null;
      return (java.math.BigDecimal) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.String LlGetUserVariableContents(java.lang.String name) {
    try {
      java.lang.String res = javonetHandle.invoke("LlGetUserVariableContents", name);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public LlFieldType LlGetVariableType(java.lang.String name) {
    try {
      Object res = javonetHandle.invoke("LlGetVariableType", name);
      if (res == null) return null;
      return LlFieldType.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public LlFieldType LlGetFieldType(java.lang.String name) {
    try {
      Object res = javonetHandle.invoke("LlGetFieldType", name);
      if (res == null) return null;
      return LlFieldType.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Integer LlPrintGetColumnInfo(
      java.lang.String objectName, java.lang.Integer nCol, LlColumn pCol) {
    try {
      java.lang.Integer res = javonetHandle.invoke("LlPrintGetColumnInfo", objectName, nCol, pCol);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public void LlSetPrinterDefaultsDir(java.lang.String directory) {
    try {
      javonetHandle.invoke("LlSetPrinterDefaultsDir", directory);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlCreateSketch(LlProject projectType, java.lang.String projectFile) {
    try {
      javonetHandle.invoke("LlCreateSketch", NEnum.fromJavaEnum(projectType), projectFile);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlCreateSketch(
      LlProject projectType, java.lang.String projectFile, java.lang.Boolean fetchDataStructure) {
    try {
      javonetHandle.invoke(
          "LlCreateSketch", NEnum.fromJavaEnum(projectType), projectFile, fetchDataStructure);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlViewerProhibitAction(java.lang.Integer menuID) {
    try {
      javonetHandle.invoke("LlViewerProhibitAction", menuID);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlViewerProhibitAction(LlViewerAction action) {
    try {
      javonetHandle.invoke("LlViewerProhibitAction", NEnum.fromJavaEnum(action));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlPrintCopyPrinterConfiguration(
      java.lang.String filename, LlPrinterConfiguration function) {
    try {
      javonetHandle.invoke(
          "LlPrintCopyPrinterConfiguration", filename, NEnum.fromJavaEnum(function));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static java.lang.Integer LlStgsysStorageOpen(
      java.lang.String filename,
      java.lang.String tempPath,
      java.lang.Boolean readOnly,
      java.lang.Boolean oneJobTranslation) {
    try {
      java.lang.Integer res =
          Javonet.getType("LlCore")
              .invoke("LlStgsysStorageOpen", filename, tempPath, readOnly, oneJobTranslation);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public static void LlStgsysStorageClose(java.lang.Integer hStg) {
    try {
      Javonet.getType("LlCore").invoke("LlStgsysStorageClose", hStg);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static java.lang.Integer LlStgsysStorageCreate(
      java.lang.String filename, java.lang.String tempPath) {
    try {
      java.lang.Integer res =
          Javonet.getType("LlCore").invoke("LlStgsysStorageCreate", filename, tempPath);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public static java.lang.Integer LlStgsysGetAPIVersion(java.lang.Integer hStg) {
    try {
      java.lang.Integer res = Javonet.getType("LlCore").invoke("LlStgsysGetAPIVersion", hStg);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public static java.lang.Integer LlStgsysGetFileVersion(java.lang.Integer hStg) {
    try {
      java.lang.Integer res = Javonet.getType("LlCore").invoke("LlStgsysGetFileVersion", hStg);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public static java.lang.String LlStgsysGetFilename(
      java.lang.Integer hStg, java.lang.Integer job, java.lang.Integer file) {
    try {
      java.lang.String res =
          Javonet.getType("LlCore").invoke("LlStgsysGetFilename", hStg, job, file);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public static java.lang.Integer LlStgsysGetJobCount(java.lang.Integer hStg) {
    try {
      java.lang.Integer res = Javonet.getType("LlCore").invoke("LlStgsysGetJobCount", hStg);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public static void LlStgsysSetJob(java.lang.Integer hStg, java.lang.Integer job) {
    try {
      Javonet.getType("LlCore").invoke("LlStgsysSetJob", hStg, job);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static java.lang.Integer LlStgsysGetPageCount(java.lang.Integer hStg) {
    try {
      java.lang.Integer res = Javonet.getType("LlCore").invoke("LlStgsysGetPageCount", hStg);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public static java.lang.Integer LlStgsysGetJobOptionValue(
      java.lang.Integer hStg, LlStgsysOption option) {
    try {
      java.lang.Integer res =
          Javonet.getType("LlCore")
              .invoke("LlStgsysGetJobOptionValue", hStg, NEnum.fromJavaEnum(option));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public static java.lang.Integer LlStgsysGetPageOptionValue(
      java.lang.Integer hStg, java.lang.Integer pageIndex, LlStgsysOption option) {
    try {
      java.lang.Integer res =
          Javonet.getType("LlCore")
              .invoke("LlStgsysGetPageOptionValue", hStg, pageIndex, NEnum.fromJavaEnum(option));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public static java.lang.String LlStgsysGetPageOptionString(
      java.lang.Integer hStg, java.lang.Integer pageIndex, LlStgsysOption option) {
    try {
      java.lang.String res =
          Javonet.getType("LlCore")
              .invoke("LlStgsysGetPageOptionString", hStg, pageIndex, NEnum.fromJavaEnum(option));
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public static java.lang.String LlStgsysGetJobOptionStringEx(
      java.lang.Integer hStg, java.lang.String pszKey) {
    try {
      java.lang.String res =
          Javonet.getType("LlCore").invoke("LlStgsysGetJobOptionStringEx", hStg, pszKey);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public static void LlStgsysSetJobOptionStringEx(
      java.lang.Integer hStg, java.lang.String pszKey, java.lang.String pszValue) {
    try {
      Javonet.getType("LlCore").invoke("LlStgsysSetJobOptionStringEx", hStg, pszKey, pszValue);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void LlStgsysSetPageOptionString(
      java.lang.Integer hStg,
      java.lang.Integer pageIndex,
      LlStgsysOption option,
      java.lang.String value) {
    try {
      Javonet.getType("LlCore")
          .invoke(
              "LlStgsysSetPageOptionString", hStg, pageIndex, NEnum.fromJavaEnum(option), value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void LlStgsysAppend(java.lang.Integer hStg, java.lang.Integer hStgToAppend) {
    try {
      Javonet.getType("LlCore").invoke("LlStgsysAppend", hStg, hStgToAppend);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void LlStgsysDeleteJob(java.lang.Integer hStg, java.lang.Integer jobIndex) {
    try {
      Javonet.getType("LlCore").invoke("LlStgsysDeleteJob", hStg, jobIndex);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void LlStgsysDeletePage(java.lang.Integer hStg, java.lang.Integer pageIndex) {
    try {
      Javonet.getType("LlCore").invoke("LlStgsysDeletePage", hStg, pageIndex);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static java.lang.Integer LlStgsysGetPageMetafile(
      java.lang.Integer hStg, java.lang.Integer pageIndex) {
    try {
      java.lang.Integer res =
          Javonet.getType("LlCore").invoke("LlStgsysGetPageMetafile", hStg, pageIndex);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public static void LlStgsysDestroyMetafile(java.lang.Integer handle) {
    try {
      Javonet.getType("LlCore").invoke("LlStgsysDestroyMetafile", handle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void LlStgsysDrawPage(
      java.lang.Integer hStg,
      java.lang.Integer hDC,
      java.lang.Integer hPrnDC,
      java.lang.Boolean askPrinter,
      RECT rect,
      java.lang.Integer pageIndex,
      java.lang.Boolean fit) {
    try {
      Javonet.getType("LlCore")
          .invoke("LlStgsysDrawPage", hStg, hDC, hPrnDC, askPrinter, rect, pageIndex, fit);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static java.lang.Integer LlStgsysGetLastError(java.lang.Integer hStg) {
    try {
      java.lang.Integer res = Javonet.getType("LlCore").invoke("LlStgsysGetLastError", hStg);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public static void LlStgsysDeleteFiles(java.lang.Integer hStg) {
    try {
      Javonet.getType("LlCore").invoke("LlStgsysDeleteFiles", hStg);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void LlStgsysPrint(
      java.lang.Integer hStg,
      java.lang.String printerName1,
      java.lang.String printerName2,
      java.lang.Integer startPageIndex,
      java.lang.Integer endPageIndex,
      java.lang.Integer copies,
      LlStgsysPrintFlag flags,
      java.lang.String message,
      java.lang.Integer windowHandle) {
    try {
      Javonet.getType("LlCore")
          .invoke(
              "LlStgsysPrint",
              hStg,
              printerName1,
              printerName2,
              startPageIndex,
              endPageIndex,
              copies,
              NEnum.fromJavaEnum(flags),
              message,
              windowHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void LlStgsysStoragePrint(
      java.lang.String filename,
      java.lang.String tempPath,
      java.lang.String printerName1,
      java.lang.String printerName2,
      java.lang.Integer startPageIndex,
      java.lang.Integer endPageIndex,
      java.lang.Integer copies,
      LlStgsysPrintFlag flags,
      java.lang.String message,
      java.lang.Integer windowHandle) {
    try {
      Javonet.getType("LlCore")
          .invoke(
              "LlStgsysStoragePrint",
              filename,
              tempPath,
              printerName1,
              printerName2,
              startPageIndex,
              endPageIndex,
              copies,
              NEnum.fromJavaEnum(flags),
              message,
              windowHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void LlStgsysConvert(
      java.lang.Integer hStg,
      java.lang.String destinationFilename,
      java.lang.String destinationFormat) {
    try {
      Javonet.getType("LlCore")
          .invoke("LlStgsysConvert", hStg, destinationFilename, destinationFormat);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void LlStgsysSetUILanguage(java.lang.Integer hStg, java.lang.Integer nLanguage) {
    try {
      Javonet.getType("LlCore").invoke("LlStgsysSetUILanguage", hStg, nLanguage);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void LsMailConfigurationDialog(
      java.lang.Integer windowHandle,
      java.lang.String subkey,
      LsMailConfigurationFlags flags,
      LlLanguage language) {
    try {
      Javonet.getType("LlCore")
          .invoke(
              "LsMailConfigurationDialog",
              windowHandle,
              subkey,
              NEnum.fromJavaEnum(flags),
              NEnum.fromJavaEnum(language));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static java.lang.Integer LsMailJobOpen(java.lang.Integer language) {
    try {
      java.lang.Integer res = Javonet.getType("LlCore").invoke("LsMailJobOpen", language);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public static void LsMailJobClose(java.lang.Integer hMailJob) {
    try {
      Javonet.getType("LlCore").invoke("LsMailJobClose", hMailJob);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void LsMailSetOptionString(
      java.lang.Integer hMailJob, java.lang.String option, java.lang.String value) {
    try {
      Javonet.getType("LlCore").invoke("LsMailSetOptionString", hMailJob, option, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void LsMailSendFile(java.lang.Integer hMailJob) {
    try {
      Javonet.getType("LlCore").invoke("LsMailSendFile", hMailJob);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void LsMailSendFile(java.lang.Integer hMailJob, java.lang.Integer handle) {
    try {
      Javonet.getType("LlCore").invoke("LsMailSendFile", hMailJob, handle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void LsSetDebug(java.lang.Boolean Enable) {
    try {
      Javonet.getType("LlCore").invoke("LsSetDebug", Enable);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static java.lang.Integer LsConversionJobOpen(
      java.lang.Integer hWndParent, java.lang.Integer nLanguage, java.lang.String pszFormat) {
    try {
      java.lang.Integer res =
          Javonet.getType("LlCore").invoke("LsConversionJobOpen", hWndParent, nLanguage, pszFormat);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public static void LsConversionJobClose(java.lang.Integer hCnvJob) {
    try {
      Javonet.getType("LlCore").invoke("LsConversionJobClose", hCnvJob);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void LsConversionSetOptionString(
      java.lang.Integer hCnvJob, java.lang.String pszKey, java.lang.String pszData) {
    try {
      Javonet.getType("LlCore").invoke("LsConversionSetOptionString", hCnvJob, pszKey, pszData);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void LsConversionConvertEmfToFile(
      java.lang.Integer hCnvJob, java.lang.Integer hEMF, java.lang.String pszFilename) {
    try {
      Javonet.getType("LlCore").invoke("LsConversionConvertEmfToFile", hCnvJob, hEMF, pszFilename);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Integer LlEnumGetFirstVar(LlFieldType fieldType) {
    try {
      java.lang.Integer res =
          javonetHandle.invoke("LlEnumGetFirstVar", NEnum.fromJavaEnum(fieldType));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer LlEnumGetFirstField(LlFieldType fieldType) {
    try {
      java.lang.Integer res =
          javonetHandle.invoke("LlEnumGetFirstField", NEnum.fromJavaEnum(fieldType));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer LlEnumGetNextEntry(java.lang.Integer position, LlFieldType fieldType) {
    try {
      java.lang.Integer res =
          javonetHandle.invoke("LlEnumGetNextEntry", position, NEnum.fromJavaEnum(fieldType));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public void LlEnumGetEntry(
      java.lang.Integer position,
      AtomicReference<java.lang.String> name,
      AtomicReference<java.lang.String> value,
      AtomicReference<java.lang.Integer> handle,
      LlFieldType fieldType) {
    try {
      javonetHandle.invoke(
          "LlEnumGetEntry",
          position,
          new NRef(name),
          new NRef(value),
          new NRef(handle),
          NEnum.fromJavaEnum(fieldType));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlPrintResetObjectStates() {
    try {
      javonetHandle.invoke("LlPrintResetObjectStates");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlXSetParameter(
      LlExtensionType extensionType,
      java.lang.String extensionName,
      java.lang.String name,
      java.lang.String value) {
    try {
      javonetHandle.invoke(
          "LlXSetParameter", NEnum.fromJavaEnum(extensionType), extensionName, name, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.String LlXGetParameter(
      LlExtensionType extensionType, java.lang.String extensionName, java.lang.String name) {
    try {
      java.lang.String res =
          javonetHandle.invoke(
              "LlXGetParameter", NEnum.fromJavaEnum(extensionType), extensionName, name);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public void LlPrintResetProjectState() {
    try {
      javonetHandle.invoke("LlPrintResetProjectState");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlDefineChartFieldStart() {
    try {
      javonetHandle.invoke("LlDefineChartFieldStart");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlDefineChartFieldExt(
      java.lang.String name, java.lang.String value, LlFieldType fieldType) {
    try {
      javonetHandle.invoke("LlDefineChartFieldExt", name, value, NEnum.fromJavaEnum(fieldType));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlPrintDeclareChartRow(LlDeclareChartRow flags) {
    try {
      javonetHandle.invoke("LlPrintDeclareChartRow", NEnum.fromJavaEnum(flags));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Integer LlPrintGetChartObjectCount(LlGetChartObjectCount type) {
    try {
      java.lang.Integer res =
          javonetHandle.invoke("LlPrintGetChartObjectCount", NEnum.fromJavaEnum(type));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Boolean LlPrintIsChartFieldUsed(java.lang.String name) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("LlPrintIsChartFieldUsed", name);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.String LlGetChartFieldContents(java.lang.String name) {
    try {
      java.lang.String res = javonetHandle.invoke("LlGetChartFieldContents", name);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.Integer LlEnumGetFirstChartField(java.lang.Integer flags) {
    try {
      java.lang.Integer res = javonetHandle.invoke("LlEnumGetFirstChartField", flags);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public void LlSetPrinterInPrinterFile(
      LlProject projectType, java.lang.String projectFile, java.lang.String printerName) {
    try {
      javonetHandle.invoke(
          "LlSetPrinterInPrinterFile", NEnum.fromJavaEnum(projectType), projectFile, printerName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlSetPrinterInPrinterFile(
      LlProject projectType,
      java.lang.String projectFile,
      java.lang.String printerName,
      LlSetPrinterInPrinterFileModes modes) {
    try {
      javonetHandle.invoke(
          "LlSetPrinterInPrinterFile",
          NEnum.fromJavaEnum(projectType),
          projectFile,
          printerName,
          NEnum.fromJavaEnum(modes));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlSetPrinterInPrinterFile(
      LlProject projectType,
      java.lang.String projectFile,
      LlPrinterIndex printerIndex,
      java.lang.String printerName) {
    try {
      javonetHandle.invoke(
          "LlSetPrinterInPrinterFile",
          NEnum.fromJavaEnum(projectType),
          projectFile,
          NEnum.fromJavaEnum(printerIndex),
          printerName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlSetPrinterInPrinterFile(
      LlProject projectType,
      java.lang.String projectFile,
      LlPrinterIndex printerIndex,
      java.lang.String printerName,
      LlSetPrinterInPrinterFileModes modes) {
    try {
      javonetHandle.invoke(
          "LlSetPrinterInPrinterFile",
          NEnum.fromJavaEnum(projectType),
          projectFile,
          NEnum.fromJavaEnum(printerIndex),
          printerName,
          NEnum.fromJavaEnum(modes));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlSetPrinterInPrinterStream(
      LlProject projectType, PrinterSettings printerSettings, Stream outputStream) {
    try {
      javonetHandle.invoke(
          "LlSetPrinterInPrinterStream",
          NEnum.fromJavaEnum(projectType),
          printerSettings,
          outputStream);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlSetPrinterInPrinterFile(
      LlProject projectType, java.lang.String projectFile, PrinterSettings printerSettings) {
    try {
      javonetHandle.invoke(
          "LlSetPrinterInPrinterFile",
          NEnum.fromJavaEnum(projectType),
          projectFile,
          printerSettings);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlSetPrinterInPrinterFile(
      LlProject projectType,
      java.lang.String projectFile,
      PrinterSettings printerSettings,
      PageSettings pageSettings) {
    try {
      javonetHandle.invoke(
          "LlSetPrinterInPrinterFile",
          NEnum.fromJavaEnum(projectType),
          projectFile,
          printerSettings,
          pageSettings);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlSetPrinterInPrinterFile(
      LlProject projectType,
      java.lang.String projectFile,
      LlPrinterIndex printerIndex,
      PrinterSettings printerSettings) {
    try {
      javonetHandle.invoke(
          "LlSetPrinterInPrinterFile",
          NEnum.fromJavaEnum(projectType),
          projectFile,
          NEnum.fromJavaEnum(printerIndex),
          printerSettings);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static DEVMODE LlGetDefaultPrinter(AtomicReference<java.lang.String> printerName) {
    try {
      Object res = Javonet.getType("LlCore").invoke("LlGetDefaultPrinter", new NRef(printerName));
      if (res == null) return null;
      return new DEVMODE((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public DEVMODE LlGetPrinterFromPrinterStream(
      LlProject projectType, Stream printerStream, LlPrinterIndex printerIndex) {
    try {
      Object res =
          javonetHandle.invoke(
              "LlGetPrinterFromPrinterStream",
              NEnum.fromJavaEnum(projectType),
              printerStream,
              NEnum.fromJavaEnum(printerIndex));
      if (res == null) return null;
      return new DEVMODE((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public DEVMODE LlGetPrinterFromPrinterFile(
      LlProject projectType, java.lang.String projectFile, LlPrinterIndex printerIndex) {
    try {
      Object res =
          javonetHandle.invoke(
              "LlGetPrinterFromPrinterFile",
              NEnum.fromJavaEnum(projectType),
              projectFile,
              NEnum.fromJavaEnum(printerIndex));
      if (res == null) return null;
      return new DEVMODE((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void LlSetPrinterInPrinterFile(
      LlProject projectType,
      java.lang.String projectFile,
      LlPrinterIndex printerIndex,
      PrinterSettings printerSettings,
      PageSettings pageSettings) {
    try {
      javonetHandle.invoke(
          "LlSetPrinterInPrinterFile",
          NEnum.fromJavaEnum(projectType),
          projectFile,
          NEnum.fromJavaEnum(printerIndex),
          printerSettings,
          pageSettings);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlSetPrinterInPrinterFileHelper(
      LlProject projectType,
      java.lang.String projectFile,
      LlPrinterIndex printerIndex,
      PrinterSettings printerSettings,
      PageSettings pageSettings) {
    try {
      javonetHandle.invoke(
          "LlSetPrinterInPrinterFileHelper",
          NEnum.fromJavaEnum(projectType),
          projectFile,
          NEnum.fromJavaEnum(printerIndex),
          printerSettings,
          pageSettings);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlSetNotificationCallback(LlCallbackHandler callback) {
    try {
      javonetHandle.invoke("LlSetNotificationCallback", callback);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Integer LlRTFCreateObject() {
    try {
      java.lang.Integer res = javonetHandle.invoke("LlRTFCreateObject");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public void LlRTFDeleteObject(java.lang.Integer objectInstance) {
    try {
      javonetHandle.invoke("LlRTFDeleteObject", objectInstance);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlRTFSetText(java.lang.Integer objectInstance, java.lang.String text) {
    try {
      javonetHandle.invoke("LlRTFSetText", objectInstance, text);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.String LlRTFGetText(
      java.lang.Integer objectInstance, LlRTFTextMode textMode, LlRTFContentMode contentMode) {
    try {
      java.lang.String res =
          javonetHandle.invoke(
              "LlRTFGetText",
              objectInstance,
              NEnum.fromJavaEnum(textMode),
              NEnum.fromJavaEnum(contentMode));
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.String LlRTFGetText(java.lang.Integer objectInstance, java.lang.Integer flags) {
    try {
      java.lang.String res = javonetHandle.invoke("LlRTFGetText", objectInstance, flags);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.Integer LlRTFEditObject(
      java.lang.Integer objectInstance,
      java.lang.Integer windowHandle,
      java.lang.Integer hDC,
      LlProject projectType,
      java.lang.Boolean modal) {
    try {
      java.lang.Integer res =
          javonetHandle.invoke(
              "LlRTFEditObject",
              objectInstance,
              windowHandle,
              hDC,
              NEnum.fromJavaEnum(projectType),
              modal);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public void LlRTFCopyToClipboard(java.lang.Integer objectInstance) {
    try {
      javonetHandle.invoke("LlRTFCopyToClipboard", objectInstance);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlRTFDisplay(
      java.lang.Integer objectInstance,
      java.lang.Integer hDC,
      RECT rect,
      java.lang.Boolean restart,
      java.lang.Integer state) {
    try {
      javonetHandle.invoke("LlRTFDisplay", objectInstance, hDC, rect, restart, state);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlRTFEditorProhibitAction(
      java.lang.Integer objectInstance, java.lang.Integer controlID) {
    try {
      javonetHandle.invoke("LlRTFEditorProhibitAction", objectInstance, controlID);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Integer LlRTFEditorInvokeAction(
      java.lang.Integer objectInstance, java.lang.Integer controlID) {
    try {
      java.lang.Integer res =
          javonetHandle.invoke("LlRTFEditorInvokeAction", objectInstance, controlID);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public void LlRTFEditorProhibitAction(
      java.lang.Integer objectInstance, LlRTFEditorAction action) {
    try {
      javonetHandle.invoke("LlRTFEditorProhibitAction", objectInstance, NEnum.fromJavaEnum(action));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Integer LlPrintGetRemainingSpacePerTable(
      java.lang.String fieldName, java.lang.Integer dimension) {
    try {
      java.lang.Integer res =
          javonetHandle.invoke("LlPrintGetRemainingSpacePerTable", fieldName, dimension);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public void LlDbAddTable(java.lang.String tableName) {
    try {
      javonetHandle.invoke("LlDbAddTable", tableName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlDbAddTable(java.lang.String tableName, LlTableOptions options) {
    try {
      javonetHandle.invoke("LlDbAddTable", tableName, NEnum.fromJavaEnum(options));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlDbSetMasterTable(java.lang.String tableName) {
    try {
      javonetHandle.invoke("LlDbSetMasterTable", tableName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlDbAddTableRelation(
      java.lang.String tableName,
      java.lang.String parentTableName,
      java.lang.String relationName,
      java.lang.String keyFieldName,
      java.lang.String parentKeyFieldName) {
    try {
      javonetHandle.invoke(
          "LlDbAddTableRelation",
          tableName,
          parentTableName,
          relationName,
          keyFieldName,
          parentKeyFieldName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlDbAddTableRelation(
      java.lang.String tableName, java.lang.String parentTableName, java.lang.String relationName) {
    try {
      javonetHandle.invoke("LlDbAddTableRelation", tableName, parentTableName, relationName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlDbAddTableSortOrder(java.lang.String tableName, java.lang.String sortOrderName) {
    try {
      javonetHandle.invoke("LlDbAddTableSortOrder", tableName, sortOrderName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.String LlPrintDbGetCurrentTable(java.lang.Boolean CompletePath) {
    try {
      java.lang.String res = javonetHandle.invoke("LlPrintDbGetCurrentTable", CompletePath);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public void LlPrintDbGetCurrentTableFilter(Object filter, Object parameters) {
    try {
      javonetHandle.invoke("LlPrintDbGetCurrentTableFilter", filter, parameters);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.String LlPrintDbGetCurrentTable() {
    try {
      java.lang.String res = javonetHandle.invoke("LlPrintDbGetCurrentTable");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.String LlPrintDbGetCurrentTableRelation() {
    try {
      java.lang.String res = javonetHandle.invoke("LlPrintDbGetCurrentTableRelation");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.String LlPrintDbGetCurrentTableSortOrder() {
    try {
      java.lang.String res = javonetHandle.invoke("LlPrintDbGetCurrentTableSortOrder");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.Integer LlPrintDbGetRootTableCount() {
    try {
      java.lang.Integer res = javonetHandle.invoke("LlPrintDbGetRootTableCount");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public List<java.lang.String> LlGetUsedIdentifiers(java.lang.String projectFile) {
    try {
      Object res = javonetHandle.invoke("LlGetUsedIdentifiers", projectFile);
      if (res == null) return null;
      return new List<java.lang.String>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public List<java.lang.String> LlGetUsedIdentifiers(
      java.lang.String projectFile, LlIdentifierType identifierType) {
    try {
      Object res =
          javonetHandle.invoke(
              "LlGetUsedIdentifiers", projectFile, NEnum.fromJavaEnum(identifierType));
      if (res == null) return null;
      return new List<java.lang.String>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void LlDlgEditLine(
      java.lang.Integer handle,
      AtomicReference<java.lang.String> formulaText,
      LlFieldType returnType,
      java.lang.String title,
      java.lang.Boolean useFields) {
    try {
      javonetHandle.invoke(
          "LlDlgEditLine",
          handle,
          new NRef(formulaText),
          NEnum.fromJavaEnum(returnType),
          title,
          useFields);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlDlgEditLine(
      java.lang.Integer handle,
      AtomicReference<java.lang.String> formulaText,
      java.lang.Integer returnType,
      java.lang.String title,
      java.lang.Boolean useFields) {
    try {
      javonetHandle.invoke(
          "LlDlgEditLine", handle, new NRef(formulaText), returnType, title, useFields);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Integer LlProjectOpen(
      LlProject projectType, Stream projectStream, java.lang.Integer flags) {
    try {
      java.lang.Integer res =
          javonetHandle.invoke(
              "LlProjectOpen", NEnum.fromJavaEnum(projectType), projectStream, flags);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
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

  public static void LlSetDebug(LlDebug onOff) {
    try {
      Javonet.getType("LlCore").invoke("LlSetDebug", NEnum.fromJavaEnum(onOff));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static java.lang.Integer LlGetVersion(LlVersion cmd) {
    try {
      java.lang.Integer res =
          Javonet.getType("LlCore").invoke("LlGetVersion", NEnum.fromJavaEnum(cmd));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public void LlDefineField(java.lang.String name, java.lang.String value) {
    try {
      javonetHandle.invoke("LlDefineField", name, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlDefineFieldExt(java.lang.String name, java.lang.String value, LlFieldType lPara) {
    try {
      javonetHandle.invoke("LlDefineFieldExt", name, value, NEnum.fromJavaEnum(lPara));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlDefineFieldExtHandle(
      java.lang.String name, java.lang.Integer value, LlFieldType lPara) {
    try {
      javonetHandle.invoke("LlDefineFieldExtHandle", name, value, NEnum.fromJavaEnum(lPara));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlDefineFieldStart() {
    try {
      javonetHandle.invoke("LlDefineFieldStart");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlDefineVariable(java.lang.String name, java.lang.String value) {
    try {
      javonetHandle.invoke("LlDefineVariable", name, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlDefineVariableExt(
      java.lang.String name, java.lang.String value, LlFieldType lPara) {
    try {
      javonetHandle.invoke("LlDefineVariableExt", name, value, NEnum.fromJavaEnum(lPara));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlDefineVariableExtHandle(
      java.lang.String name, java.lang.Integer value, LlFieldType lPara) {
    try {
      javonetHandle.invoke("LlDefineVariableExtHandle", name, value, NEnum.fromJavaEnum(lPara));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlDefineVariableStart() {
    try {
      javonetHandle.invoke("LlDefineVariableStart");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlDefineSumVariable(java.lang.String name, java.lang.String value) {
    try {
      javonetHandle.invoke("LlDefineSumVariable", name, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlDefineLayout(
      java.lang.Integer windowHandle,
      java.lang.String title,
      LlProject projectType,
      java.lang.String projectFile) {
    try {
      javonetHandle.invoke(
          "LlDefineLayout", windowHandle, title, NEnum.fromJavaEnum(projectType), projectFile);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlPreviewSetTempPath(java.lang.String path) {
    try {
      javonetHandle.invoke("LlPreviewSetTempPath", path);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlPreviewDeleteFiles(java.lang.String projectFile, java.lang.String path) {
    try {
      javonetHandle.invoke("LlPreviewDeleteFiles", projectFile, path);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlPreviewDisplay(
      java.lang.String projectFile, java.lang.String path, java.lang.Integer windowHandle) {
    try {
      javonetHandle.invoke("LlPreviewDisplay", projectFile, path, windowHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlPreviewDisplayEx(
      java.lang.String projectFile,
      java.lang.String path,
      java.lang.Integer windowHandle,
      java.lang.Integer nOptions,
      java.lang.Integer pOptions) {
    try {
      javonetHandle.invoke(
          "LlPreviewDisplayEx", projectFile, path, windowHandle, nOptions, pOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Boolean LlPrint() {
    try {
      java.lang.Boolean res = javonetHandle.invoke("LlPrint");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public void LlPrintAbort() {
    try {
      javonetHandle.invoke("LlPrintAbort");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Boolean LlPrintCheckLineFit() {
    try {
      java.lang.Boolean res = javonetHandle.invoke("LlPrintCheckLineFit");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public void LlPrintEnd() {
    try {
      javonetHandle.invoke("LlPrintEnd");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlPrintEnd(java.lang.Integer pages) {
    try {
      javonetHandle.invoke("LlPrintEnd", pages);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Integer LlPrintFields() {
    try {
      java.lang.Integer res = javonetHandle.invoke("LlPrintFields");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer LlPrintFieldsEnd() {
    try {
      java.lang.Integer res = javonetHandle.invoke("LlPrintFieldsEnd");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer LlPrintGetCurrentPage() {
    try {
      java.lang.Integer res = javonetHandle.invoke("LlPrintGetCurrentPage");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer LlPrintGetItemsPerPage() {
    try {
      java.lang.Integer res = javonetHandle.invoke("LlPrintGetItemsPerPage");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer LlPrintGetItemsPerTable() {
    try {
      java.lang.Integer res = javonetHandle.invoke("LlPrintGetItemsPerTable");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer LlPrintGetRemainingItemsPerTable(java.lang.String field) {
    try {
      java.lang.Integer res = javonetHandle.invoke("LlPrintGetRemainingItemsPerTable", field);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer LlPrintGetOption(LlPrintOption option) {
    try {
      java.lang.Integer res = javonetHandle.invoke("LlPrintGetOption", NEnum.fromJavaEnum(option));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public void LlPrintGetPrinterInfo(
      AtomicReference<java.lang.String> printerName,
      AtomicReference<java.lang.String> printerPort) {
    try {
      javonetHandle.invoke("LlPrintGetPrinterInfo", new NRef(printerName), new NRef(printerPort));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlPrintOptionsDialog(java.lang.Integer windowHandle, java.lang.String text) {
    try {
      javonetHandle.invoke("LlPrintOptionsDialog", windowHandle, text);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlPrintSelectOffsetEx(java.lang.Integer windowHandle) {
    try {
      javonetHandle.invoke("LlPrintSelectOffsetEx", windowHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlPrintSetBoxText(java.lang.String text, java.lang.Integer progressPercentage) {
    try {
      javonetHandle.invoke("LlPrintSetBoxText", text, progressPercentage);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlPrintSetOption(LlPrintOption option, java.lang.Integer value) {
    try {
      javonetHandle.invoke("LlPrintSetOption", NEnum.fromJavaEnum(option), value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlPrintSetOption(java.lang.Integer option, java.lang.Integer value) {
    try {
      javonetHandle.invoke("LlPrintSetOption", option, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlPrintUpdateBox() {
    try {
      javonetHandle.invoke("LlPrintUpdateBox");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlPrintStart(
      LlProject projectType, java.lang.String projectFile, LlPrintMode printMode) {
    try {
      javonetHandle.invoke(
          "LlPrintStart",
          NEnum.fromJavaEnum(projectType),
          projectFile,
          NEnum.fromJavaEnum(printMode));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlPrintWithBoxStart(
      LlProject projectType,
      java.lang.String projectFile,
      LlPrintMode printMode,
      LlBoxType boxType,
      java.lang.Integer windowHandle,
      java.lang.String title) {
    try {
      javonetHandle.invoke(
          "LlPrintWithBoxStart",
          NEnum.fromJavaEnum(projectType),
          projectFile,
          NEnum.fromJavaEnum(printMode),
          NEnum.fromJavaEnum(boxType),
          windowHandle,
          title);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlPrinterSetup(
      java.lang.Integer windowHandle, LlProject projectType, java.lang.String projectFile) {
    try {
      javonetHandle.invoke(
          "LlPrinterSetup", windowHandle, NEnum.fromJavaEnum(projectType), projectFile);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlSelectFileDlgTitleEx(
      java.lang.Integer windowHandle,
      java.lang.String title,
      LlProject projectType,
      AtomicReference<java.lang.String> projectFile) {
    try {
      javonetHandle.invoke(
          "LlSelectFileDlgTitleEx",
          windowHandle,
          title,
          NEnum.fromJavaEnum(projectType),
          new NRef(projectFile));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void LlSetDlgboxMode(java.lang.Integer mode) {
    try {
      Javonet.getType("LlCore").invoke("LlSetDlgboxMode", mode);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static java.lang.Integer LlGetDlgboxMode() {
    try {
      java.lang.Integer res = Javonet.getType("LlCore").invoke("LlGetDlgboxMode");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer LlExprParse(
      java.lang.String expression, java.lang.Boolean includeFields) {
    try {
      java.lang.Integer res = javonetHandle.invoke("LlExprParse", expression, includeFields);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public LlExprType LlExprType(java.lang.Integer hExpression) {
    try {
      Object res = javonetHandle.invoke("LlExprType", hExpression);
      if (res == null) return null;
      return LlExprType.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.String LlExprError() {
    try {
      java.lang.String res = javonetHandle.invoke("LlExprError");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public void LlExprFree(java.lang.Integer hExpression) {
    try {
      javonetHandle.invoke("LlExprFree", hExpression);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.String LlExprEvaluate(java.lang.Integer hExpression) {
    try {
      java.lang.String res = javonetHandle.invoke("LlExprEvaluate", hExpression);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public ReadOnlyCollection<java.lang.String> LlExprGetUsedVars(
      java.lang.String expression, java.lang.Boolean originalName) {
    try {
      Object res = javonetHandle.invoke("LlExprGetUsedVars", expression, originalName);
      if (res == null) return null;
      return new ReadOnlyCollection<java.lang.String>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Object LlExprEvaluateVar(java.lang.Integer hExpression) {
    try {
      Object res = javonetHandle.invoke("LlExprEvaluateVar", hExpression);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void LlSetOption(java.lang.Integer option, java.lang.Integer value) {
    try {
      javonetHandle.invoke("LlSetOption", option, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlSetPreviewOption(java.lang.Integer option, java.lang.Integer value) {
    try {
      javonetHandle.invoke("LlSetPreviewOption", option, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlSetOption(LlOption option, java.lang.Integer value) {
    try {
      javonetHandle.invoke("LlSetOption", NEnum.fromJavaEnum(option), value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Integer LlGetOption(java.lang.Integer option) {
    try {
      java.lang.Integer res = javonetHandle.invoke("LlGetOption", option);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.String LoadString(java.lang.Integer ressourceId) {
    try {
      java.lang.String res = javonetHandle.invoke("LoadString", ressourceId);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.Integer LlGetPreviewOption(java.lang.Integer option) {
    try {
      java.lang.Integer res = javonetHandle.invoke("LlGetPreviewOption", option);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer LlGetOption(LlOption option) {
    try {
      java.lang.Integer res = javonetHandle.invoke("LlGetOption", NEnum.fromJavaEnum(option));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public void LlSetOptionString(LlOptionString option, java.lang.String value) {
    try {
      javonetHandle.invoke("LlSetOptionString", NEnum.fromJavaEnum(option), value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlSetOptionString(java.lang.Integer option, java.lang.String value) {
    try {
      javonetHandle.invoke("LlSetOptionString", option, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.String LlGetOptionString(LlOptionString option) {
    try {
      java.lang.String res = javonetHandle.invoke("LlGetOptionString", NEnum.fromJavaEnum(option));
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.String LlGetOptionString(java.lang.Integer option) {
    try {
      java.lang.String res = javonetHandle.invoke("LlGetOptionString", option);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public void LlPrintSetOptionString(LlPrintOptionString option, java.lang.String value) {
    try {
      javonetHandle.invoke("LlPrintSetOptionString", NEnum.fromJavaEnum(option), value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlPrintSetOptionString(java.lang.Integer option, java.lang.String value) {
    try {
      javonetHandle.invoke("LlPrintSetOptionString", option, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.String LlPrintGetOptionString(LlPrintOptionString option) {
    try {
      java.lang.String res =
          javonetHandle.invoke("LlPrintGetOptionString", NEnum.fromJavaEnum(option));
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.String LlPrintGetOptionString(java.lang.Integer option) {
    try {
      java.lang.String res = javonetHandle.invoke("LlPrintGetOptionString", option);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public void LlPrintEnableObject(java.lang.Boolean enable) {
    try {
      javonetHandle.invoke("LlPrintEnableObject", enable);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlPrintEnableObject(java.lang.String objectName, java.lang.Boolean enable) {
    try {
      javonetHandle.invoke("LlPrintEnableObject", objectName, enable);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlSetFileExtensions(
      LlProject projectType,
      java.lang.String projectFileExtension,
      java.lang.String printerFileExtension,
      java.lang.String sketchFileExtension) {
    try {
      javonetHandle.invoke(
          "LlSetFileExtensions",
          NEnum.fromJavaEnum(projectType),
          projectFileExtension,
          printerFileExtension,
          sketchFileExtension);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Boolean LlPrintIsVariableUsed(java.lang.String name) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("LlPrintIsVariableUsed", name);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Boolean LlPrintIsFieldUsed(java.lang.String name) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("LlPrintIsFieldUsed", name);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public void LlPrintOptionsDialogTitle(
      java.lang.Integer windowHandle, java.lang.String title, java.lang.String text) {
    try {
      javonetHandle.invoke("LlPrintOptionsDialogTitle", windowHandle, title, text);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LlSetPrinterToDefault(LlProject projectType, java.lang.String projectFile) {
    try {
      javonetHandle.invoke("LlSetPrinterToDefault", NEnum.fromJavaEnum(projectType), projectFile);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Event */

  private java.util.ArrayList<DrilldownJobHandler> _DrilldownJobListeners =
      new java.util.ArrayList<DrilldownJobHandler>();

  public void addDrilldownJob(DrilldownJobHandler toAdd) {
    _DrilldownJobListeners.add(toAdd);
  }

  public void removeDrilldownJob(DrilldownJobHandler toRemove) {
    _DrilldownJobListeners.remove(toRemove);
  }

  public enum ProcessType {
    unknown(0L),
    pt32Bit(1L),
    pt64Bit(2L),
    ;
    private long numVal;

    ProcessType(long numVal) {
      this.numVal = numVal;
    }

    public long getNumVal() {
      return numVal;
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
