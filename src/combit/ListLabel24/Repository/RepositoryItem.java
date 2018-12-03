package combit.ListLabel24.Repository;

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
import combit.ListLabel24.Repository.*;
import jio.System.*;

public class RepositoryItem {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setInternalID(java.lang.String value) {
    try {
      javonetHandle.set("InternalID", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getInternalID() {
    try {
      java.lang.String res = javonetHandle.get("InternalID");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setDescriptor(java.lang.String value) {
    try {
      javonetHandle.set("Descriptor", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getDescriptor() {
    try {
      java.lang.String res = javonetHandle.get("Descriptor");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setType(java.lang.String value) {
    try {
      javonetHandle.set("Type", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getType() {
    try {
      java.lang.String res = javonetHandle.get("Type");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setLastModificationUTC(DateTime value) {
    try {
      javonetHandle.set("LastModificationUTC", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public DateTime getLastModificationUTC() {
    try {
      Object res = javonetHandle.<NObject>get("LastModificationUTC");
      if (res == null) return null;
      return new DateTime((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setIsEmpty(java.lang.Boolean value) {
    try {
      javonetHandle.set("IsEmpty", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getIsEmpty() {
    try {
      java.lang.Boolean res = javonetHandle.get("IsEmpty");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetFiled */

  public static java.lang.Integer getMAXIMUM_TYPE_LENGTH() {
    try {
      java.lang.Integer res = Javonet.getType("RepositoryItem").get("MAXIMUM_TYPE_LENGTH");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setMAXIMUM_TYPE_LENGTH(java.lang.Integer param) {
    try {
      Javonet.getType("RepositoryItem").set("MAXIMUM_TYPE_LENGTH", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RepositoryItem(
      java.lang.String internalID,
      java.lang.String descriptor,
      java.lang.String type,
      DateTime lastModificationUTC) {
    try {
      javonetHandle =
          Javonet.New(
              "combit.ListLabel24.Repository.RepositoryItem",
              internalID,
              descriptor,
              type,
              lastModificationUTC);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RepositoryItem(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public static java.lang.Boolean IsValidItemId(java.lang.String repoId) {
    try {
      java.lang.Boolean res = Javonet.getType("RepositoryItem").invoke("IsValidItemId", repoId);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.String ExtractDisplayName(java.lang.Integer lcid) {
    try {
      java.lang.String res = javonetHandle.invoke("ExtractDisplayName", lcid);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
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
