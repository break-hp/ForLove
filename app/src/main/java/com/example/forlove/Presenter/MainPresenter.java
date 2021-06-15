package com.example.forlove.Presenter;

import com.example.forlove.Base.BasePresenter;
import com.example.forlove.Model.LoginModel;
import com.example.forlove.Model.MainModel;
import com.example.forlove.View.LoginActivity;
import com.example.forlove.View.MainActivity;

/**
 * Created by jiangtao
 * on 2021/6/9
 */
public class MainPresenter extends BasePresenter<MainActivity, MainModel> {
    public MainPresenter(MainActivity view) {
        super(view);
    }
}
