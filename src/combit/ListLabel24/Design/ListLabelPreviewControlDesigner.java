package combit.ListLabel24.Design;

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
import jio.System.Windows.Forms.Design.*;
import combit.ListLabel24.Design.*;
import jio.System.ComponentModel.Design.*;
import jio.System.*;

public class ListLabelPreviewControlDesigner extends ControlDesigner
    implements ITreeDesigner, IDesigner, IDisposable, IDesignerFilter, IComponentInitializer {
  protected NObject javonetHandle;
  /** GetProperty */
  public DesignerActionListCollection getActionLists() {
    try {
      Object res = javonetHandle.<NObject>get("ActionLists");
      if (res == null) return null;
      return new DesignerActionListCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public ListLabelPreviewControlDesigner() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.Design.ListLabelPreviewControlDesigner");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ListLabelPreviewControlDesigner(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
