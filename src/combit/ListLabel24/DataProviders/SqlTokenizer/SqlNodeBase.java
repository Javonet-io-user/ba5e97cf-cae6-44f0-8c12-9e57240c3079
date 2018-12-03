package combit.ListLabel24.DataProviders.SqlTokenizer;

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
import combit.ListLabel24.DataProviders.SqlTokenizer.*;
import Irony.Ast.*;
import Irony.Parsing.*;

public class SqlNodeBase implements IAstNodeInit {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setSpan(SourceSpan value) {
    try {
      javonetHandle.set("Span", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public SourceSpan getSpan() {
    try {
      Object res = javonetHandle.<NObject>get("Span");
      if (res == null) return null;
      return new SourceSpan((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public SqlNodeBase() {
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.DataProviders.SqlTokenizer.SqlNodeBase");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SqlNodeBase(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void Init(AstContext context, ParseTreeNode parseNode) {
    try {
      javonetHandle.explicitInterface("Irony.Ast.IAstNodeInit").invoke("Init", context, parseNode);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.String GetInnerText(java.lang.String original) {
    try {
      java.lang.String res = javonetHandle.invoke("GetInnerText", original);
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
