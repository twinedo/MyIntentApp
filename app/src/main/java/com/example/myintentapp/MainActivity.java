package com.example.myintentapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_move_activity, btn_move_activity_data, btn_dial_number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_move_activity = findViewById(R.id.btn_move_activity);
        btn_move_activity_data = findViewById(R.id.btn_move_activity_data);
        btn_dial_number = findViewById(R.id.btn_dial_number);

        btn_move_activity.setOnClickListener(this);
        btn_move_activity_data.setOnClickListener(this);
        btn_dial_number.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_move_activity:
                Intent gotoMoveAct = new Intent(MainActivity.this, MoveActivity.class);
                startActivity(gotoMoveAct);
                break;
            case R.id.btn_move_activity_data:
                Intent gotoMoveWithData = new Intent(MainActivity.this, MoveWithDataActivity.class);
                gotoMoveWithData.putExtra(MoveWithDataActivity.EXTRA_NAME, "Twin Edo");
                gotoMoveWithData.putExtra(MoveWithDataActivity.EXTRA_AGE, 23);
                startActivity(gotoMoveWithData);
                break;
            case R.id.btn_dial_number:
                String phoneNumber = "08123456789";
                Intent gotoDialPhone = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
                startActivity(gotoDialPhone);
                break;
        }
    }
}
