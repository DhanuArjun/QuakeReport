package com.example.android.quakereport;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

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

        TextView dateList = (TextView) listItemView.findViewById(R.id.date);
        dateList.setText(list.getDate());

        return listItemView;
    }
}