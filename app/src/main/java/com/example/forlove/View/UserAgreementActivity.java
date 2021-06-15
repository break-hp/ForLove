package com.example.forlove.View;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.forlove.Base.BaseActivity;
import com.example.forlove.Presenter.UserAgreementPresenter;
import com.example.forlove.R;

public class UserAgreementActivity extends BaseActivity<UserAgreementPresenter> {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_agreement);
        imageView = findViewById(R.id.imageView8);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    public UserAgreementPresenter initPresenter() {
        return new UserAgreementPresenter(UserAgreementActivity.this);
    }

}