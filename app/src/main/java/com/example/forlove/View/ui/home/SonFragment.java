package com.example.forlove.View.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.forlove.Object.HomeFriends;
import com.example.forlove.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiangtao
 * on 2021/8/23
 */
public class SonFragment extends Fragment {
    private List<HomeFriends> friendList = new ArrayList<>();
    private FriendsAdapter mListAdapter;
    private RecyclerView recyclerView;

    public SonFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_son, container, false);
        initFriends();
        recyclerView = view.findViewById(R.id.goods_recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL));
        recyclerView.setNestedScrollingEnabled(false);
        mListAdapter = new FriendsAdapter(friendList);
        recyclerView.setAdapter(mListAdapter);
        return view;
    }

    private void initFriends() {
        friendList.clear();
    }

}
