package com.example.umairpanwar.recycler_view_timedate;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private Context context;
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.context = this;
        recyclerView = findViewById(R.id.mainRecyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        OurAdapter adapter = new OurAdapter();
        recyclerView.setAdapter(adapter);

    }
    public class OurAdapter extends RecyclerView.Adapter<OurAdapter.ViewHolder>{
        DataModel[] dataModels = new DataModel[10];

        public OurAdapter() {

            dataModels[0] = new DataModel("trt","hgfhhf","pakista","24-feb 02:58 PM",R.drawable.abc,R.drawable.map,R.drawable.heart);
            dataModels[1] = new DataModel("trt","hgfhhf","pakistan","25-aug 03:58 PM",R.drawable.abc,R.drawable.map,R.drawable.heart);
            dataModels[2] = new DataModel("trt","hgfhhf","pakistan","32-feb 04:44 PM",R.drawable.abc,R.drawable.map,R.drawable.heart);
            dataModels[3] = new DataModel("trt","hgfhhf","pakistan","44-jul 12:23 AM",R.drawable.abc,R.drawable.map,R.drawable.heart);
            dataModels[4] = new DataModel("trt","hgfhhf","pakistan","25-mar 11:55 AM",R.drawable.abc,R.drawable.map,R.drawable.heart);
            dataModels[5] = new DataModel("trt","hgfhhf","pakistan","25-mar 02:55 PM",R.drawable.abc,R.drawable.map,R.drawable.heart);
            dataModels[6] = new DataModel("trt","hgfhhf","pakistan","25-mar 22:55 AM",R.drawable.abc,R.drawable.map,R.drawable.heart);
            dataModels[7] = new DataModel("trt","hgfhhf","pakistan","25-mar 12:22 AM",R.drawable.abc,R.drawable.map,R.drawable.heart);
            dataModels[8] = new DataModel("trt","hgfhhf","pakistan","25-mar 3:23 PM",R.drawable.abc,R.drawable.map,R.drawable.heart);
            dataModels[9] = new DataModel("trt","hgfhhf","pakistan","25-mar 11:11 PM",R.drawable.abc,R.drawable.map,R.drawable.heart);


        }

        @NonNull
        @Override
        public OurAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.recyclerview,parent,false));
        }

        @Override
        public void onBindViewHolder(@NonNull OurAdapter.ViewHolder holder, int position) {

            DataModel item = dataModels[position];
            holder.textViewbelowbold.setText(item.getBoldletter());
            holder.textViewbelowbold.setText(item.getBelowbold());
            holder.textViewrightMap.setText(item.getRightofmap());
            holder.textViewdate.setText(String.valueOf(item.getDatee()));
        //    holder.imageViewbig.setImageResource(item.getBigimage());
            holder.imageViewmap.setImageResource(item.getMapimg());
            holder.imageViewheart.setImageResource(item.getHeartimg());

        }
        @Override
        public int getItemCount() {
            return dataModels.length;
        }
        public class ViewHolder extends RecyclerView.ViewHolder{
            TextView textViewbold;
            TextView textViewbelowbold;
            TextView textViewrightMap;
            TextView textViewdate;
        //    ImageView imageViewbig;
            ImageView imageViewmap;
            ImageView imageViewheart;

            public ViewHolder(View itemView) {
                super(itemView);
                textViewbold = itemView.findViewById(R.id.mainTextView);
                textViewbelowbold = itemView.findViewById(R.id.mainTextView2);
                textViewrightMap = itemView.findViewById(R.id.mainTextView3);
                textViewdate = itemView.findViewById(R.id.mainTextView4);
              //  imageViewbig = itemView.findViewById(R.id.mainImageView);
                imageViewmap = itemView.findViewById(R.id.mainImageView2);
               imageViewheart = itemView.findViewById(R.id.mainImageView3);
            }
        }
    }
    public class DataModel{
        private String boldletter;
        private  String belowbold;
        private  String rightofmap;
        private String datee = "29/7/2018";
        Date date;

        {
            try {
                date = new SimpleDateFormat("dd/MM/yyyy").parse(datee);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    //    private int bigimage;
        private  int mapimg;
        private int heartimg;


        public DataModel(String boldletter, String belowbold, String rightofmap, String datee, int bigimage, int mapimg, int heartimg) {
            this.boldletter = boldletter;
            this.belowbold = belowbold;
            this.rightofmap = rightofmap;
            this.datee = datee;
       //     this.bigimage = bigimage;
            this.mapimg = mapimg;
            this.heartimg = heartimg;
        }

        public String getBoldletter() {

            return boldletter;
        }

        public void setBoldletter(String boldletter)
        {
            this.boldletter = boldletter;
        }

        public String getBelowbold() {

            return belowbold;
        }

        public void setBelowbold(String belowbold) {

            this.belowbold = belowbold;
        }

        public String getRightofmap() {
            return rightofmap;
        }

        public void setRightofmap(String rightofmap) {
            this.rightofmap = rightofmap;
        }

        public String getDatee() {
            return datee;
        }

      /*  public void setDate(String date) {
            this.datee = datee;
        }

        public int getBigimage() {
            return bigimage;
        }

        public void setBigimage(int bigimage) {
            this.bigimage = bigimage;
        }*/

        public int getMapimg() {
            return mapimg;
        }

        public void setMapimg(int mapimg) {
            this.mapimg = mapimg;
        }

        public int getHeartimg() {
            return heartimg;
        }

        public void setHeartimg(int heartimg) {
            this.heartimg = heartimg;
        }
    }
}
