package com.example.akhil.dryfish.home;

import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.akhil.dryfish.Cardview;
import com.example.akhil.dryfish.R;

import java.util.ArrayList;
import java.util.List;




public class ArrayAdapter extends RecyclerView.Adapter<ArrayAdapter.RecyclerViewHolder> {

    private List<Inventory> RVsList;



    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        public TextView fname,fplace,fprice;
        public ImageView fimage;
        public CardView itemcard;
       // public ExpandableTextView main_article;

        /*  public ImageView main_article;
  */
        public RecyclerViewHolder(View view) {
            super(view);
            fimage=view.findViewById(R.id.fimage);
            fname=view.findViewById(R.id.fname);
            fplace=view.findViewById(R.id.fplace);
            fprice=view.findViewById(R.id.fprice);
            itemcard=view.findViewById(R.id.itemcard);

        }
    }

    public ArrayAdapter(ArrayList<Inventory> RVsList) {
        this.RVsList = RVsList;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_home, parent, false);
        return new RecyclerViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        Inventory e = RVsList.get(position);
        holder.fimage.setImageResource(e.getFimage());
        holder.fname.setText(e.getFname());
        holder.fplace.setText(e.getFplace());
        holder.fprice.setText(e.getFprice());
        holder.itemcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Cardview.class);
                view.getContext().startActivity(intent);


            }
        });

    }

    @Override
    public int getItemCount() {
        return RVsList.size();
    }
}
