package com.example.rentalapartmentapp.View.CustomUI;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatRadioButton;

import com.example.rentalapartmentapp.R;


public class CustomRadioButton extends AppCompatRadioButton {
    public CustomRadioButton(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        applyFont();
    }


    private void applyFont(){
        Typeface boldTypeface = getResources().getFont(R.font.nunito);
        setTypeface(boldTypeface);
    }
}
