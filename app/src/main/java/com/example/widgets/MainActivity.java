package com.example.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private String[] mountainNames = {"Matterhorn","Mont Blanc","Denali"};
    private String[] mntLocations = {"Alps","Alps","Alaska"};
    private String[] mntHeights = {"4478","4808","6190"};

    private ArrayList<String> listData = new ArrayList<>(Arrays.asList(mountainNames));



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_items,R.id.my_list_items,listData);
        ListView My_ListView = (ListView) findViewById(R.id.my_listview);
        My_ListView.setAdapter(adapter);
        My_ListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Toast.makeText(getApplicationContext(),"Mountaintop is located in: "+mntLocations[i]+" and is "+mntHeights[i]+" meters high.",Toast.LENGTH_LONG).show();
            }
        });
    }
}
