package Irony.Ast;

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
import Irony.Ast.*;
import jio.System.*;

public class AstNodeConfig {
  protected NObject javonetHandle;
  /** GetFiled */
  public jio.System.Type getNodeType() {
    try {
      Object res = javonetHandle.<NObject>get("NodeType");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setNodeType(jio.System.Type param) {
    try {
      javonetHandle.set("NodeType", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public Object getData() {
    try {
      Object res = javonetHandle.<NObject>get("Data");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setData(Object param) {
    try {
      javonetHandle.set("Data", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public AstNodeCreator getNodeCreator() {
    try {
      Object res = javonetHandle.<NObject>get("NodeCreator");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setNodeCreator(AstNodeCreator param) {
    try {
      javonetHandle.set("NodeCreator", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public DefaultAstNodeCreator getDefaultNodeCreator() {
    try {
      Object res = javonetHandle.<NObject>get("DefaultNodeCreator");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setDefaultNodeCreator(DefaultAstNodeCreator param) {
    try {
      javonetHandle.set("DefaultNodeCreator", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.Integer[] getPartsMap(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("PartsMap");
      if (res == null) return null;
      return (java.lang.Integer[])
          Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setPartsMap(java.lang.Integer[] param) {
    try {
      javonetHandle.set("PartsMap", new Object[] {param});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public AstNodeConfig() {
    try {
      javonetHandle = Javonet.New("Irony.Ast.AstNodeConfig");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public AstNodeConfig(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.Boolean CanCreateNode() {
    try {
      java.lang.Boolean res = javonetHandle.invoke("CanCreateNode");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
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
