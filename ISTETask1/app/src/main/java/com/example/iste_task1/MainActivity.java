package com.example.iste_task1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onLogin(View view){
        EditText Username=(EditText) findViewById(R.id.editText3);
        EditText Password=(EditText) findViewById(R.id.editText);
        Toast myToast;
        if(Username.getText().toString().equals(Password.getText().toString())){
            myToast=Toast.makeText(this,"Login Successful!",Toast.LENGTH_SHORT);
            myToast.show();
        }else{
            myToast=Toast.makeText(this,"Incorrect Password",Toast.LENGTH_SHORT);
            myToast.show();
        }


    }
}
