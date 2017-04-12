package com.example.artur.zadanie5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView list ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView) findViewById(R.id.listView1);

        final String values[] = {"Sony Ericsson K300i", "Samsung SGH-J700", "Nokia N90", "LG KU990"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.activity_text, values);

        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                        int position, long id)  {
                if(position == 0){
                    Intent myintent = new Intent(view.getContext(),SEActivity.class);
                    startActivityForResult(myintent,0);
                }

                if(position == 1){
                    Intent myintent = new Intent(view.getContext(),SamsungActivity.class);
                    startActivityForResult(myintent,1);
                }

                if(position == 2){
                    Intent myintent = new Intent(view.getContext(),NokiaActivity.class);
                    startActivityForResult(myintent,2);
                }

                if(position == 3){
                    Intent myintent = new Intent(view.getContext(),LGActivity.class);
                    startActivityForResult(myintent,3);
                }
            }
        });

    }

}
