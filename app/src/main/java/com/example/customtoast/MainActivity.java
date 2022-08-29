package com.example.customtoast;

import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //default toast
        //Toast.makeText(getApplicationContext(),"this is normal toast", Toast.LENGTH_LONG).show();
        btn1= findViewById(R.id.click);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast toast = new Toast(getApplicationContext());

                View view = getLayoutInflater().inflate(R.layout.custom_toast_layout, findViewById(R.id.viewContainer));

                toast.setView(view);

                TextView txtMessage = findViewById(R.id.txtMessage);

                toast.setDuration(toast.LENGTH_LONG);

                toast.show();

                toast.setGravity(Gravity.TOP,0,0);

            }
        });





    }
}