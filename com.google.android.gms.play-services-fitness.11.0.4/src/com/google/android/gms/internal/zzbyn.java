package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.zzai;
import com.google.android.gms.fitness.result.ListSubscriptionsResult;

final class zzbyn extends zzbvh {
   // $FF: synthetic field
   private DataType zzaVN;

   zzbyn(zzbyl var1, GoogleApiClient var2, DataType var3) {
      this.zzaVN = var3;
      super(var2);
   }

   // $FF: synthetic method
   protected final void zza(zzb var1) throws RemoteException {
      zzbvg var3 = (zzbvg)var1;
      zzbyr var4 = new zzbyr(this, (zzbym)null);
      ((zzbwr)var3.zzrf()).zza(new zzai(this.zzaVN, var4));
   }

   // $FF: synthetic method
   protected final Result zzb(Status var1) {
      return ListSubscriptionsResult.zzD(var1);
   }
}
