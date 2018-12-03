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
import jio.System.Drawing.Design.*;
import combit.ListLabel24.Design.*;
import jio.System.ComponentModel.*;
import jio.System.*;

public class IconIdEditor extends UITypeEditor implements IDisposable {
  protected NObject javonetHandle;

  public IconIdEditor() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.Design.IconIdEditor");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public IconIdEditor(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.Boolean GetPaintValueSupported(ITypeDescriptorContext context) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("GetPaintValueSupported", context);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public void PaintValue(PaintValueEventArgs e) {
    try {
      javonetHandle.invoke("PaintValue", e);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public UITypeEditorEditStyle GetEditStyle(ITypeDescriptorContext context) {
    try {
      Object res = javonetHandle.invoke("GetEditStyle", context);
      if (res == null) return null;
      return UITypeEditorEditStyle.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Object EditValue(ITypeDescriptorContext context, IServiceProvider provider, Object value) {
    try {
      Object res = javonetHandle.invoke("EditValue", context, provider, value);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void Dispose() {
    try {
      javonetHandle.explicitInterface("jio.System.IDisposable").invoke("Dispose");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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
