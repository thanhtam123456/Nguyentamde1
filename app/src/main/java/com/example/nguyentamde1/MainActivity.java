package com.example.nguyentamde1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn_EXIT,btn_login;
    TextView tnotaccountext ,txt_tk,txt_mk;
    EditText edit_tk ,edit_mk ;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_login=(Button)findViewById(R.id.btn_login);
        edit_tk=(EditText)findViewById(R.id.edit_tk);
        edit_mk=(EditText)findViewById(R.id.edit_mk) ;
        txt_tk =(TextView)findViewById(R.id.txt_tk);
        txt_mk=(TextView)findViewById(R.id.txt_mk);



        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText taikhoan =(EditText)findViewById(R.id.edit_tk);
                EditText matkhau= (EditText)findViewById(R.id.edit_mk) ;
                String txt_tk = taikhoan.getText().toString();
                String txt_mk = matkhau.getText().toString();
                if (txt_tk.equals("admin")&& txt_mk.equals("admin")){
                    Intent intent =new Intent(MainActivity.this ,ListViewActivity.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(getApplicationContext(),"Đăng nhập thất bại . Vui lòng thử lại",Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}