package com.example.alimentos.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import com.example.alimentos.R;

public class DetailsActivity extends AppCompatActivity {

    private ViewHolder mViewHolder = new ViewHolder();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        //Elementos e interface
        this.mViewHolder.mTextName = findViewById(R.id.Text_name);
        this.mViewHolder.mTextCalories = findViewById(R.id.Text_calories);
    }

    private static class ViewHolder {
        TextView mTextName;
        TextView mTextCalories;
    }

}