package com.example.pauli.beerlist;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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
        final BeerType beerType = list.get(position);

        holder.textName.setText(String.valueOf(beerType.getName()));

        holder.share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT,context.getString(R.string.ready)+"\n" + beerType.getName() + "\n"+ context.getString(R.string.tonight));
                intent.setType("text/plain");
                context.startActivity(Intent.createChooser(intent, context.getString(R.string.send)));

            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textId, textName, textCreateDate;
        public Button share;

        public ViewHolder(View itemView) {
            super(itemView);

            share = itemView.findViewById(R.id.btnShare);
            textName = itemView.findViewById(R.id.main_name);
        }
    }

}
