package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.zzbo;

final class zzai extends zzbo {
   // $FF: synthetic field
   private OnStreetViewPanoramaReadyCallback zzbmJ;

   zzai(StreetViewPanoramaView.zza var1, OnStreetViewPanoramaReadyCallback var2) {
      this.zzbmJ = var2;
      super();
   }

   public final void zza(IStreetViewPanoramaDelegate var1) throws RemoteException {
      this.zzbmJ.onStreetViewPanoramaReady(new StreetViewPanorama(var1));
   }
}
