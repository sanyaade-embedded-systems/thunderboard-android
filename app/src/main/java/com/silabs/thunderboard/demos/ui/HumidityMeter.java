package com.silabs.thunderboard.demos.ui;

import android.content.Context;
import android.util.AttributeSet;

import com.silabs.thunderboard.R;

public class HumidityMeter extends BaseEnvironmentMeter {

    public HumidityMeter(Context context) {
        this(context, null, 0);
    }

    public HumidityMeter(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public HumidityMeter(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected int getInactiveIconResource() {
        return R.drawable.ic_humidity_inactive;
    }

    @Override
    protected int getActiveIconResource() {
        return R.drawable.ic_humidity;
    }

    @Override
    protected int getColorResource(float value) {
        return RangeColor.Humidity.getColorRes(value);
    }
}
