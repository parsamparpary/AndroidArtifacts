package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;

class AnimatorUtils {
   private static final AnimatorUtilsImpl IMPL;

   static void addPauseListener(@NonNull Animator animator, @NonNull AnimatorListenerAdapter listener) {
      IMPL.addPauseListener(animator, listener);
   }

   static void pause(@NonNull Animator animator) {
      IMPL.pause(animator);
   }

   static void resume(@NonNull Animator animator) {
      IMPL.resume(animator);
   }

   static {
      if (VERSION.SDK_INT >= 19) {
         IMPL = new AnimatorUtilsApi19();
      } else {
         IMPL = new AnimatorUtilsApi14();
      }

   }
}
