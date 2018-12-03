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
import jio.System.Collections.ObjectModel.*;
import jio.System.Data.*;
import jio.System.*;

public class AdoDataProvider implements IDataProvider, IDisposable, ICanHandleUsedIdentifiers {
  protected NObject javonetHandle;

  public AdoDataProvider(DataView dataView) {
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.DataProviders.AdoDataProvider", dataView);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public AdoDataProvider(DataTable dataTable) {
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.DataProviders.AdoDataProvider", dataTable);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public AdoDataProvider(DataViewManager dataViewManager) {
    try {
      javonetHandle =
          Javonet.New("combit.ListLabel24.DataProviders.AdoDataProvider", dataViewManager);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public AdoDataProvider(DataSet dataSet) {
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.DataProviders.AdoDataProvider", dataSet);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public AdoDataProvider(NObject handle) {
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

  public void SetUsedIdentifiers(ReadOnlyCollection<java.lang.String> identifiers) {
    try {
      javonetHandle
          .explicitInterface("combit.ListLabel24.DataProviders.ICanHandleUsedIdentifiers")
          .invoke("SetUsedIdentifiers", identifiers);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Boolean get_SupportsAnyBaseTable() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DataProviders.IDataProvider")
              .invoke("get_SupportsAnyBaseTable");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public ReadOnlyCollection<ITable> get_Tables() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DataProviders.IDataProvider")
              .invoke("get_Tables");
      if (res == null) return null;
      return new ReadOnlyCollection<ITable>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public ReadOnlyCollection<ITableRelation> get_Relations() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DataProviders.IDataProvider")
              .invoke("get_Relations");
      if (res == null) return null;
      return new ReadOnlyCollection<ITableRelation>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public ITable GetTable(java.lang.String tableName) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DataProviders.IDataProvider")
              .invoke("GetTable", tableName);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public ITableRelation GetRelation(java.lang.String relationName) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DataProviders.IDataProvider")
              .invoke("GetRelation", relationName);
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
