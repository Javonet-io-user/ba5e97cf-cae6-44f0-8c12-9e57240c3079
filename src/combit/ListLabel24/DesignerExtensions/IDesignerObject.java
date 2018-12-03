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
import combit.ListLabel24.*;

public interface IDesignerObject {
  public java.lang.Integer SetLLJob(java.lang.Integer hLLJob, java.lang.Integer pLLBase);

  public java.lang.Integer GetName(AtomicReference<java.lang.String> pbsName);

  public java.lang.Integer GetDescr(AtomicReference<java.lang.String> pbsDescr);

  public java.lang.Integer GetIcon(AtomicReference<java.lang.Integer> phIcon);

  public java.lang.Integer IsProjectSupported(
      java.lang.Integer nProjType, AtomicReference<java.lang.Boolean> pbSupported);

  public java.lang.Integer SetOption(java.lang.Integer nOption, java.lang.Integer nValue);

  public java.lang.Integer GetOption(
      java.lang.Integer nOption, AtomicReference<java.lang.Integer> pnValue);

  public java.lang.Integer SetOptionString(java.lang.String sOption, java.lang.String sText);

  public java.lang.Integer GetOptionString(
      java.lang.String sOption, AtomicReference<java.lang.String> psText);

  public java.lang.Integer SetParameters(Object pUnk);

  public java.lang.Integer GetParameters(Object pUnk);

  public java.lang.Integer Clone(Object ppNewObj);

  public java.lang.Integer FirstCreation(java.lang.Integer hWndParent);

  public java.lang.Integer GetMinDimensionsSCM(
      java.lang.Boolean bForNew, AtomicReference<java.lang.Integer> ptMinSize);

  public java.lang.Integer Show(
      java.lang.Integer hDC,
      RECT prcPaint,
      java.lang.Integer hExportProfJob,
      java.lang.Integer hExportProfList,
      java.lang.Integer nExportVerbosity,
      java.lang.Integer nDestination,
      java.lang.Boolean bSelected);

  public java.lang.Integer GetTrueRect(RECT prc);

  public java.lang.Integer GetErrorcode();

  public java.lang.Integer AllowPageBreak();

  public java.lang.Integer ResetPrintState();

  public java.lang.Integer ForceResetPrintState();

  public java.lang.Integer PrintWaiting();

  public java.lang.Integer PrintUnfinished();

  public java.lang.Integer PrintFinished();

  public java.lang.Integer PrintPastFinished();

  public java.lang.Integer SetNtfySink(Object pNtfySink);

  public java.lang.Integer Edit(java.lang.Integer hWnd, PointInt ptMouse);

  public java.lang.Integer ClearEditPartInfo();

  public java.lang.Integer CanEditPart(PointInt ptMouse, java.lang.Integer phMenu);

  public java.lang.Integer EditPart(
      java.lang.Integer hWnd, PointInt ptMouse, java.lang.Integer nMenuID);

  public java.lang.Integer CancelEditPart();

  public java.lang.Integer OnDragDrop(
      java.lang.Integer pDataObj,
      java.lang.Integer grfKeyState,
      PointInt p,
      java.lang.Integer pdwEffect,
      java.lang.Boolean bQuery);

  public java.lang.Integer IsSetFontSupported(AtomicReference<java.lang.Boolean> pbSupported);

  public java.lang.Integer SetFont(
      java.lang.Integer pLF, java.lang.Integer nSize, java.lang.Integer rgbColor);

  public java.lang.Integer OnObject(java.lang.Integer hDC, PointInt ptMouse);

  public java.lang.Integer InObject(java.lang.Integer hDC, PointInt ptMouse);

  public java.lang.Integer CalcDistanceToFrame(
      java.lang.Integer hDC, PointInt ptMouse, AtomicReference<java.lang.Integer> pnDistance);

  public java.lang.Integer OnMouseMove(
      java.lang.Integer hDC, PointInt ptMouse, AtomicReference<java.lang.Integer> phCrs);

  public java.lang.Integer OnMouseLButton(
      java.lang.Integer hDC, PointInt ptMouse, java.lang.Integer hWnd);

  public java.lang.Integer OnDeclareChartRow(java.lang.String sActiveTable);

  public java.lang.Integer CanCreateObjectFromType(
      java.lang.Integer nLLType, java.lang.String sVarName, RECT prcCreate);

  public java.lang.Integer GetVarSizeInfo(
      java.lang.Integer hDC,
      java.lang.Integer prcSpaceAvailable,
      AtomicReference<java.lang.Integer> pnMinHeight,
      AtomicReference<java.lang.Integer> pnIdealHeight);
}
