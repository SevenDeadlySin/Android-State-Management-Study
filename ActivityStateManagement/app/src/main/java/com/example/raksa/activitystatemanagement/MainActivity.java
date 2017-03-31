package com.example.raksa.activitystatemanagement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView textView;
    EditText editText;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editText = (EditText) findViewById(R.id.editTextName);
        textView = (TextView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.button);

        if (savedInstanceState!=null){
         textView.setText(savedInstanceState.getString("TEXTSAVED"));
            editText.setText(savedInstanceState.getString("EDITTEXTSAVED"));
        }


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("The Button Was Click !!");
            }
        });

    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("TEXTSAVED",textView.getText().toString());
        outState.putString("EDITTEXTSAVED",editText.getText().toString());
    }
}
