/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.quakereport;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {

       @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);

        // Create a fake list of earthquake locations.
        ArrayList<EarthQuake> earthquakes = new ArrayList<>();
        //add city , date , mag to list
        earthquakes.add(new EarthQuake("Adoni", "4.5", "13-01-1999"));
        earthquakes.add(new EarthQuake("Kurnool", "5.5","25-06-2014"));
        earthquakes.add(new EarthQuake("Hyderabad", "2.3", "27-09-2008"));
        earthquakes.add(new EarthQuake("Vijayawada", "3.5", "04-03-2015"));
        earthquakes.add(new EarthQuake("Indore", "3.5", "03-05-2018"));
        earthquakes.add(new EarthQuake("Nadyal", "4.5", "04-07-2014"));
        earthquakes.add(new EarthQuake("Vidyanagar", "4.9", "25-06-2003"));


        // Create a new {@link Adapter} of earthquakes
        EarthQuakeAdapter listAdapter = new EarthQuakeAdapter(this, earthquakes);
        // Set the adapter on the {@link ListView}
        ListView listView = (ListView) findViewById(R.id.list);
        // so the list can be populated in the user interface
        listView.setAdapter(listAdapter);
    }
}