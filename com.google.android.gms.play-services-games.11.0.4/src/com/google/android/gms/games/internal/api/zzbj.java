package com.google.android.gms.games.internal.api;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.internal.GamesClientImpl;

final class zzbj extends zzbo {
   // $FF: synthetic field
   private String zzbbf;
   // $FF: synthetic field
   private String zzbbg;

   zzbj(zzbh var1, GoogleApiClient var2, String var3, String var4) {
      this.zzbbf = var3;
      this.zzbbg = var4;
      super(var2, (zzbi)null);
   }

   // $FF: synthetic method
   protected final void zza(com.google.android.gms.common.api.Api.zzb var1) throws RemoteException {
      GamesClientImpl var3 = (GamesClientImpl)var1;
      var3.zzb(this, this.zzbbf, this.zzbbg);
   }
}
