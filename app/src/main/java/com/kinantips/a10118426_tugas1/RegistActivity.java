package com.kinantips.a10118426_tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
/**
 * 8 April 2021
 * 10118426
 * Kinanti Trimutiara Putri Setiawan
 * IF-10
 */
public class RegistActivity extends Activity {

    Button regist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regist);

        regist = (Button) findViewById(R.id.btnRegist);

        regist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegistActivity.this, LoginActivity.class);
                RegistActivity.this.startActivity(intent);
                RegistActivity.this.finish();
            }
        });
    }
}