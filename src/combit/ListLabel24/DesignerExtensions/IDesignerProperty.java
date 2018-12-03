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

public interface IDesignerProperty {
  public java.lang.Integer SetLLJob(java.lang.Integer jobHandle, java.lang.Integer baseInterface);

  public java.lang.Integer GetName(AtomicReference<java.lang.String> name);

  public java.lang.Integer SetPropertyItem(Object propertyItem);

  public java.lang.Integer GetOption(java.lang.String optionName, Object value);

  public java.lang.Integer NotifyChanged();

  public java.lang.Integer NotifyButtonClicked();
}
