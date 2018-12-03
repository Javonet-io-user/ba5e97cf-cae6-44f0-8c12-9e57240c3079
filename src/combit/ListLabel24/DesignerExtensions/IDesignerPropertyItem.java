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

public interface IDesignerPropertyItem {
  public java.lang.Integer SetVisibilityFlags(java.lang.Integer flags);

  public java.lang.Integer SetValue(Object value);

  public java.lang.Integer IsConstant(AtomicReference<java.lang.Boolean> result);

  public java.lang.Integer GetValue(java.lang.Boolean evaluated, Object value);

  public java.lang.Integer SetEnabled(java.lang.Boolean enabled);
}
