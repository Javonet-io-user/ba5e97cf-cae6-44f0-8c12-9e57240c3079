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

public class CrossProviderTableRelation implements ICrossProviderTableRelation, ITableRelation {
  protected NObject javonetHandle;
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

  public IDataProvider getParentTableProvider() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DataProviders.ICrossProviderTableRelation")
              .invoke("ParentTableProvider");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public IDataProvider getChildTableProvider() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DataProviders.ICrossProviderTableRelation")
              .invoke("ChildTableProvider");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.Boolean getSupportsGetParentRow() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DataProviders.ICrossProviderTableRelation")
              .invoke("SupportsGetParentRow");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public CrossProviderTableRelation(
      java.lang.String relationName,
      IDataProvider parentProvider,
      java.lang.String parentTableName,
      java.lang.String parentColumnName,
      IDataProvider childProvider,
      java.lang.String childTableName,
      java.lang.String childColumnName) {
    try {
      javonetHandle =
          Javonet.New(
              "combit.ListLabel24.DataProviders.CrossProviderTableRelation",
              relationName,
              parentProvider,
              parentTableName,
              parentColumnName,
              childProvider,
              childTableName,
              childColumnName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CrossProviderTableRelation(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void InvalidateColumnsLayoutCache(java.lang.String tableName) {
    try {
      javonetHandle
          .explicitInterface("combit.ListLabel24.DataProviders.ICrossProviderTableRelation")
          .invoke("InvalidateColumnsLayoutCache", tableName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Boolean Matches1to1Identifier(java.lang.String identifier) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DataProviders.ICrossProviderTableRelation")
              .invoke("Matches1to1Identifier", identifier);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public ITable ResolveChildTable(ITableRow parentRow) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DataProviders.ICrossProviderTableRelation")
              .invoke("ResolveChildTable", parentRow);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public ITableRow ResolveParentRow(ITableRow childRow) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DataProviders.ICrossProviderTableRelation")
              .invoke("ResolveParentRow", childRow);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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
