package com.example.sedantepe.hzlcevap;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class baslamaSayfasi extends AppCompatActivity {
Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baslama_sayfasi);
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Kg Ten Thousand Reason Font.ttc")  // default font
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
        btn = (Button)findViewById(R.id.syfGec);

        //Butonumuza tıklama özelliği kazandırıyoruz.
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //Ardından Intent methodunu kullanarak nereden nereye gideceğini söylüyoruz.
                Intent intocan = new Intent(baslamaSayfasi.this, MainActivity.class);
                startActivity(intocan);
            }
        });



    }
    @Override
    protected void attachBaseContext(Context newBase) {

        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}
