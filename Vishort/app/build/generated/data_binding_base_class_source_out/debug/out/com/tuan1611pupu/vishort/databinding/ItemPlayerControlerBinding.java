// Generated by view binder compiler. Do not edit!
package com.tuan1611pupu.vishort.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.tuan1611pupu.vishort.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemPlayerControlerBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final ImageButton exoPause;

  @NonNull
  public final ImageButton exoPlay;

  private ItemPlayerControlerBinding(@NonNull FrameLayout rootView, @NonNull ImageButton exoPause,
      @NonNull ImageButton exoPlay) {
    this.rootView = rootView;
    this.exoPause = exoPause;
    this.exoPlay = exoPlay;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemPlayerControlerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemPlayerControlerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_player_controler, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemPlayerControlerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = com.google.android.exoplayer2.R.id.exo_pause;
      ImageButton exoPause = ViewBindings.findChildViewById(rootView, id);
      if (exoPause == null) {
        break missingId;
      }

      id = com.google.android.exoplayer2.R.id.exo_play;
      ImageButton exoPlay = ViewBindings.findChildViewById(rootView, id);
      if (exoPlay == null) {
        break missingId;
      }

      return new ItemPlayerControlerBinding((FrameLayout) rootView, exoPause, exoPlay);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}