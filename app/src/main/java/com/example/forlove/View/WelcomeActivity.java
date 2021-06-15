package com.example.forlove.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.forlove.Base.BaseActivity;
import com.example.forlove.Presenter.WelcomePresenter;
import com.example.forlove.R;

public class WelcomeActivity extends BaseActivity<WelcomePresenter> {

    private ImageView imageView, imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        windowManege();
        imageView = findViewById(R.id.imageView2);
        imageView2 = findViewById(R.id.imageView3);
        Animation animation = AnimationUtils.loadAnimation(WelcomeActivity.this, R.anim.view_anim_rotate);
        Animation animation2 = AnimationUtils.loadAnimation(WelcomeActivity.this, R.anim.view_anim_right);
        imageView.startAnimation(animation);
        imageView2.startAnimation(animation2);
        Intent intent1 = new Intent(this, LoginActivity.class);
//        Intent intent2 = new Intent(this, MainActivity.class);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //加入判断，是否需要登录
//                if (SPUser.onRead(getBaseContext(), "First").equals("true")) {
                    startActivity(intent1); //执行
//                }else {
//                    startActivity(intent2); //执行
//                }
                //加入数据请求，获取主界面初始数据
                finish();
            }
        });
    }

    @Override
    public WelcomePresenter initPresenter() {
        return new WelcomePresenter(WelcomeActivity.this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Animation animation = AnimationUtils.loadAnimation(WelcomeActivity.this, R.anim.view_anim_rotate);
        Animation animation2 = AnimationUtils.loadAnimation(WelcomeActivity.this, R.anim.view_anim_right);
        imageView.startAnimation(animation);
        imageView2.startAnimation(animation2);
    }
}