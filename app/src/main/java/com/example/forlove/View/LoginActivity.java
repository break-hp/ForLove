package com.example.forlove.View;

import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.forlove.Base.BaseActivity;
import com.example.forlove.Presenter.LoginPresenter;
import com.example.forlove.R;

public class LoginActivity extends BaseActivity<LoginPresenter> implements View.OnClickListener{

    private TextView welCome,getCode,signIn,userAgreement;
    private EditText edtPhone,edtCode;
    private ImageView back;
    private ConstraintLayout cPhone,cCode,cWechat,cQQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
        setAndroidNativeLightStatusBar(LoginActivity.this,true);
    }

    private void initView() {
        welCome = findViewById(R.id.welCome);
        getCode = findViewById(R.id.getCode);
        signIn = findViewById(R.id.signIn);
        userAgreement = findViewById(R.id.userAgreement);
        back = findViewById(R.id.back);
        cPhone = findViewById(R.id.cPhone);
        cCode = findViewById(R.id.cCode);
        cWechat = findViewById(R.id.cWechat);
        cQQ = findViewById(R.id.cQQ);
        edtPhone = findViewById(R.id.edtPhone);
        edtCode = findViewById(R.id.edtCode);
        back.setOnClickListener(this);
        getCode.setOnClickListener(this);
        signIn.setOnClickListener(this);
        userAgreement.setOnClickListener(this);
        edtPhone.setOnClickListener(this);
        edtCode.setOnClickListener(this);
        cWechat.setOnClickListener(this);
        cQQ.setOnClickListener(this);
        Animation animation1 = AnimationUtils.loadAnimation(LoginActivity.this, R.anim.view_anim_scale);
        Animation animation2 = AnimationUtils.loadAnimation(LoginActivity.this, R.anim.view_anim_up);
        welCome.startAnimation(animation1);
        cPhone.startAnimation(animation2);
        cCode.startAnimation(animation2);
        signIn.startAnimation(animation2);
        cWechat.startAnimation(animation2);
        cQQ.startAnimation(animation2);
    }

    @Override
    public LoginPresenter initPresenter() {
        return new LoginPresenter(LoginActivity.this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.back:
                finish();
                break;
            case R.id.edtPhone:
                break;
            case R.id.edtCode:
                break;
            case R.id.getCode:
//                请求短信验证码
                break;
            case R.id.signIn:
//                获取token，登录
                Intent intent1 = new Intent(this, MainActivity.class);
                startActivity(intent1); //执行
                finish();
                break;
            case R.id.cWechat:
//                跳转微信授权
                break;
            case R.id.cQQ:
                break;
            case R.id.userAgreement:
//                用户协议
                Intent intent = new Intent(this, UserAgreementActivity.class);
                startActivity(intent); //执行
                break;
            default:
                break;
        }
    }
}