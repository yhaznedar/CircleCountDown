package com.example.yunus.circlecountdown;

import android.animation.ObjectAnimator;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import com.github.lzyzsd.circleprogress.DonutProgress;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 * Created by Yunus on 28.12.2016.
 */
public class KaskoTabFragment extends android.support.v4.app.Fragment

{

    private DonutProgress donutProgress;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab2, container, false);

        donutProgress = (DonutProgress) rootView.findViewById(R.id.donut_progress);
        donutProgress.setProgress(0);
        donutProgress.setMax(365); //Barın maksimum değeri. 1 yılın gün sayısına sabitlendi.
        donutProgress.setText(String.valueOf(340));
        donutProgress.setProgress(340);
        ObjectAnimator anim = ObjectAnimator.ofInt(donutProgress, "progress", 0, 340); //0'dan farka kadar
        anim.setInterpolator(new DecelerateInterpolator());
        anim.setDuration(2000); //göstergenin dolma süresi belirlenen yere kadar //2 saniye içinde tamamlanır.
        anim.start();

        return rootView;
    }


}
