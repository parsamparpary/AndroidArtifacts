package com.google.android.gms.location.places.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

public final class zzaf implements Creator {
   // $FF: synthetic method
   public final Object[] newArray(int var1) {
      return new zzae[var1];
   }

   // $FF: synthetic method
   public final Object createFromParcel(Parcel var1) {
      Parcel var2 = var1;
      int var3 = com.google.android.gms.common.internal.safeparcel.zzb.zzd(var1);
      ArrayList var4 = null;
      String var5 = null;
      Uri var6 = null;
      float var7 = 0.0F;
      int var8 = 0;

      while(var2.dataPosition() < var3) {
         int var9;
         switch((var9 = var2.readInt()) & 65535) {
         case 1:
            var4 = com.google.android.gms.common.internal.safeparcel.zzb.zzB(var2, var9);
            break;
         case 2:
            var5 = com.google.android.gms.common.internal.safeparcel.zzb.zzq(var2, var9);
            break;
         case 3:
            var6 = (Uri)com.google.android.gms.common.internal.safeparcel.zzb.zza(var2, var9, Uri.CREATOR);
            break;
         case 4:
            var7 = com.google.android.gms.common.internal.safeparcel.zzb.zzl(var2, var9);
            break;
         case 5:
            var8 = com.google.android.gms.common.internal.safeparcel.zzb.zzg(var2, var9);
            break;
         default:
            com.google.android.gms.common.internal.safeparcel.zzb.zzb(var2, var9);
         }
      }

      com.google.android.gms.common.internal.safeparcel.zzb.zzF(var2, var3);
      return new zzae(var4, var5, var6, var7, var8);
   }
}
