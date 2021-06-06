package com.example.forlove.View;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.forlove.Base.BaseActivity;
import com.example.forlove.Presenter.WelcomePresenter;
import com.example.forlove.R;

public class WelcomeActivity extends BaseActivity<WelcomePresenter> {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public WelcomePresenter initPresenter() {
        return new WelcomePresenter(WelcomeActivity.this);
    }
}