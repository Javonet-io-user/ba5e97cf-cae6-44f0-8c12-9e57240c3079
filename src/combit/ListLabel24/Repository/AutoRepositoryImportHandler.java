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
import combit.ListLabel24.*;
import jio.System.*;

public class AutoRepositoryImportHandler implements IDisposable {
  protected NObject javonetHandle;

  public AutoRepositoryImportHandler(
      ListLabel ll,
      LlProjectLoadType expectedLoadType,
      java.lang.String projectFile,
      java.lang.String tempDir) {
    try {
      javonetHandle =
          Javonet.New(
              "combit.ListLabel24.Repository.AutoRepositoryImportHandler",
              ll,
              NEnum.fromJavaEnum(expectedLoadType),
              projectFile,
              tempDir);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public AutoRepositoryImportHandler(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
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
