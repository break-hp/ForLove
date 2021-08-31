package com.example.forlove.View.ui.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.forlove.Object.HomeFriends;
import com.example.forlove.R;

import java.util.List;

/**
 * created by jiangtao on 2021/3/28 9:56
 * breakTT
 */

public class FriendsAdapter extends RecyclerView.Adapter<FriendsAdapter.ViewHolder> {
    private Context mContext;
    private List<HomeFriends> homeFriendsList;

    public FriendsAdapter(List<HomeFriends> homeFriendsList) {
        homeFriendsList = homeFriendsList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (mContext == null) {
            mContext = parent.getContext();
        }
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_share_friend, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        for (int i=0;i<homeFriendsList.size();i++){
            if (homeFriendsList.get(i).getImageId()!=null){
//                设置头像
                Glide.with(mContext).load(homeFriendsList.get(i).getImageId()).into(holder.image_head);
            }
            if (homeFriendsList.get(i).getNickname()!=null){
//                设置昵称
                holder.nickname.setText(homeFriendsList.get(i).getNickname());
            }
            if (homeFriendsList.get(i).getContent()!=null){
//                设置内容
                holder.content.setText(homeFriendsList.get(i).getContent());
            }
            if (homeFriendsList.get(i).getShareimages()!=null){
                //设置九宫格图片的显示
//                Glide.with(mContext).load("https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=1433010920,699236483&fm=26&gp=0.jpg").into(holder.);
            }
            if (homeFriendsList.get(i).getHeart()!=null){
//                设置点赞量
                holder.heart.setText(homeFriendsList.get(i).getHeart());
            }
            if (homeFriendsList.get(i).getComment()!=null){
//                设置评论数
                holder.comment.setText(homeFriendsList.get(i).getComment());
            }
            if (homeFriendsList.get(i).getTime()!=null){
//                设置时间
                holder.time.setText(homeFriendsList.get(i).getTime());
            }
        }

    }

    @Override
    public int getItemCount() {
        return homeFriendsList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        TextView nickname, content,heart,comment,time;
        ImageView image_head, image_heart;
        RecyclerView recyclerView;
//新建适配器
        public ViewHolder(View view) {
            super(view);
            cardView = (CardView) view;
            image_head = (ImageView) view.findViewById(R.id.image1);
            image_heart = view.findViewById(R.id.heart_img);
            nickname = view.findViewById(R.id.friend_name);
            content = view.findViewById(R.id.content);
            heart = view.findViewById(R.id.heart_count);
            comment = view.findViewById(R.id.comment_count);
            time = view.findViewById(R.id.time_text);
            recyclerView = view.findViewById(R.id.friend_images);
        }
    }
}
