package com.example.forlove.View.ui.home;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import com.airbnb.lottie.LottieAnimationView;
import com.example.forlove.R;
import com.example.forlove.databinding.FragmentHomeBinding;
import com.google.android.material.tabs.TabLayout;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private FragmentHomeBinding binding;
//    private LottieAnimationView lottieAnimationView;
    private TabLayout tableLayout;
    private ViewPager viewPager;
    List<Fragment> fragments = new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });
        tableLayout = root.findViewById(R.id.tablayout);
        viewPager = root.findViewById(R.id.viewpager);
        fragments.add(new SonFragment());
        fragments.add(new SonFragment());
        FragmentPagerAdapter adapter = new ViewPagerAdapter(getChildFragmentManager(),fragments, new String[]{"??????", "??????"});
        //?????????fragment??????????????????
        viewPager.setAdapter(adapter);
        tableLayout.setupWithViewPager(viewPager);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}