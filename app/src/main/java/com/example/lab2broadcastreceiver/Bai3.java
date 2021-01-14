package com.example.lab2broadcastreceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Bai3 extends AppCompatActivity {

    public static final String CONTENT = "noi_dung_bai3";
    TextView tv;
    Button btnCheck;
    BroadcastBai3 broadcastBai3;
    EditText edNhap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);
        tv= (TextView) findViewById(R.id.tv_bai3);
        btnCheck= (Button) findViewById(R.id.btn_check);
        edNhap= (EditText) findViewById(R.id.ed_bai3);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nhap = edNhap.getText().toString();
                Intent intent = new Intent(Bai3.this,BroadcastBai3.class);
                intent.putExtra(CONTENT,nhap);
                intent.setAction("broadcast_receiver_bai3");
                sendBroadcast(intent);
            }
        });
    }

}