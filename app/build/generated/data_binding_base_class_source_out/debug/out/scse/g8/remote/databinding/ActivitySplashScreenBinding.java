// Generated by view binder compiler. Do not edit!
package scse.g8.remote.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import scse.g8.remote.R;

public final class ActivitySplashScreenBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView idIVLogo;

  @NonNull
  public final ProgressBar idPBLoading;

  @NonNull
  public final RelativeLayout idRLContainer;

  private ActivitySplashScreenBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView idIVLogo, @NonNull ProgressBar idPBLoading,
      @NonNull RelativeLayout idRLContainer) {
    this.rootView = rootView;
    this.idIVLogo = idIVLogo;
    this.idPBLoading = idPBLoading;
    this.idRLContainer = idRLContainer;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySplashScreenBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySplashScreenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_splash_screen, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySplashScreenBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.idIVLogo;
      ImageView idIVLogo = ViewBindings.findChildViewById(rootView, id);
      if (idIVLogo == null) {
        break missingId;
      }

      id = R.id.idPBLoading;
      ProgressBar idPBLoading = ViewBindings.findChildViewById(rootView, id);
      if (idPBLoading == null) {
        break missingId;
      }

      id = R.id.idRLContainer;
      RelativeLayout idRLContainer = ViewBindings.findChildViewById(rootView, id);
      if (idRLContainer == null) {
        break missingId;
      }

      return new ActivitySplashScreenBinding((ConstraintLayout) rootView, idIVLogo, idPBLoading,
          idRLContainer);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
