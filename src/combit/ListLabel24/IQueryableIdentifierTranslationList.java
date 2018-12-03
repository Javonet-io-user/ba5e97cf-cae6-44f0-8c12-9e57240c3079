package combit.ListLabel24;

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
import combit.ListLabel24.*;
import jio.System.Collections.Generic.*;
import jio.System.Collections.*;

public interface IQueryableIdentifierTranslationList
    extends IQueryableTranslationList,
        ITranslationList,
        jio.System.Collections.Generic.IEnumerable<java.lang.Integer>,
        jio.System.Collections.IEnumerable {
  public java.lang.String GetComplexItemDisplayString(
      java.lang.String complexItem, java.lang.Integer LCID, java.lang.String parentTable);

  public void SetupComplexIdentifier(java.lang.String itemName);
}
