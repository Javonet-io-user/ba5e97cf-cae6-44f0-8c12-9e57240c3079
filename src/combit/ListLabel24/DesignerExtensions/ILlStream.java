package combit.ListLabel24.DesignerExtensions;

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
import combit.ListLabel24.DesignerExtensions.*;
import jio.System.*;

public interface ILlStream {
  public java.lang.Integer Read(
      java.lang.Integer pv, java.lang.Integer cb, AtomicReference<java.lang.Integer> pcbRead);

  public java.lang.Integer Write(
      java.lang.Integer pv, java.lang.Integer cb, AtomicReference<java.lang.Integer> pcbWritten);

  public java.lang.Integer Seek(
      java.lang.Long dlibMove,
      java.lang.Integer dwOrigin,
      AtomicReference<java.lang.Long> plibNewPosition);
}
