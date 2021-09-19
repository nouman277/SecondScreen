package com.example.secondscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView RVPD, RVRS;
    ArrayList<model_pd> dataListPD;
    ArrayList<model_rs> dataListRS;
    adapterRS adapterRSV;
    adapterPD adapterPDV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        dataListRS=new ArrayList<>();
        dataListRS.add(new model_rs(R.drawable.ic_language_24px,"Islamabad, Pakistan","227 Hotels"));
        dataListRS.add(new model_rs(R.drawable.ic_language_24px,"Karachi, Pakistan","350 Hotels"));
        dataListRS.add(new model_rs(R.drawable.home,"Karachi Hyatt Hotel","9.6/10"));

        RVRS = findViewById(R.id.recyclerViewRS);
        RVRS = (RecyclerView) findViewById(R.id.recyclerViewRS);
        RVRS.setLayoutManager(new LinearLayoutManager(this));

        adapterRSV = new adapterRS(dataListRS);
        RVRS.setAdapter(adapterRSV);
        adapterRSV.notifyDataSetChanged();



        dataListPD=new ArrayList<>();
        dataListPD.add(new model_pd(R.drawable.star__1_,"Islamabad, Pakistan","227 Hotels"));
        dataListPD.add(new model_pd(R.drawable.star__1_,"Karachi, Pakistan","350 Hotels"));
        dataListPD.add(new model_pd(R.drawable.star__1_,"Swat, Pakistan","70 Hotels"));

        RVPD = findViewById(R.id.recyclerViewPD);
        RVPD = (RecyclerView) findViewById(R.id.recyclerViewPD);
        RVPD.setLayoutManager(new LinearLayoutManager(this));

        adapterPDV = new adapterPD(dataListPD);
        RVPD.setAdapter(adapterPDV);
        adapterRSV.notifyDataSetChanged();


    }
}