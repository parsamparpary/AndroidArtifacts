package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class zzp implements Creator {
   // $FF: synthetic method
   public final Object[] newArray(int var1) {
      return new StreetViewPanoramaOrientation[var1];
   }

   // $FF: synthetic method
   public final Object createFromParcel(Parcel var1) {
      Parcel var2 = var1;
      int var3 = com.google.android.gms.common.internal.safeparcel.zzb.zzd(var1);
      float var4 = 0.0F;
      float var5 = 0.0F;

      while(var2.dataPosition() < var3) {
         int var6;
         switch((var6 = var2.readInt()) & 65535) {
         case 2:
            var4 = com.google.android.gms.common.internal.safeparcel.zzb.zzl(var2, var6);
            break;
         case 3:
            var5 = com.google.android.gms.common.internal.safeparcel.zzb.zzl(var2, var6);
            break;
         default:
            com.google.android.gms.common.internal.safeparcel.zzb.zzb(var2, var6);
         }
      }

      com.google.android.gms.common.internal.safeparcel.zzb.zzF(var2, var3);
      return new StreetViewPanoramaOrientation(var4, var5);
   }
}