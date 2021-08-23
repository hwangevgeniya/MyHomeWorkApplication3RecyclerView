package com.geektech.myhomeworkapplication3recyclerview;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.CountryViewHolder>{

    private ArrayList<Country> list = new ArrayList();

    public void setList(ArrayList<Country> list) {
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    @NonNull

    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CountryViewHolder(LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_country, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class CountryViewHolder extends RecyclerView.ViewHolder {

        private TextView tvCountry, tvCapital;
        private ImageView ivImageFlag;

        public CountryViewHolder(@NonNull View itemView) {
            super(itemView);
            tvCountry = itemView.findViewById(R.id.tv_country);
            tvCapital = itemView.findViewById(R.id.tv_capital);
            ivImageFlag = itemView.findViewById(R.id.iv_flag);
        }

        public void onBind(Country country) {

            tvCountry.setText(country.getCountry());
            tvCapital.setText(country.getCapital());
            ivImageFlag.setImageResource(country.getImage());
        }
    }
}
