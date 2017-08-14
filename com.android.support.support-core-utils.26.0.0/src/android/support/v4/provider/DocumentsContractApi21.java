package android.support.v4.provider;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.support.annotation.RequiresApi;
import android.util.Log;
import java.util.ArrayList;

@RequiresApi(21)
class DocumentsContractApi21 {
   private static final String TAG = "DocumentFile";

   public static Uri createFile(Context context, Uri self, String mimeType, String displayName) {
      try {
         return DocumentsContract.createDocument(context.getContentResolver(), self, mimeType, displayName);
      } catch (Exception var5) {
         return null;
      }
   }

   public static Uri createDirectory(Context context, Uri self, String displayName) {
      return createFile(context, self, "vnd.android.document/directory", displayName);
   }

   public static Uri prepareTreeUri(Uri treeUri) {
      return DocumentsContract.buildDocumentUriUsingTree(treeUri, DocumentsContract.getTreeDocumentId(treeUri));
   }

   public static Uri[] listFiles(Context context, Uri self) {
      ContentResolver resolver = context.getContentResolver();
      Uri childrenUri = DocumentsContract.buildChildDocumentsUriUsingTree(self, DocumentsContract.getDocumentId(self));
      ArrayList results = new ArrayList();
      Cursor c = null;

      try {
         c = resolver.query(childrenUri, new String[]{"document_id"}, (String)null, (String[])null, (String)null);

         while(c.moveToNext()) {
            String documentId = c.getString(0);
            Uri documentUri = DocumentsContract.buildDocumentUriUsingTree(self, documentId);
            results.add(documentUri);
         }
      } catch (Exception var11) {
         Log.w("DocumentFile", "Failed query: " + var11);
      } finally {
         closeQuietly(c);
      }

      return (Uri[])results.toArray(new Uri[results.size()]);
   }

   public static Uri renameTo(Context context, Uri self, String displayName) {
      try {
         return DocumentsContract.renameDocument(context.getContentResolver(), self, displayName);
      } catch (Exception var4) {
         return null;
      }
   }

   private static void closeQuietly(AutoCloseable closeable) {
      if (closeable != null) {
         try {
            closeable.close();
         } catch (RuntimeException var2) {
            throw var2;
         } catch (Exception var3) {
            ;
         }
      }

   }
}