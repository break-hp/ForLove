package com.example.forlove.Base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * created by jiangtao on 2021/3/2 16:02
 * breakTT
 */
public abstract class BaseActivity<P extends BasePresenter>
        extends AppCompatActivity implements IContract.IBaseView {

    protected P mPresenter;
//517-break001
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = initPresenter();
        getSupportActionBar().hide();
        //隐藏标题栏
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.detach();
            mPresenter = null;
        }
    }

    // 构造实际所需的prensenter
    public abstract P initPresenter();

}
