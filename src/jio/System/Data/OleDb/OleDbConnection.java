package jio.System.Data.OleDb;

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
import jio.System.Data.Common.*;
import jio.System.Data.OleDb.*;
import jio.System.ComponentModel.*;
import jio.System.*;
import jio.System.Data.*;

public class OleDbConnection extends DbConnection
    implements IComponent, IDisposable, IDbConnection, ICloneable {
  protected NObject javonetHandle;

  public OleDbConnection(java.lang.String connectionString) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Data.OleDb.OleDbConnection", connectionString);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public OleDbConnection() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Data.OleDb.OleDbConnection");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public OleDbConnection(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public Object Clone() {
    try {
      Object res = javonetHandle.explicitInterface("jio.System.ICloneable").invoke("Clone");
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
