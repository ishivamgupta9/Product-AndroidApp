package com.example.wedmisttraining;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class ChatFragment extends Fragment {

   View v;
   private RecyclerView myrecyclerview;//18
    private List<chat> lstchat;//19

    public ChatFragment() {
    }


    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.fragment_chat,container,false);

        myrecyclerview=v.findViewById(R.id.chat_recyclerview);//22
        RecyclerViewAdapterChats recyclerViewAdapterChats=new RecyclerViewAdapterChats(getContext(),lstchat);//23
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));//24
        myrecyclerview.setAdapter(recyclerViewAdapterChats);//25



        return v;
    }



    // Generate override --oncreate saved instances//20


    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstchat=new ArrayList<>();//21 with all add
        lstchat.add(new chat("elephant","+917787887897",R.drawable.elephant));
        lstchat.add(new chat("water","+917787887847",R.drawable.water));
        lstchat.add(new chat("nature","+917787887897",R.drawable.scene));
        lstchat.add(new chat("elephant","+917787887897",R.drawable.elephant));
        lstchat.add(new chat("water","+917787887847",R.drawable.water));
        lstchat.add(new chat("nature","+917787887897",R.drawable.scene));
        lstchat.add(new chat("elephant","+917787887897",R.drawable.elephant));
        lstchat.add(new chat("water","+917787887847",R.drawable.water));
        lstchat.add(new chat("nature","+917787887897",R.drawable.scene));




    }
}