package com.example.wedmisttraining;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class RecyclerViewAdapterChats extends RecyclerView.Adapter<RecyclerViewAdapterChats.MyViewHolder> {


    Context mcontentxt;//1
    List<chat> mData;//2

    public RecyclerViewAdapterChats(Context mcontentxt, List<chat> mData) {//3 constructor direct generate
        this.mcontentxt = mcontentxt;
        this.mData = mData;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;//after implement this menthod    //4
        view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_chat,parent,false);//5
        MyViewHolder viewHolder=new MyViewHolder(view);//6
        return viewHolder;//7
    }

    @Override
    public void onBindViewHolder( RecyclerViewAdapterChats.MyViewHolder holder, int position) {


        holder.tv_Name.setText(mData.get(position).getName());//15
        holder.tv_phone.setText(mData.get(position).getPhone());//16
        holder.img.setImageResource(mData.get(position).getPhoto());//17



    }

    @Override
    public int getItemCount() {
        return mData.size();//8
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView tv_Name;//9
        private TextView tv_phone;//10
        private ImageView img;//11


        public MyViewHolder( View itemView) {
            super(itemView);

            tv_Name=itemView.findViewById(R.id.name_chat);//12
            tv_phone=itemView.findViewById(R.id.phone_contact);//13
            img=itemView.findViewById(R.id.imagechat);//14



        }
    }



}
