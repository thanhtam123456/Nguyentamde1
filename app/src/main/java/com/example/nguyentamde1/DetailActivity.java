package com.example.nguyentamde1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.nguyentamde1.Model.dsmodel;

public class DetailActivity extends AppCompatActivity {
    TextView tvTen ;
    TextView tvMa ;
    TextView tvSo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actuvuty_detail);
       onInit();
        onGetIntent();
}
    private void onGetIntent() {
        Intent intent = getIntent();
        dsmodel model = (dsmodel) intent.getSerializableExtra("dsmodel");
        tvTen.setText("Ten: " + model.getTen());
        tvMa.setText("Ma: " + model.getMa());
        tvSo.setText("So: " + model.getSo());
    }

   private void onInit() {
      tvTen = findViewById(R.id.model_detail_ten);
      tvMa = findViewById(R.id.model_detail_ma);
    tvSo= findViewById(R.id.model_detail_so);
    }

}
