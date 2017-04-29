package com.bidjidevelops.justjava;

import android.icu.text.NumberFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

    public class MainActivity extends AppCompatActivity {
//        memberi nama variabel widget yang mewakilkan widget widget yang ada di layout
        Button btnorder;
        TextView quantity_Text_View,price_Text_view;
//        membuat variabel yang langsung di isi datanya
        int quantity = 0;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
//            memperkenalkan widget yang ada di layout
            btnorder = (Button)findViewById(R.id.btn_order);
            quantity_Text_View = (TextView)findViewById(R.id.quantity_text_view);
            price_Text_view = (TextView)findViewById(R.id.price_Text_View);
//            onclick cara pertama cara kedua ada di layout
//            btnorder.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//
//                }
//            });
        }
//        membuat method yang dengan parametr di dalamnya nah untuk kali ini saya membuat parameternya dengan type data int
    private void tampil(int number){
        quantity_Text_View.setText(""+number);

    }
    private void tampilharga(int number){
//        mengubah text price_Text_view menjadi "RP.'nomer yang di input'"
        price_Text_view.setText("Rp."+number);
    }
//    cara memanggil onclick yang ada di layout

    public void order(View v){
//memanggil method yang di buat di atas dan memasukan quantity * 2000 sebagai parameternya
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
