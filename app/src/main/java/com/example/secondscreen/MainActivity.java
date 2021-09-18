package com.example.secondscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

ArrayList<model_pd> model_pdArrayList;
ArrayList<model_rs> model_rsArrayList;
adapterRS adapterRSV;
adapterPD adapterPDV;
RecyclerView RVPD, RVRS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RVPD=findViewById(R.id.recyclerViewPD);
        RVRS=findViewById(R.id.recyclerViewRS);

        model_rsArrayList=new ArrayList<>();

        model_rsArrayList.add(new model_rs(R.drawable.ic_language_24px,"Islamabad, Pakistan","227 Hotels"));
        model_rsArrayList.add(new model_rs(R.drawable.ic_language_24px,"Karachi, Pakistan","350 Hotels"));
        model_rsArrayList.add(new model_rs(R.drawable.home,"Islamabad, Pakistan","227 Hotels"));

        model_pdArrayList=new ArrayList<>();
        model_pdArrayList.add(new model_pd(R.drawable.star__1_,"Islamabad, Pakistan","227 Hotels"));
        model_pdArrayList.add(new model_pd(R.drawable.star__1_,"Karachi, Pakistan","350 Hotels"));
        model_pdArrayList.add(new model_pd(R.drawable.star__1_,"Swat, Pakistan","70 Hotels"));
//        dataList=new ArrayList<>();
//
//       adapter=new myAdapter(dataList);
        model_rsArrayList = new ArrayList<>();
        adapterRSV=new adapterRS(model_rsArrayList);
        RVRS.setAdapter(adapterRSV);

        model_pdArrayList = new ArrayList<>();
        adapterPDV=new adapterPD(model_pdArrayList);
        RVPD.setAdapter(adapterPDV);

    }
}