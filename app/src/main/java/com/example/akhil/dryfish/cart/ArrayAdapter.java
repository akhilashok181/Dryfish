package com.example.akhil.dryfish.cart;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.akhil.dryfish.R;

import java.util.List;




public class ArrayAdapter extends RecyclerView.Adapter<ArrayAdapter.RecyclerViewHolder>
{

    private List<Inventory> RVcList;


    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        public TextView fname,fplace,fprice;
        public ImageView fimage;
        // public ExpandableTextView main_article;

        /*  public ImageView main_article;
         */
        public RecyclerViewHolder(View view) {
            super(view);
            fname=view.findViewById(R.id.fname);
            fplace=view.findViewById(R.id.fplace);
            fprice=view.findViewById(R.id.fprice);

        }
    }

    public ArrayAdapter(List<Inventory> RVcList) {
        this.RVcList = RVcList;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_cart, parent, false);
        return new RecyclerViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        Inventory e = RVcList.get(position);
        holder.fname.setText(e.getFname());
        holder.fplace.setText(e.getFplace());
        holder.fprice.setText(e.getFprice());

    }

    @Override
    public int getItemCount() {
        return RVcList.size();
    }
}
