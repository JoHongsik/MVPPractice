package com.example.mvppractice;

import android.view.View;

public class Presenter implements MVPMain.presenter{
    private final MVPMain.view view;

    public Presenter(MVPMain.view view){
        this.view = view;
    }
    @Override
    public void clicked() {
        view.show();
    }
}
