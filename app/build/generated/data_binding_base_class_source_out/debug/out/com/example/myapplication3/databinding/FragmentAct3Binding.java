// Generated by view binder compiler. Do not edit!
package com.example.myapplication3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication3.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentAct3Binding implements ViewBinding {
  @NonNull
  private final NestedScrollView rootView;

  @NonNull
  public final TextView act3fragmentLabel;

  @NonNull
  public final ConstraintLayout fragment1act2subParent;

  @NonNull
  public final NestedScrollView fragment1act3parent;

  @NonNull
  public final TextView textviewFirst;

  @NonNull
  public final Button voiceAction;

  private FragmentAct3Binding(@NonNull NestedScrollView rootView,
      @NonNull TextView act3fragmentLabel, @NonNull ConstraintLayout fragment1act2subParent,
      @NonNull NestedScrollView fragment1act3parent, @NonNull TextView textviewFirst,
      @NonNull Button voiceAction) {
    this.rootView = rootView;
    this.act3fragmentLabel = act3fragmentLabel;
    this.fragment1act2subParent = fragment1act2subParent;
    this.fragment1act3parent = fragment1act3parent;
    this.textviewFirst = textviewFirst;
    this.voiceAction = voiceAction;
  }

  @Override
  @NonNull
  public NestedScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAct3Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAct3Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_act3, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAct3Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.act3fragment_label;
      TextView act3fragmentLabel = ViewBindings.findChildViewById(rootView, id);
      if (act3fragmentLabel == null) {
        break missingId;
      }

      id = R.id.fragment1act2subParent;
      ConstraintLayout fragment1act2subParent = ViewBindings.findChildViewById(rootView, id);
      if (fragment1act2subParent == null) {
        break missingId;
      }

      NestedScrollView fragment1act3parent = (NestedScrollView) rootView;

      id = R.id.textview_first;
      TextView textviewFirst = ViewBindings.findChildViewById(rootView, id);
      if (textviewFirst == null) {
        break missingId;
      }

      id = R.id.voice_action;
      Button voiceAction = ViewBindings.findChildViewById(rootView, id);
      if (voiceAction == null) {
        break missingId;
      }

      return new FragmentAct3Binding((NestedScrollView) rootView, act3fragmentLabel,
          fragment1act2subParent, fragment1act3parent, textviewFirst, voiceAction);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}