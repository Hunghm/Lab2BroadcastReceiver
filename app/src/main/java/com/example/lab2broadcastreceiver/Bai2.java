package com.example.lab2broadcastreceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Bai2 extends AppCompatActivity {
    public static final String CONTENT_BAI2 = "name";
    public static final String ACTION_BAI_2 = "send_action";
    EditText edNhap;
    Button btnSend;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);

        edNhap= (EditText) findViewById(R.id.edBai2);
        btnSend= (Button) findViewById(R.id.btn_send_bai2);
        tv= (TextView) findViewById(R.id.tv_bai2);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textNhap = edNhap.getText().toString();
                Intent intent = new Intent(Bai2.this,BroadcastBai2.class);
                intent.putExtra(CONTENT_BAI2,textNhap);
                intent.setAction(ACTION_BAI_2);
                sendBroadcast(intent);
            }
        });

    }
}