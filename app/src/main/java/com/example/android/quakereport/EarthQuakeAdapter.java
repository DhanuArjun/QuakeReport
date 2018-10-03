package com.example.android.quakereport;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class EarthQuakeAdapter extends ArrayAdapter<EarthQuake> {

    public EarthQuakeAdapter (Activity context, ArrayList<EarthQuake> earthquakes ){

        super(context, 0, earthquakes);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null ){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        EarthQuake list = getItem(position);

        TextView magnitude = (TextView) listItemView.findViewById(R.id.magnitude);
        magnitude.setText(list.getMagnitude());

        TextView cityList = (TextView) listItemView.findViewById(R.id.city);
        cityList.setText(list.getCity());

        //create a new date object from dateInMilliseconds
        Date dateObject = new Date(list.getDate());

        //find text view with date id
        TextView dateList = (TextView) listItemView.findViewById(R.id.date);
        //format the data string (ie sep 3, 2018)
        String formattedDate = formatDate(dateObject);
        dateList.setText(formattedDate);

        //find text view for display time
        TextView timeView = (TextView) listItemView.findViewById(R.id.time);
        //format the time string (ie 2:30PM)
        String formatTime = formateTime(dateObject);
        timeView.setText(formatTime);

        return listItemView;
    }
    /**
     * Return the formatted date string (i.e. "Mar 3, 1984") from a Date object.
     */
    private String formatDate(Date dateObject){
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }
    private String formateTime(Date dateObject){
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);
    }
}