package com.pthhack22.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    Button btnHenGio, btnDungLai;
    TimePicker timePicker;
    TextView txtHienThi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        btnHenGio = (Button)findViewById( R.id.btnHenGio );
        btnDungLai = (Button)findViewById( R.id.btnDungLai );
        txtHienThi = (TextView)findViewById( R.id.textView );
        timePicker = (TimePicker)findViewById( R.id.timePicker );

        btnHenGio.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtHienThi.setText( "Giờ bạn đặt là:" );
            }
        } );
        btnDungLai.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtHienThi.setText( "Dừng lại" );
            }
        } );
    }
}
