package com.apps.niranjana.buttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setting content view "activity_main
        setContentView(R.layout.activity_main);
        //finding button by id and id is button
        Button clickHere = (Button) findViewById(R.id.button);
        //finding EditText by id and id is editText
        final EditText typeHere = (EditText) findViewById(R.id.editText);
        //finding EditText by id and id is etPassword
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        //setting onclickListener
        clickHere.setOnClickListener(new View.OnClickListener() {
            @Override
            //overriding onClick method for button
            public void onClick(View v) {
                //storing value in variable text
               String text = typeHere.getText().toString();
                //stroing value in variable password
                String password = etPassword.getText().toString();
                //comparing the strings
                if(text.equals("sujatha") && password.equals("rose91"))
                    //dispplaying toast
                Toast.makeText(getApplicationContext(),"success",Toast.LENGTH_SHORT).show();
               else
                Toast.makeText(getApplicationContext(),"try again",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
