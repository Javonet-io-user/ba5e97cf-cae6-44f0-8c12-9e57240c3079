package Irony.Parsing;

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
import Irony.Parsing.*;
import jio.System.Collections.Generic.*;
import jio.System.*;
import jio.System.Collections.*;

public class GrammarErrorList extends List<GrammarError>
    implements jio.System.Collections.Generic.IList<GrammarError>,
        jio.System.Collections.Generic.ICollection<GrammarError>,
        jio.System.Collections.Generic.IEnumerable<GrammarError>,
        jio.System.Collections.IEnumerable,
        jio.System.Collections.IList,
        jio.System.Collections.ICollection,
        IReadOnlyList<GrammarError>,
        IReadOnlyCollection<GrammarError> {
  protected NObject javonetHandle;

  public GrammarErrorList() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Irony.Parsing.GrammarErrorList");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public GrammarErrorList(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void Add(
      GrammarErrorLevel level, ParserState state, java.lang.String message, Object[] args) {
    try {
      javonetHandle.invoke("Add", NEnum.fromJavaEnum(level), state, message, new Object[] {args});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void AddAndThrow(
      GrammarErrorLevel level, ParserState state, java.lang.String message, Object[] args) {
    try {
      javonetHandle.invoke(
          "AddAndThrow", NEnum.fromJavaEnum(level), state, message, new Object[] {args});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public GrammarErrorLevel GetMaxLevel() {
    try {
      Object res = javonetHandle.invoke("GetMaxLevel");
      if (res == null) return null;
      return GrammarErrorLevel.valueOf(((NEnum) res).getValueName());
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
