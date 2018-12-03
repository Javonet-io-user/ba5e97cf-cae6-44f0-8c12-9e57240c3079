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

public interface ILlRtfEventSink {
  public void OnSelectionChanged(
      java.lang.Integer type, java.lang.Integer min, java.lang.Integer max);

  public void OnContentsChanged();

  public java.lang.Boolean OnKeyDown(java.lang.Integer keyCode, java.lang.Integer lParam);

  public java.lang.Boolean OnKeyUp(java.lang.Integer keyCode, java.lang.Integer lParam);

  public java.lang.Boolean OnChar(java.lang.Integer character, java.lang.Integer lParam);

  public java.lang.Boolean OnDialogKey(
      java.lang.Boolean down, java.lang.Integer keyCode, java.lang.Integer lParam);
}
