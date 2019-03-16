package com.example.nguyentamde1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import com.example.nguyentamde1.Model.dsmodel;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {
    ListView listView;

    static List<dsmodel> modelList;
    static ListViewAdapter adapter;
    ImageButton btn_back2;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);




        onInit();
        onSetData();
        anhxa();
        adapter = new ListViewAdapter(ListViewActivity.this, R.layout.item_listview, modelList);
        listView.setAdapter(adapter);

    }

    private void onSetData() {
        modelList = new ArrayList();
        modelList.add(new dsmodel(0, "Android", "+2HC2583", "3"));
        modelList.add(new dsmodel(1, "AV1", "+2HC258", "4"));
        modelList.add(new dsmodel(2, "A2", "2HC2589", "2"));
        modelList.add(new dsmodel(3, "AV2", "2HC2589", "2"));
        modelList.add(new dsmodel(4, "ASS", "2HC258", "2"));
        modelList.add(new dsmodel(5, "LSL", "2HC2589", "4"));
        modelList.add(new dsmodel(6, "SS5i", "2HC258", "5"));
        modelList.add(new dsmodel(7, "TnQQ", "2HC258", "1"));
    }

    @SuppressLint("WrongViewCast")
    private void onInit() {
        listView = findViewById(R.id.lv_danhsachmon);

    }
    @SuppressLint("WrongViewCast")
    private void anhxa(){
        btn_back2= findViewById(R.id.btn_back);
        btn_back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(ListViewActivity.this ,MainActivity.class);
                startActivity(intent);
            }
        });
    }

}