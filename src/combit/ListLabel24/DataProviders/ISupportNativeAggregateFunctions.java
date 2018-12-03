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

public interface ISupportNativeAggregateFunctions {
  public Object ExecuteNativeAggregateFunction(ExecuteNativeAggregateFunctionArguments args);

  public java.lang.Boolean CheckNativeAggregateFunctionSyntax(
      CheckNativeAggregateFunctionSyntaxArguments args);

  public java.lang.Boolean SupportsNativeAggregateFunction(NativeAggregateFunction function);
}
