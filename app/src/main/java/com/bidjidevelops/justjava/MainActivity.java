package com.bidjidevelops.justjava;

import android.icu.text.NumberFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

    public class MainActivity extends AppCompatActivity {
        Button btnorder;
        TextView quantity_Text_View,price_Text_view;
        int quantity = 0;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            btnorder = (Button)findViewById(R.id.btn_order);
            quantity_Text_View = (TextView)findViewById(R.id.quantity_text_view);
            price_Text_view = (TextView)findViewById(R.id.price_Text_View);
        }
    private void tampil(int number){
        quantity_Text_View.setText(""+number);

    }
    private void tampilharga(int number){
        price_Text_view.setText("Rp."+number);
    }
    public void order(View v){
     tampilharga(quantity*2000);
    }
    public void tambah(View v){
        quantity = quantity + 1;
        tampil(quantity);
    }
    public void kurang(View v){
        quantity = quantity - 1;
        tampil(quantity);
    }
}
