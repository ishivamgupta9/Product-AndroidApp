package com.example.wedmisttraining;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import androidx.recyclerview.widget.RecyclerView;



import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {
   private List<Products>products;


    public RecyclerAdapter(List<Products> products) {//ab jaise hi ye object create hogaa ye product pe kuchh data aa jaegaa
        this.products = products;
    }


    @Override

    //ye 3 method hi use krna h aur inhi kaa kaam rhega
    public RecyclerViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {//so ye method h jo on create view holder jo niche class h usko bind kregaaa
        return new RecyclerViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item,parent,false));

    //<-yaha p kyaa krnaa hai wo view ko add krnaa hai wo item wala
    }

    @Override
    public void onBindViewHolder( RecyclerViewHolder holder, int position) {//All the logic hogaaa usse yaha likhna hai--but before adding logic we need model


        Products current_products=products.get(position);
        holder.title.setText(current_products.getTitle());
        holder.description.setText(current_products.getDescription());
        holder.price.setText(current_products.getPrice());


     // if(  current_products.getDescription().length()>10) {
          //holder.description.setText(current_products.getDescription().substring(0, 9) + "..........");
     // }


        holder.add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"added",Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public int getItemCount() {//JO product ka list h uska size kitnaa hogaa use hume likhna h get item count me
        return products.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder { //A ViewHolder is more than just a dumb object that only holds the item’s views

       public TextView title,description,price,add;
       public ImageView image;
       //YAHA PE FIND VIEW BY ID NAHI KRNA H ITEM VIEW.





        public RecyclerViewHolder(View itemView) {
            super(itemView);

            title=itemView.findViewById(R.id.title);
            description=itemView.findViewById(R.id.desc);
            price=itemView.findViewById(R.id.price);
            add=itemView.findViewById(R.id.addBtn);
            image=itemView.findViewById(R.id.image);//done


        }
    }


}
