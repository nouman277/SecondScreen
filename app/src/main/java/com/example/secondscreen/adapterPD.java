package com.example.secondscreen;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adapterPD extends RecyclerView.Adapter<adapterPD.myViewHolder>
{
    ArrayList<model_pd> dataList;

    public adapterPD(ArrayList<model_pd> dataList) {
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

        holder.cityCountryPD.setText(dataList.get(position).getCityCountryPD());
        holder.numbhotelsPD.setText(dataList.get(position).getNumbHotels());
        holder.imagePD.setImageLevel(dataList.get(position).getImagePD());


    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    class myViewHolder extends RecyclerView.ViewHolder
    {
        TextView cityCountryPD, numbhotelsPD;
        ImageView imagePD;
        public myViewHolder(@NonNull View itemView) {
            super(itemView);

            // firstName = itemView.findViewById(R.id.firstNameET);

            cityCountryPD=itemView.findViewById(R.id.cityContryTVPD);

            numbhotelsPD=itemView.findViewById(R.id.numbHotelsPD);
            imagePD=itemView.findViewById(R.id.imagePD);

        }
    }
}
