package com.example.umairpanwar.recycler_view_timedate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle bundle = getIntent().getExtras();
        DataModel dataModel = (DataModel) bundle.getSerializable("ff");
        TextView tv1 = findViewById(R.id.mainactivity2TextView1);
        tv1.setText(String.valueOf(dataModel.getBoldletter()));
        TextView tv2 = findViewById(R.id.mainactivity2TextView2);
        tv2.setText(String.valueOf(dataModel.getBelowbold()));
        TextView tv3 = findViewById(R.id.mainactivity2TextView3);
        tv3.setText(String.valueOf(dataModel.getDatee()));
        TextView tv4 = findViewById(R.id.mainactivity2TextView4);
        tv4.setText(String.valueOf(dataModel.getRightofmap()));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
