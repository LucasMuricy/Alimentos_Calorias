package com.example.alimentos.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.alimentos.Entity.FoodEntity;
import com.example.alimentos.R;
import com.example.alimentos.business.FoodBusiness;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //Lista de Alimentos
        List<FoodEntity> list = new FoodBusiness().getList();


        this.mViewHolder.mRecycleFood = findViewById(R.id.recycle_food);
    }
    private static class  ViewHolder{
        RecyclerView mRecycleFood;
    }

}