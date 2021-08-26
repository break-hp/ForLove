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
        FragmentPagerAdapter adapter = new MyAdapter(getChildFragmentManager(),fragments, new String[]{"综合", "上周"});
        //获取子fragment才会重新加载
        viewPager.setAdapter(adapter);
        tableLayout.setupWithViewPager(viewPager);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
    class MyAdapter extends FragmentPagerAdapter {
        private List<Fragment> list;
        private String[] titles;
        private Context context;
        public MyAdapter(FragmentManager mFragmentManager,
                                List fragmentList, String[] title) {
            super(mFragmentManager);
            list = fragmentList;
            titles=title;
        }
        @Override
        public Fragment getItem(int i) {
            Fragment fragment = null;
            if (i < list.size()) {
                fragment = list.get(i);
            } else {
                fragment = list.get(0);
            }
            return fragment;
        }

        @Override
        public int getCount() {
            return list.size();
        }
        @Override
        public CharSequence getPageTitle(int position) {
            if (titles != null && titles.length > 0)
                return titles[position];
            return null;
        }
    }
}