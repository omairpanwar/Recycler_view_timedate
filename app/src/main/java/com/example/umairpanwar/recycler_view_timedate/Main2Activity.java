package com.example.umairpanwar.recycler_view_timedate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView textView;
    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle bundle = getIntent().getExtras();
        DataModel dataModel = (DataModel) bundle.getSerializable("ff");
        TextView tv = findViewById(R.id.mainactivity2TextView);
        tv.setText(String.valueOf(dataModel.getBelowbold() + dataModel.getDatee()));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
