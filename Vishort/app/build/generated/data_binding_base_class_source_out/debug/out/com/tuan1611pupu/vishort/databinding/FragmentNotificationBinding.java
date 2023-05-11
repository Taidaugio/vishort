// Generated by view binder compiler. Do not edit!
package com.tuan1611pupu.vishort.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.tuan1611pupu.vishort.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentNotificationBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final ViewPager pager;

  @NonNull
  public final TabLayout tablayout;

  private FragmentNotificationBinding(@NonNull FrameLayout rootView, @NonNull ViewPager pager,
      @NonNull TabLayout tablayout) {
    this.rootView = rootView;
    this.pager = pager;
    this.tablayout = tablayout;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentNotificationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentNotificationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_notification, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentNotificationBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.pager;
      ViewPager pager = ViewBindings.findChildViewById(rootView, id);
      if (pager == null) {
        break missingId;
      }

      id = R.id.tablayout;
      TabLayout tablayout = ViewBindings.findChildViewById(rootView, id);
      if (tablayout == null) {
        break missingId;
      }

      return new FragmentNotificationBinding((FrameLayout) rootView, pager, tablayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}