package com.example.amannegi.bill;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public int a, b, c, bill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CheckBox chkbrgr = (CheckBox) findViewById(R.id.chkbrgr);
        final CheckBox chktea = (CheckBox) findViewById(R.id.chktea);
        final CheckBox chkcffe = (CheckBox) findViewById(R.id.chkcffe);
        final TextView txt = (TextView) findViewById(R.id.txt);
        Button order = (Button) findViewById(R.id.order);


        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txt.setText("");

                if (chkbrgr.isChecked()) {
                    a = 100;
                    txt.append("Burger\n");
                } else {
                    a = 0;
                }

                if (chktea.isChecked()) {
                    b = 10;
                    txt.append("Tea\n");
                } else {
                    b = 0;
                }

                if (chkcffe.isChecked()) {
                    c = 50;
                    txt.append("Coffee\n");
                } else {
                    c = 0;
                }

                bill = a + b + c;
                Toast toast = Toast.makeText(MainActivity.this, "Your bill is ₹" + bill, Toast.LENGTH_SHORT);
                toast.show();
                txt.append("\nYour bill is ₹" + bill + "!");

            }
        });

    }
}