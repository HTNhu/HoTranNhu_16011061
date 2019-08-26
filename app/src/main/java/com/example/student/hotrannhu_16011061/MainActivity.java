package com.example.student.hotrannhu_16011061;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText edtNum1 = (EditText)findViewById(R.id.edtNum1);
        final EditText edtNum2 = (EditText)findViewById(R.id.edtNum2);
        Button btnResult = (Button)findViewById(R.id.btnResult);
        final TextView tvResult = (TextView)findViewById(R.id.tvResult);

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(edtNum1.getText().toString());
                double num2 = Double.parseDouble(edtNum2.getText().toString());

                double total = num1 +num2;

                tvResult.setText("Ket qua la: " + total);
            }
        });
    }
}
