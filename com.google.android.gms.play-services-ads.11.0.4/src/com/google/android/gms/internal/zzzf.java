package com.google.android.gms.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

@zzzn
public final class zzzf implements zzyv {
   private final boolean zzSe;
   private final boolean zzSf;

   public zzzf(boolean var1, boolean var2) {
      this.zzSe = var1;
      this.zzSf = var2;
   }

   // $FF: synthetic method
   public final zzoa zza(zzyn var1, JSONObject var2) throws JSONException, InterruptedException, ExecutionException {
      List var6 = var1.zza(var2, "images", false, this.zzSe, this.zzSf);
      zzajm var7 = var1.zza(var2, "app_icon", true, this.zzSe);
      zzajm var8 = var1.zzc(var2, "video");
      zzajm var9 = var1.zzd(var2);
      ArrayList var10 = new ArrayList();
      Iterator var11 = var6.iterator();

      while(var11.hasNext()) {
         zzajm var12 = (zzajm)var11.next();
         var10.add((zznp)var12.get());
      }

      zzaka var13 = zzyn.zzb(var8);
      return new zznq(var2.getString("headline"), var10, var2.getString("body"), (zzos)var7.get(), var2.getString("call_to_action"), var2.optDouble("rating", -1.0D), var2.optString("store"), var2.optString("price"), (zznn)var9.get(), new Bundle(), var13 != null ? var13.zziH() : null, var13 != null ? var13.getView() : null);
   }
}
