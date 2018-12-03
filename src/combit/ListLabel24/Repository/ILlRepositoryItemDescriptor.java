package combit.ListLabel24.Repository;

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
import combit.ListLabel24.Repository.*;
import jio.System.*;

public interface ILlRepositoryItemDescriptor {
  public java.lang.Integer GetItemType(Object type);

  public java.lang.Integer GetUIDescription(java.lang.Integer lcid, Object description);

  public java.lang.Integer SetUIDescription(java.lang.Integer lcid, Object description);

  public java.lang.Integer GetBLOB(Object descriptor);

  public java.lang.Integer GetParentId(Object description);
}
