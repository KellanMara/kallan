package com.krayrr.Activity;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.krayrr.Helper.AppController;
import com.krayrr.R;

public class Campaigndetail extends AppCompatActivity {

    String [] trip = {"5 JAN 2018","5 April 2018", "5 May 2018"} ;
    String [] earning ={"RS.250", "RS.450", "RS.500"};
    String [] distance  ={"20 KM", "45 KM", "50 KM"};
    RecyclerView recyclerView;

    AppController controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campaigndetail);

        controller =new AppController();

        recyclerView = findViewById(R.id.rvEarningOverview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(new RecyclerView.Adapter() {
            @NonNull
            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(getApplicationContext()).inflate(R.layout.earningoverview,parent,false);
                Holder holder =new Holder(view);
                return holder;
            }

            @Override
            public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
                Holder holder1=(Holder) holder;
                holder1.trip.setText(trip[position]);
                holder1.eraning.setText(earning[position]);
                holder1.distance.setText(distance[position]);
            }

            @Override
            public int getItemCount() {
                return earning.length;
            }
            class Holder extends RecyclerView.ViewHolder{
                TextView trip , eraning ,distance ;
                public Holder(View itemView) {
                    super(itemView);
                    trip=itemView.findViewById(R.id.ovTrip);
                    eraning=itemView.findViewById(R.id.ovEarning);
                    distance=itemView.findViewById(R.id.ovDistance);
                }
            }
        });
    }
}
