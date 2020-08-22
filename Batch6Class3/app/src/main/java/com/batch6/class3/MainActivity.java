package com.batch6.class3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView x;
        Button b, n;
        final EditText e;
        final EditText e2;

        x = findViewById(R.id.text12);
        b = findViewById(R.id.change);
        e = findViewById(R.id.editText);
        e2 = findViewById(R.id.editText_2);
        n = findViewById(R.id.next);



        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this,AnotherPage.class));

            }
        });


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String something = e.getText().toString();

                Integer a, b;

                a = Integer.valueOf(e.getText().toString());

                b = Integer.valueOf(e2.getText().toString());

                String s = String.valueOf(a + b);

                x.setText(s);
                Log.e("BATCH6",s);
            }
        });
    }
}
