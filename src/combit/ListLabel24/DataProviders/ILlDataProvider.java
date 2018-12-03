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
import jio.System.*;

public interface ILlDataProvider {
  public java.lang.Integer OpenTable(java.lang.String tableName, Object dataProvider);

  public java.lang.Integer OpenChildTable(java.lang.String relationName, Object dataProvider);

  public java.lang.Integer GetRowCount(AtomicReference<java.lang.Integer> count);

  public java.lang.Integer DefineDelayedInfo(java.lang.Integer delayedInfo);

  public java.lang.Integer MoveNext();

  public java.lang.Integer DefineRow(java.lang.Integer parentRowMode, Object parentPath);

  public java.lang.Integer Dispose();

  public java.lang.Integer SetUsedIdentifiers(Object usedIdentifiers);

  public java.lang.Integer ApplySortOrder(java.lang.String sortDescription);

  public java.lang.Integer ApplyFilter(Object keys, Object values);

  public java.lang.Integer ApplyAdvancedFilter(java.lang.String filter, Object parameters);

  public java.lang.Integer SetOption(TableOption option, Object value);

  public java.lang.Integer GetOption(TableOption option, Object value);
}
