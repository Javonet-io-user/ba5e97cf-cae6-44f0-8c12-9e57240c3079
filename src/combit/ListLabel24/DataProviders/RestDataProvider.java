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
import combit.ListLabel24.*;
import jio.System.Net.*;
import jio.System.Collections.ObjectModel.*;

public class RestDataProvider implements IDataProvider, ISupportsLogger, ISupportsParameters {
  protected NObject javonetHandle;
  /** GetProperty */
  public java.lang.String getUrl() {
    try {
      java.lang.String res = javonetHandle.get("Url");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setConnectionTimeout(java.lang.Integer value) {
    try {
      javonetHandle.set("ConnectionTimeout", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getConnectionTimeout() {
    try {
      java.lang.Integer res = javonetHandle.get("ConnectionTimeout");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setHeaders(WebHeaderCollection value) {
    try {
      javonetHandle.set("Headers", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public WebHeaderCollection getHeaders() {
    try {
      Object res = javonetHandle.<NObject>get("Headers");
      if (res == null) return null;
      return new WebHeaderCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetFiled */

  public static java.lang.Integer getdefaultTimeout() {
    try {
      java.lang.Integer res = Javonet.getType("RestDataProvider").get("defaultTimeout");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setdefaultTimeout(java.lang.Integer param) {
    try {
      Javonet.getType("RestDataProvider").set("defaultTimeout", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RestDataProvider(java.lang.String url) {
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.DataProviders.RestDataProvider", url);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RestDataProvider(
      java.lang.String url,
      java.lang.String username,
      java.lang.String password,
      java.lang.String domain) {
    try {
      javonetHandle =
          Javonet.New(
              "combit.ListLabel24.DataProviders.RestDataProvider", url, username, password, domain);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RestDataProvider(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void SetLogger(ILlLogger logger, java.lang.Boolean overrideExisting) {
    try {
      javonetHandle
          .explicitInterface("combit.ListLabel24.ISupportsLogger")
          .invoke("SetLogger", logger, overrideExisting);
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
  /** Method */

  public java.lang.Boolean get_IsParametrized() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DataProviders.ISupportsParameters")
              .invoke("get_IsParametrized");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public IParameterBinder get_ParameterBinder() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DataProviders.ISupportsParameters")
              .invoke("get_ParameterBinder");
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
