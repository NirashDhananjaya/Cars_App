package com.example.nirash.cars_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ButtonClick(View view){

        EditText et1 = (EditText) findViewById(R.id.Myemail);
        EditText et2 = (EditText) findViewById(R.id.Mypass);

        String email = et1.getText().toString();
        String pass = et2.getText().toString();

        String oemail = "admin";
        String opass = "admin";



        if(email.equals(oemail) && pass.equals(opass) )
        {
            Intent intent = new Intent(this,Navigation.class);
            startActivity(intent);
        }

        else
        {

            Toast toast = Toast.makeText(this, "Invalid Email or Password",Toast.LENGTH_LONG);
            toast.show();
        }

    }
}
