package com.example.moham.mycv.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.moham.mycv.Models.SessionModel;
import com.example.moham.mycv.Models.webModels.Image;
import com.example.moham.mycv.R;
import com.example.moham.mycv.mvp.home.HomeContract;
import com.squareup.picasso.Picasso;

import java.util.List;

public class HomeRecyclerAdapter extends RecyclerView.Adapter<HomeRecyclerAdapter.MyViewHolder> {

    HomeContract.Presenter presenter;
    Context mContext;
    List<SessionModel> sessionList;
    int itemViewPosition = -1;

    public HomeRecyclerAdapter(Context mContext, List<SessionModel> sessionList) {
        this.mContext = mContext;
        this.sessionList = sessionList;
    }

    @NonNull
    @Override
    public HomeRecyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.sessions_list_item, parent, false);
        MyViewHolder holder = new MyViewHolder(itemView);
        if(itemViewPosition != -1){
            ClickableDisabled(itemView);
        } else{
            ClickableEnabled(itemView);
        }
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull HomeRecyclerAdapter.MyViewHolder holder, int position) {
        holder.sessionTitle.setText(sessionList.get(position).getSessionTitle());
        holder.sessionStatus.setText(sessionList.get(position).getSessionStatus());
        Picasso.get().load(sessionList.get(position).getSessionImageUrl()).into(holder.sessionImage);
        if(!sessionList.get(position).getSessionStatus().equalsIgnoreCase("done")){
            itemViewPosition = position + 1;
        }
    }

    @Override
    public int getItemCount() {
        return sessionList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView sessionTitle;
        TextView sessionStatus;
        ImageView sessionImage;

        public MyViewHolder(View itemView) {
            super(itemView);
            sessionTitle = itemView.findViewById(R.id.sessionTitle);
            sessionStatus = itemView.findViewById(R.id.sessionStatus);
            sessionImage = itemView.findViewById(R.id.sessionImage);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(mContext, sessionTitle.getText().toString(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

    private void ClickableEnabled(View itemView){
        itemView.setClickable(true);
    }
    private void ClickableDisabled(View itemView){
        itemView.setClickable(false);
        itemView.setBackgroundResource(R.color.transparent_white);
    }
}
