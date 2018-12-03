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

public class RepositoryItemDescriptor {
  protected NObject javonetHandle;
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

  public RepositoryItemDescriptor(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public static RepositoryItemDescriptor LoadFromDescriptorString(java.lang.String descriptor) {
    try {
      Object res =
          Javonet.getType("RepositoryItemDescriptor")
              .invoke("LoadFromDescriptorString", descriptor);
      if (res == null) return null;
      return new RepositoryItemDescriptor((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void SetUIName(java.lang.Integer lcid, java.lang.String name) {
    try {
      javonetHandle.invoke("SetUIName", lcid, name);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.String GetUIName(java.lang.Integer lcid) {
    try {
      java.lang.String res = javonetHandle.invoke("GetUIName", lcid);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public void ClearUINames() {
    try {
      javonetHandle.invoke("ClearUINames");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.String SerializeToString() {
    try {
      java.lang.String res = javonetHandle.invoke("SerializeToString");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.String GetParentId() {
    try {
      java.lang.String res = javonetHandle.invoke("GetParentId");
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
