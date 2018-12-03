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
import jio.System.Runtime.Serialization.*;
import jio.System.Collections.ObjectModel.*;
import jio.System.Data.OleDb.*;
import jio.System.*;
import combit.ListLabel24.*;

public class OleDbConnectionDataProvider extends DbConnectionDataProvider
    implements IDataProvider,
        ICanHandleUsedIdentifiers,
        ISerializable,
        IDisposable,
        ISupportsLogger,
        IFileList {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setSupportsAdvancedFilteringAsOleDbConnectionDataProvider(java.lang.Boolean value) {
    try {
      javonetHandle.set("SupportsAdvancedFiltering", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getSupportsAdvancedFilteringAsOleDbConnectionDataProvider() {
    try {
      java.lang.Boolean res = javonetHandle.get("SupportsAdvancedFiltering");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setSupportedElementTypes(DbConnectionElementTypes value) {
    try {
      javonetHandle.set("SupportedElementTypes", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public DbConnectionElementTypes getSupportedElementTypes() {
    try {
      Object res = javonetHandle.<NEnum>get("SupportedElementTypes");
      if (res == null) return null;
      return DbConnectionElementTypes.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setIdentifierDelimiterFormat(java.lang.String value) {
    try {
      javonetHandle.set("IdentifierDelimiterFormat", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getIdentifierDelimiterFormat() {
    try {
      java.lang.String res = javonetHandle.get("IdentifierDelimiterFormat");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setConnection(OleDbConnection value) {
    try {
      javonetHandle.set("Connection", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public OleDbConnection getConnection() {
    try {
      Object res = javonetHandle.<NObject>get("Connection");
      if (res == null) return null;
      return new OleDbConnection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setUseMsAccessSqlSyntax(java.lang.Boolean value) {
    try {
      javonetHandle.set("UseMsAccessSqlSyntax", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getUseMsAccessSqlSyntax() {
    try {
      java.lang.Boolean res = javonetHandle.get("UseMsAccessSqlSyntax");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public OleDbConnectionDataProvider() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.DataProviders.OleDbConnectionDataProvider");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public OleDbConnectionDataProvider(OleDbConnection connection) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("combit.ListLabel24.DataProviders.OleDbConnectionDataProvider", connection);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public OleDbConnectionDataProvider(
      OleDbConnection connection, java.lang.String identifierDelimiterFormat) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "combit.ListLabel24.DataProviders.OleDbConnectionDataProvider",
              connection,
              identifierDelimiterFormat);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public OleDbConnectionDataProvider(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void GetObjectData(SerializationInfo info, StreamingContext context) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Runtime.Serialization.ISerializable")
          .invoke("GetObjectData", info, context);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public ReadOnlyCollection<java.lang.String> GetFileList() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DataProviders.IFileList")
              .invoke("GetFileList");
      if (res == null) return null;
      return new ReadOnlyCollection<java.lang.String>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void SetFileList(ReadOnlyCollection<java.lang.String> fileList) {
    try {
      javonetHandle
          .explicitInterface("combit.ListLabel24.DataProviders.IFileList")
          .invoke("SetFileList", fileList);
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
