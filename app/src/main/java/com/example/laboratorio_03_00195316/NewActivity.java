package com.example.laboratorio_03_00195316;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class NewActivity extends AppCompatActivity {


    TextView mText1, mText2, mText3,mText4;
    Button mSubmitAction;
    String text_aux,text_aux2,text_aux3,text_aux4;
    String datos_compartir;
    JSON j;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        mText1 = findViewById(R.id.prueba_text);
        mText2 = findViewById(R.id.prueba2_text);
        mText3 = findViewById(R.id.prueba3_text);
        mText4 = findViewById(R.id.prueba4_text);

        mSubmitAction = findViewById(R.id.submit2_action);


        text_aux = "Texto Quemado";

        Intent new_intent = getIntent();
        Intent new_intent2 = getIntent();

        if (new_intent != null){
            text_aux = new_intent.getStringExtra(AppConstants.TEXT1_KEY);
            text_aux2 = new_intent.getStringExtra(AppConstants.TEXT2_KEY);
            text_aux3 = new_intent.getStringExtra(AppConstants.TEXT3_KEY);
            text_aux4 = new_intent.getStringExtra(AppConstants.TEXT4_KEY);
        }

        mText1.setText(text_aux);
        mText2.setText(text_aux2);
        mText3.setText(text_aux3);
        mText4.setText(text_aux4);

        mSubmitAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m_intent2 = new Intent();
                j = new JSON(mText1.getText().toString(),mText2.getText().toString(),mText3.getText().toString(),mText4.getText().toString());

                datos_compartir = j.ImprimirJSON();

                m_intent2.setAction(Intent.ACTION_SEND);
                m_intent2.setType("text/plain");

                m_intent2.putExtra(Intent.EXTRA_TEXT,datos_compartir);

                startActivity(m_intent2);
            }
        });
    }
}
