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
import jio.System.Collections.Specialized.*;
import jio.System.Collections.ObjectModel.*;

public class ListLabelDesignerWorkspace {
  protected NObject javonetHandle;
  /** GetProperty */
  public DesignerLanguages getDesignerLanguages() {
    try {
      Object res = javonetHandle.<NObject>get("DesignerLanguages");
      if (res == null) return null;
      return new DesignerLanguages((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setProjectName(java.lang.String value) {
    try {
      javonetHandle.set("ProjectName", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getProjectName() {
    try {
      java.lang.String res = javonetHandle.get("ProjectName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setCaption(java.lang.String value) {
    try {
      javonetHandle.set("Caption", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getCaption() {
    try {
      java.lang.String res = javonetHandle.get("Caption");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public StringCollection getProhibitedFunctions() {
    try {
      Object res = javonetHandle.<NObject>get("ProhibitedFunctions");
      if (res == null) return null;
      return new StringCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public StringCollection getReadOnlyObjects() {
    try {
      Object res = javonetHandle.<NObject>get("ReadOnlyObjects");
      if (res == null) return null;
      return new StringCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public Collection<LlDesignerAction> getProhibitedActions() {
    try {
      Object res = javonetHandle.<NObject>get("ProhibitedActions");
      if (res == null) return null;
      return new Collection<LlDesignerAction>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public ListLabelDesignerWorkspace(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void InvokeAction(LlDesignerAction action) {
    try {
      javonetHandle.invoke("InvokeAction", NEnum.fromJavaEnum(action));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void InvokeAction(java.lang.Integer menuId) {
    try {
      javonetHandle.invoke("InvokeAction", menuId);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Refresh() {
    try {
      javonetHandle.invoke("Refresh");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Boolean Open(
      java.lang.String projectFile,
      LlDesignerWorkspaceFileMode fileMode,
      LlDesignerWorkspaceSaveMode saveMode) {
    try {
      java.lang.Boolean res =
          javonetHandle.invoke(
              "Open", projectFile, NEnum.fromJavaEnum(fileMode), NEnum.fromJavaEnum(saveMode));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public void Save() {
    try {
      javonetHandle.invoke("Save");
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
