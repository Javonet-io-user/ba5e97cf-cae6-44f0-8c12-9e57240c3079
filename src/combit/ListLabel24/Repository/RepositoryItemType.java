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

public class RepositoryItemType {
  protected NObject javonetHandle;
  /** GetProperty */
  public java.lang.String getValue() {
    try {
      java.lang.String res = javonetHandle.get("Value");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetFiled */

  public static RepositoryItemType getImage() {
    try {
      Object res = Javonet.getType("RepositoryItemType").<NObject>get("Image");
      if (res == null) return null;
      return new RepositoryItemType((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setImage(RepositoryItemType param) {
    try {
      Javonet.getType("RepositoryItemType").set("Image", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static RepositoryItemType getPDF() {
    try {
      Object res = Javonet.getType("RepositoryItemType").<NObject>get("PDF");
      if (res == null) return null;
      return new RepositoryItemType((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setPDF(RepositoryItemType param) {
    try {
      Javonet.getType("RepositoryItemType").set("PDF", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static RepositoryItemType getProjectList() {
    try {
      Object res = Javonet.getType("RepositoryItemType").<NObject>get("ProjectList");
      if (res == null) return null;
      return new RepositoryItemType((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setProjectList(RepositoryItemType param) {
    try {
      Javonet.getType("RepositoryItemType").set("ProjectList", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static RepositoryItemType getProjectCard() {
    try {
      Object res = Javonet.getType("RepositoryItemType").<NObject>get("ProjectCard");
      if (res == null) return null;
      return new RepositoryItemType((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setProjectCard(RepositoryItemType param) {
    try {
      Javonet.getType("RepositoryItemType").set("ProjectCard", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static RepositoryItemType getProjectLabel() {
    try {
      Object res = Javonet.getType("RepositoryItemType").<NObject>get("ProjectLabel");
      if (res == null) return null;
      return new RepositoryItemType((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setProjectLabel(RepositoryItemType param) {
    try {
      Javonet.getType("RepositoryItemType").set("ProjectLabel", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static RepositoryItemType getProjectIndex() {
    try {
      Object res = Javonet.getType("RepositoryItemType").<NObject>get("ProjectIndex");
      if (res == null) return null;
      return new RepositoryItemType((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setProjectIndex(RepositoryItemType param) {
    try {
      Javonet.getType("RepositoryItemType").set("ProjectIndex", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static RepositoryItemType getProjectReverseSide() {
    try {
      Object res = Javonet.getType("RepositoryItemType").<NObject>get("ProjectReverseSide");
      if (res == null) return null;
      return new RepositoryItemType((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setProjectReverseSide(RepositoryItemType param) {
    try {
      Javonet.getType("RepositoryItemType").set("ProjectReverseSide", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static RepositoryItemType getProjectTableOfContents() {
    try {
      Object res = Javonet.getType("RepositoryItemType").<NObject>get("ProjectTableOfContents");
      if (res == null) return null;
      return new RepositoryItemType((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setProjectTableOfContents(RepositoryItemType param) {
    try {
      Javonet.getType("RepositoryItemType").set("ProjectTableOfContents", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static RepositoryItemType getPrinterConfig() {
    try {
      Object res = Javonet.getType("RepositoryItemType").<NObject>get("PrinterConfig");
      if (res == null) return null;
      return new RepositoryItemType((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setPrinterConfig(RepositoryItemType param) {
    try {
      Javonet.getType("RepositoryItemType").set("PrinterConfig", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static RepositoryItemType getSketchImage() {
    try {
      Object res = Javonet.getType("RepositoryItemType").<NObject>get("SketchImage");
      if (res == null) return null;
      return new RepositoryItemType((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setSketchImage(RepositoryItemType param) {
    try {
      Javonet.getType("RepositoryItemType").set("SketchImage", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static RepositoryItemType getShapefile() {
    try {
      Object res = Javonet.getType("RepositoryItemType").<NObject>get("Shapefile");
      if (res == null) return null;
      return new RepositoryItemType((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setShapefile(RepositoryItemType param) {
    try {
      Javonet.getType("RepositoryItemType").set("Shapefile", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static RepositoryItemType getShapefileDatabase() {
    try {
      Object res = Javonet.getType("RepositoryItemType").<NObject>get("ShapefileDatabase");
      if (res == null) return null;
      return new RepositoryItemType((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setShapefileDatabase(RepositoryItemType param) {
    try {
      Javonet.getType("RepositoryItemType").set("ShapefileDatabase", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RepositoryItemType(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.String ToString() {
    try {
      java.lang.String res = javonetHandle.invoke("ToString");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public static RepositoryItemType FromLlProject(LlProject project) {
    try {
      Object res =
          Javonet.getType("RepositoryItemType")
              .invoke("FromLlProject", NEnum.fromJavaEnum(project));
      if (res == null) return null;
      return new RepositoryItemType((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static LlProject ToLlProject(java.lang.String itemType) {
    try {
      Object res = Javonet.getType("RepositoryItemType").invoke("ToLlProject", itemType);
      if (res == null) return null;
      return LlProject.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static RepositoryItemType FromStringValue(java.lang.String typeValue) {
    try {
      Object res = Javonet.getType("RepositoryItemType").invoke("FromStringValue", typeValue);
      if (res == null) return null;
      return new RepositoryItemType((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static java.lang.Boolean IsProjectType(
      java.lang.String typeValue, java.lang.Boolean allowSpecialProjectTypes) {
    try {
      java.lang.Boolean res =
          Javonet.getType("RepositoryItemType")
              .invoke("IsProjectType", typeValue, allowSpecialProjectTypes);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public static java.lang.Boolean IsProjectType(
      RepositoryItemType typeValue, java.lang.Boolean allowSpecialProjectTypes) {
    try {
      java.lang.Boolean res =
          Javonet.getType("RepositoryItemType")
              .invoke("IsProjectType", typeValue, allowSpecialProjectTypes);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
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
