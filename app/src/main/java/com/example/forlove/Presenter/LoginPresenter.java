package com.example.forlove.Presenter;

import com.example.forlove.Base.BasePresenter;
import com.example.forlove.Model.LoginModel;
import com.example.forlove.Model.WelcomeModel;
import com.example.forlove.View.LoginActivity;
import com.example.forlove.View.WelcomeActivity;

/**
 * Created by jiangtao
 * on 2021/6/7
 */
public class LoginPresenter  extends BasePresenter<LoginActivity, LoginModel> {
    public LoginPresenter(LoginActivity view) {
        super(view);
    }
}
