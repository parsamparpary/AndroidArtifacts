package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences.Editor;

final class zzagn extends zzagr {
   // $FF: synthetic field
   private Context zztF;
   // $FF: synthetic field
   private boolean zzZj;

   zzagn(Context var1, boolean var2) {
      this.zztF = var1;
      this.zzZj = var2;
      super((zzafu)null);
   }

   public final void zzbd() {
      Editor var1;
      (var1 = this.zztF.getSharedPreferences("admob", 0).edit()).putBoolean("content_url_opted_out", this.zzZj);
      var1.apply();
   }
}