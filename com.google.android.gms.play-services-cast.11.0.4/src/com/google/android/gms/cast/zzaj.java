package com.google.android.gms.cast;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.zzaxx;
import com.google.android.gms.internal.zzayr;
import java.io.IOException;

final class zzaj extends RemoteMediaPlayer.zzb {
   // $FF: synthetic field
   private GoogleApiClient zzaqW;
   // $FF: synthetic field
   private long[] zzaqX;
   // $FF: synthetic field
   private RemoteMediaPlayer zzaqV;

   zzaj(RemoteMediaPlayer var1, GoogleApiClient var2, GoogleApiClient var3, long[] var4) {
      this.zzaqV = var1;
      this.zzaqW = var3;
      this.zzaqX = var4;
      super(var2);
   }

   protected final void zza(zzaxx var1) {
      synchronized(RemoteMediaPlayer.zze(this.zzaqV)) {
         RemoteMediaPlayer.zzf(this.zzaqV).zzb(this.zzaqW);

         try {
            RemoteMediaPlayer.zzg(this.zzaqV).zza(this.zzarw, this.zzaqX);
         } catch (zzayr | IOException var8) {
            this.setResult((RemoteMediaPlayer.MediaChannelResult)this.zzb(new Status(2100)));
         } finally {
            RemoteMediaPlayer.zzf(this.zzaqV).zzb((GoogleApiClient)null);
         }

      }
   }
}
