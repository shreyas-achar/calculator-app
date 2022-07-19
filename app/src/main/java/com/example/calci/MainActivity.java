package com.example.calci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bsub,badd,bdiv,bmul,bdot,bclear,bequal;
    EditText t1;
    float val1,val2;
    boolean addition,subtraction,multiplication,division;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b0=(Button)findViewById(R.id.btn0);
        b1=(Button)findViewById(R.id.btn1);
        b2=(Button)findViewById(R.id.btn2);
        b3=(Button)findViewById(R.id.btn3);
        b4=(Button)findViewById(R.id.btn4);
        b5=(Button)findViewById(R.id.btn5);
        b6=(Button)findViewById(R.id.btn6);
        b7=(Button)findViewById(R.id.btn7);
        b8=(Button)findViewById(R.id.btn8);
        b9=(Button)findViewById(R.id.btn9);
        badd=(Button)findViewById(R.id.btnplus);
        bsub=(Button)findViewById(R.id.btnmin);
        bmul=(Button)findViewById(R.id.btnmul);
        bdiv=(Button)findViewById(R.id.btndiv);
        bdot=(Button)findViewById(R.id.btndot);
        bequal=(Button)findViewById(R.id.btneq);
        bclear=(Button)findViewById(R.id.btnclear);
        t1=(EditText)findViewById(R.id.editTextTextPersonName);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+"1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+"2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+"3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+"4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+"5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+"6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+"7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+"8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+"9");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+"0");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+".");
            }
        });

        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1 =Float.parseFloat(t1.getText()+"");
                addition=true;
                t1.setText(null);
            }
        });

        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1 =Float.parseFloat(t1.getText()+"");
                subtraction=true;
                t1.setText(null);
            }
        });

        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1 =Float.parseFloat(t1.getText()+"");
                multiplication=true;
                t1.setText(null);
            }
        });

        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1 =Float.parseFloat(t1.getText()+"");
                division=true;
                t1.setText(null);
            }
        });

        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val2 = Float.parseFloat(t1.getText() + "");

                if (addition == true) {
                    t1.setText(val1 + val2 + "");
                    addition = false;
                }
                if (subtraction == true) {
                    t1.setText(val1 - val2 + "");
                    subtraction = false;
                }
                if (multiplication == true) {
                    t1.setText(val1 * val2 + "");
                    multiplication = false;
                }
                if (division == true) {
                    t1.setText(val1 / val2 + "");
                    division = false;
                }
            }
        });
        bclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText("");
            }
        });
    }
}