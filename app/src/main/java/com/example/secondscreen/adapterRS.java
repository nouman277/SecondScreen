package com.example.secondscreen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;



public class adapterRS extends RecyclerView.Adapter<adapterRS.myViewHolder>
{
    ArrayList<model_rs> dataList;

    public adapterRS(ArrayList<model_rs> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.singal_item_rs,parent,false);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {

        // holder.firstName.setText(dataList.get(position).getFirstName());

        holder.cityCountryRS.setText(dataList.get(position).getCityCountryRS());
        holder.numbhotelsRS.setText(dataList.get(position).getNumbhotelsRS());
        holder.imageRS.setImageLevel(dataList.get(position).getImageRS());


    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    class myViewHolder extends RecyclerView.ViewHolder
    {
        TextView cityCountryRS, numbhotelsRS;
        ImageView imageRS;
        public myViewHolder(@NonNull View itemView) {
            super(itemView);

            // firstName = itemView.findViewById(R.id.firstNameET);

            cityCountryRS=itemView.findViewById(R.id.cityContryTVRS);
            numbhotelsRS=itemView.findViewById(R.id.numbHotelsRS);
            imageRS=itemView.findViewById(R.id.imageViewRS);

        }
    }
}
