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
import jio.System.Data.*;
import jio.System.*;
import combit.ListLabel24.*;

public class SQLiteConnectionDataProvider extends DbConnectionDataProvider
    implements IDataProvider,
        ICanHandleUsedIdentifiers,
        ISerializable,
        IDisposable,
        ISupportsLogger {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setSupportsAdvancedFilteringAsSQLiteConnectionDataProvider(java.lang.Boolean value) {
    try {
      javonetHandle.set("SupportsAdvancedFiltering", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getSupportsAdvancedFilteringAsSQLiteConnectionDataProvider() {
    try {
      java.lang.Boolean res = javonetHandle.get("SupportsAdvancedFiltering");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public SQLiteConnectionDataProvider(IDbConnection connection) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("combit.ListLabel24.DataProviders.SQLiteConnectionDataProvider", connection);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SQLiteConnectionDataProvider(java.lang.String connectionString) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "combit.ListLabel24.DataProviders.SQLiteConnectionDataProvider", connectionString);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SQLiteConnectionDataProvider(NObject handle) {
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

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
