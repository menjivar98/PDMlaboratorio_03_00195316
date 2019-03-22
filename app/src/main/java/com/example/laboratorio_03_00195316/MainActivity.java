package com.example.laboratorio_03_00195316;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button m_action_submit;
    EditText Et1;
    EditText Et2;
    EditText Et3;
    EditText Et4;
    String Datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Et1 = findViewById(R.id.Et_1);
        Et2 = findViewById(R.id.Et_2);
        Et3 = findViewById(R.id.Et_3);
        Et4 = findViewById(R.id.Et_4);


        Et2.getText().toString();
        Et3.getText().toString();
        Et4.getText().toString();


        m_action_submit = findViewById(R.id.submit_action);


        ((View) m_action_submit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m_intent = new Intent(MainActivity.this,NewActivity.class);
                m_intent.putExtra(AppConstants.TEXT1_KEY,"name: "+Et1.getText().toString(). +
                                                                "Email: " + Et2.getText().toString()+
                                                                "Password: " + Et3.getText().toString() +
                                                                "Gender: " + Et4.getText().toString());
                startActivity(m_intent);

            }
        });

    }
}
