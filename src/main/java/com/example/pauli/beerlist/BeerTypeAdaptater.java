package com.example.pauli.beerlist;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by rudy on 09/04/2018.
 */

public class BeerTypeAdaptater extends
        RecyclerView.Adapter<BeerTypeAdaptater.ViewHolder> {
    private Context context;
    private List<BeerType> list;

    public BeerTypeAdaptater(Context context, List<BeerType> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.single_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        BeerType beerType = list.get(position);

        holder.textId.setText(String.valueOf(beerType.getId()));
        holder.textName.setText(String.valueOf(beerType.getName()));
        holder.textCreateDate.setText(String.valueOf(beerType.getCreateDate()));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textId, textName, textCreateDate;

        public ViewHolder(View itemView) {
            super(itemView);

            textId = itemView.findViewById(R.id.main_id);
            textName = itemView.findViewById(R.id.main_name);
            textCreateDate = itemView.findViewById(R.id.main_create_date);
        }
    }



}
