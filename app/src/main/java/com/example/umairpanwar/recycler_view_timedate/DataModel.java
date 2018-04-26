package com.example.umairpanwar.recycler_view_timedate;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataModel implements Serializable {
        private String boldletter;
        private String belowbold;
        private String rightofmap;
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
        private int mapimg;
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

        public void setBoldletter(String boldletter) {
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