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
import jio.System.IO.*;
import jio.System.Threading.*;
import jio.System.Collections.Generic.*;

public interface IRepository {
  public java.lang.Boolean ContainsItem(java.lang.String id);

  public void LoadItem(
      java.lang.String id, Stream destinationStream, CancellationToken cancelToken);

  public IEnumerable<RepositoryItem> GetAllItems();

  public RepositoryItem GetItem(java.lang.String id);

  public void DeleteItem(java.lang.String id);

  public void CreateOrUpdateItem(
      RepositoryItem item, java.lang.String importUserData, Stream sourceStream);

  public java.lang.Boolean LockItem(java.lang.String id);

  public void UnlockItem(java.lang.String id);
}
