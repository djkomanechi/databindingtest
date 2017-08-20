package com.example.test.databindingsample;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.view.View;

public class Settings extends BaseObservable {
    public String settingA;
    public String settingB;
    public boolean settingC;

    public Settings() {
        settingA = "4K";
        settingB = "Intelligent active";
        settingC = true;
    }

    @Bindable
    public String getSettingA() {
        return this.settingA;
    }

    @Bindable
    public String getSettingB() {
        return this.settingB;
    }

    @Bindable
    public boolean isSettingC() {
        return settingC;
    }

    @Bindable
    public void setSettingA(String settingA) {
        this.settingA = settingA;
        notifyPropertyChanged(BR.settingA);
    }

    @Bindable
    public void setSettingB(String settingB) {
        this.settingB = settingB;
        notifyPropertyChanged(BR.settingB);
    }

    @Bindable
    public void setSettingC(boolean settingC) {
        this.settingC = settingC;
        notifyPropertyChanged(BR.settingC);
    }

    public void onAClick(View view) {
        android.util.Log.d("test", "onAlick!");
        setSettingA("1K");
        setSettingB("1-Standard");
    }

    public void onBClick(View view) {
        android.util.Log.d("test", "onBlick!");
        setSettingA("2K");
        setSettingB("2-Standard");
    }

    public void onClick(View view) {
        android.util.Log.d("test", "onclick!");
        setSettingA("5K");
        setSettingB("Standard");
    }
}
