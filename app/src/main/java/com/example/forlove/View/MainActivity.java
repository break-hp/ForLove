package com.example.forlove.View;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.forlove.Base.BaseActivity;
import com.example.forlove.Presenter.MainPresenter;
import com.example.forlove.R;
import com.example.forlove.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import org.jetbrains.annotations.NotNull;

import java.util.Timer;
import java.util.TimerTask;


public class MainActivity extends BaseActivity<MainPresenter> {

    private ActivityMainBinding binding;
    private MenuItem item1, item2, item3, item4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_recommend, R.id.navigation_massage, R.id.navigation_myself)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);



        Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.view_anim_scale);
        navView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull @NotNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_home:
//                        viewPager.setCurrentItem(0);
                        showAnimate(item);
                        break;
                    case R.id.navigation_recommend:
//                        viewPager.setCurrentItem(1);
//                        showAnimate(item);
                        break;
                    case R.id.navigation_massage:
//                        viewPager.setCurrentItem(2);
//                        showAnimate(item);
                        break;
                    case R.id.navigation_myself:
//                        viewPager.setCurrentItem(3);
//                        showAnimate(item);
                        break;
                }
                return false;
            }
        });
    }
    /**
     * item做动画
     *
     * @param item
     */
    MenuItem menuItem;
    private void showAnimate(MenuItem item) {
        hideAnimate();
        menuItem= item;
        //这里使用一个ImageView设置成MenuItem的ActionView，这样我们就可以使用这个ImageView显示旋转动画了
        ImageView imageView = findViewById(R.id.imageView9);
        imageView.setImageResource(R.mipmap.nav_home);

//        ImageView qrView = (ImageView) getLayoutInflater().inflate(R.layout.action_view, null);
//        menuItem.setActionView(qrView);

        menuItem.setActionView(imageView);
        //显示动画
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.shake);
        animation.setRepeatMode(Animation.RESTART);
        animation.setRepeatCount(Animation.INFINITE);

        imageView.startAnimation(animation);

//        qrView.startAnimation(animation);
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(getBaseContext(),"就是这样",Toast.LENGTH_SHORT).show();
//                hideAnimate();
            }
        });
    }
    /**
     * 关闭动画
     */
    private void hideAnimate() {
        if(menuItem != null){
            View view = menuItem.getActionView();
            if(view != null){
                view.clearAnimation();
                menuItem.setActionView(null);
            }
        }
    }
    @Override
    public MainPresenter initPresenter() {
        return new MainPresenter(MainActivity.this);
    }

    private void run() {

    }
}