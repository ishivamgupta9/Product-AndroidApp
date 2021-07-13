package com.example.wedmisttraining;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.GridLayout;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class RecyclerActivity extends AppCompatActivity {

    RecyclerView recyclerView; //object
    List<Products> productsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);


        recyclerView=findViewById(R.id.recycler);
        //kya kya chahiye recycler view ko----1 thing isko layout manager chahiye---


        LinearLayoutManager layoutManager=new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false);



        recyclerView.setLayoutManager(layoutManager);//ab recycler view ready h but isko use krne ke liye hume chahiye adapter which is brain of recycler view

        getProductList();//jaise api call krke data laare h



        //AB HUME ADAPTER ME YE DATA CHAHIYE JO DATA LINE 48 SE 54 ME H KYKOI ON BIND ME HUM BIND KR PAYENGE NAA YE DATA AUR VIEW HOLDER ME

        RecyclerAdapter adapter=new RecyclerAdapter(productsList);
        recyclerView.setAdapter(adapter);

    }

    private void getProductList() {//array list h ye hum wo model se ...but ye static hi hai

        productsList=new ArrayList<>();
        productsList.add(new Products("oreo cookies","yummy.uhgjhjuyubvghhghghhghjjhghkjjhhghgjjghgh..","180"));
        productsList.add(new Products(" Face Wash","Yummy tasty .....","150"));
        productsList.add(new Products("Cream Biscoot","Yummy tasty .....","80"));
        productsList.add(new Products("Binod Cookies","","1800"));
        productsList.add(new Products("nirma Cookies","Yummy tasty .....","10"));
        productsList.add(new Products("Faltu Cookies","hghhhggh","100"));
        productsList.add(new Products("hohohoho Cookies","Yummy tasty .....","18900"));


    //all will be handled by the adapter
    }
}