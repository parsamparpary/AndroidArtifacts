package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public final class zzbxi extends zzed implements zzbxg {
   zzbxi(IBinder var1) {
      super(var1, "com.google.android.gms.fitness.internal.IStatusCallback");
   }

   public final void zzu(Status var1) throws RemoteException {
      Parcel var2;
      zzef.zza(var2 = this.zzZ(), var1);
      this.zzc(1, var2);
   }
}
