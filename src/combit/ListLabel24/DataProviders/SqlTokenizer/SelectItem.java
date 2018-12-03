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

public class SelectItem extends SqlNodeBase implements IAstNodeInit {
  protected NObject javonetHandle;
  /** GetProperty */
  public SqlNodeBase getColumnDefinition() {
    try {
      Object res = javonetHandle.<NObject>get("ColumnDefinition");
      if (res == null) return null;
      return new SqlNodeBase((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public ColumnRef getAlias() {
    try {
      Object res = javonetHandle.<NObject>get("Alias");
      if (res == null) return null;
      return new ColumnRef((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public SelectItem() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.DataProviders.SqlTokenizer.SelectItem");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SelectItem(NObject handle) {
    super(handle);
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

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
