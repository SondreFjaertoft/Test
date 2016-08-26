package com.example.e_e_s.myfancychat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.button;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ImageButton sendButton = (ImageButton)findViewById(R.id.imageButton);
        //sendButton.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View v) {
        //        Toast.makeText(getApplicationContext(), "Heia verden", Toast.LENGTH_LONG).show();
        //    }
        //});
    }

    private EditText writeText;
    private TextView textView1;



    public void buttonOnClick(View v)
    {
        Button button = (Button) v;
        //button.setOnClickListener(new View.OnClickListener());
        writeText = (EditText) findViewById(R.id.editText1);
        textView1 =  (TextView) findViewById(R.id.textView1);
        textView1.setText(writeText.getText());
        writeText.setText("");
    }

}
