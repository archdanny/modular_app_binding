package com.example.feature_one.binders

import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.BindingAdapter

@BindingAdapter("minHeight")
fun View.minHeight(height: Float) {
    when (this) {
        is ConstraintLayout -> minHeight = height.toInt()
        else -> minimumHeight = height.toInt()
    }
}
