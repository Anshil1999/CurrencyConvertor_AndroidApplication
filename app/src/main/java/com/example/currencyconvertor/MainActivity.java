package com.example.currencyconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1,b2;
    EditText ed1;
    TextView ed2;
    double rupees;
    boolean bool=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        ed1=findViewById(R.id.ed1);
        ed2=findViewById(R.id.ed2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                rupees=Double.valueOf(""+ed1.getText());
                bool=true;
                if(bool==true) {
                    ed2.setText("" + (rupees * 0.014));
                }

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rupees=Double.valueOf(""+ed1.getText());
                bool=false;
                if(bool==false)
                {
                    ed2.setText(""+(rupees*1.56));
                }
            }
        });
    }
}
