package com.example.forlove.Presenter;

import com.example.forlove.Base.BasePresenter;
import com.example.forlove.Model.LoginModel;
import com.example.forlove.Model.UserAgreementModel;
import com.example.forlove.View.LoginActivity;
import com.example.forlove.View.UserAgreementActivity;

/**
 * Created by jiangtao
 * on 2021/6/9
 */
public class UserAgreementPresenter extends BasePresenter<UserAgreementActivity, UserAgreementModel> {
    public UserAgreementPresenter(UserAgreementActivity view) {
        super(view);
    }
}
