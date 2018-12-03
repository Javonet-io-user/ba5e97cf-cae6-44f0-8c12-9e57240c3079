package combit.ListLabel24.DataProviders;

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
import combit.ListLabel24.DataProviders.*;

public class ODataTableRelation implements ITableRelation {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setRelationName(java.lang.String value) {
    try {
      javonetHandle.set("RelationName", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getRelationName() {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DataProviders.ITableRelation")
              .invoke("RelationName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getParentColumnName() {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DataProviders.ITableRelation")
              .invoke("ParentColumnName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getChildColumnName() {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DataProviders.ITableRelation")
              .invoke("ChildColumnName");
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
      java.lang.String res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DataProviders.ITableRelation")
              .invoke("ParentTableName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getChildTableName() {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DataProviders.ITableRelation")
              .invoke("ChildTableName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public ODataTableRelation(
      java.lang.String relationName,
      java.lang.String parentTableName,
      java.lang.String childTableName,
      java.lang.String parentColumnName,
      java.lang.String childColumnName) {
    try {
      javonetHandle =
          Javonet.New(
              "combit.ListLabel24.DataProviders.ODataTableRelation",
              relationName,
              parentTableName,
              childTableName,
              parentColumnName,
              childColumnName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ODataTableRelation(NObject handle) {
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
