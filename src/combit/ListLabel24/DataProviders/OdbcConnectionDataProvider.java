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
import jio.System.Data.Odbc.*;
import jio.System.Runtime.Serialization.*;
import jio.System.*;
import combit.ListLabel24.*;

public class OdbcConnectionDataProvider extends DbConnectionDataProvider
    implements IDataProvider,
        ICanHandleUsedIdentifiers,
        ISerializable,
        IDisposable,
        ISupportsLogger {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setSupportsAdvancedFilteringAsOdbcConnectionDataProvider(java.lang.Boolean value) {
    try {
      javonetHandle.set("SupportsAdvancedFiltering", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getSupportsAdvancedFilteringAsOdbcConnectionDataProvider() {
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

  public void setPrefixTableNameWithSchema(java.lang.Boolean value) {
    try {
      javonetHandle.set("PrefixTableNameWithSchema", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getPrefixTableNameWithSchema() {
    try {
      java.lang.Boolean res = javonetHandle.get("PrefixTableNameWithSchema");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
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

  public void setDisableRelations(java.lang.Boolean value) {
    try {
      javonetHandle.set("DisableRelations", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getDisableRelations() {
    try {
      java.lang.Boolean res = javonetHandle.get("DisableRelations");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public OdbcConnectionDataProvider(OdbcConnection connection) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("combit.ListLabel24.DataProviders.OdbcConnectionDataProvider", connection);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "AddRelations",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<OdbcConnectionDataProvider.AddRelationEventArgs> handler :
                  _AddRelationsListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], OdbcConnectionDataProvider.AddRelationEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public OdbcConnectionDataProvider(
      OdbcConnection connection, java.lang.String identifierDelimiterFormat) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "combit.ListLabel24.DataProviders.OdbcConnectionDataProvider",
              connection,
              identifierDelimiterFormat);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "AddRelations",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<OdbcConnectionDataProvider.AddRelationEventArgs> handler :
                  _AddRelationsListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], OdbcConnectionDataProvider.AddRelationEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public OdbcConnectionDataProvider(NObject handle) {
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
  /** Event */

  private java.util.ArrayList<EventHandler<OdbcConnectionDataProvider.AddRelationEventArgs>>
      _AddRelationsListeners =
          new java.util.ArrayList<EventHandler<OdbcConnectionDataProvider.AddRelationEventArgs>>();

  public void addAddRelations(EventHandler<OdbcConnectionDataProvider.AddRelationEventArgs> toAdd) {
    _AddRelationsListeners.add(toAdd);
  }

  public void removeAddRelations(
      EventHandler<OdbcConnectionDataProvider.AddRelationEventArgs> toRemove) {
    _AddRelationsListeners.remove(toRemove);
  }

  public static class AddRelationEventArgs extends EventArgs {
    protected NObject javonetHandle;
    /** SetProperty */
    public void setProvider(DbCommandSetDataProvider value) {
      try {
        javonetHandle.set("Provider", value);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetProperty */

    public DbCommandSetDataProvider getProvider() {
      try {
        Object res = javonetHandle.<NObject>get("Provider");
        if (res == null) return null;
        return new DbCommandSetDataProvider((NObject) res);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }

    public AddRelationEventArgs() {
      super((NObject) null);
      try {
        javonetHandle =
            Javonet.New(
                "combit.ListLabel24.DataProviders.OdbcConnectionDataProvider+AddRelationEventArgs");
        super.setJavonetHandle(javonetHandle);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public AddRelationEventArgs(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
  }

  public interface AddRelationsEventHandler {
    public void Invoke(Object sender, OdbcConnectionDataProvider.AddRelationEventArgs e);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
