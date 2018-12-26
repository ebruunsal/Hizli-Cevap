package com.example.sedantepe.hzlcevap;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    TextView t1,t2,t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        t1=(TextView)findViewById(R.id.textView4);
        t2=(TextView)findViewById(R.id.textView9);
        t3=(TextView)findViewById(R.id.textView);


        Intent i=getIntent();
        String sorular=i.getStringExtra("total");
        String dogru=i.getStringExtra("correct");
        String yanlis=i.getStringExtra("Incorrect");

        t1.setText(sorular);
        t2.setText(dogru);
        t3.setText(yanlis);






        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();




            }

        });
    }

}
