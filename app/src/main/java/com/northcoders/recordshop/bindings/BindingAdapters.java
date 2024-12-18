package com.northcoders.recordshop.bindings;

import android.widget.TextView;
import androidx.databinding.BindingAdapter;

public class BindingAdapters {

    @BindingAdapter("formattedPrice")
    public static void setFormattedPrice(TextView view, double price) {
        String formattedPrice = String.format("£%.2f", price);
        view.setText(formattedPrice);
    }
}

