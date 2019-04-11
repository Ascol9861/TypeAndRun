package com.example.typeandrun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnSave;
    private EditText txtMake, txtColor, txtYear, txtPrice, txtEngine;
    private TextView tvOutput;

    double price, engine;
    String make, color, res;
    int year;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSave = findViewById(R.id.btnSave);
        txtMake= findViewById(R.id.txtMake);
        txtPrice= findViewById(R.id.txtPrice);
        txtYear= findViewById(R.id.txtYear);
        txtEngine= findViewById(R.id.txtEngine);
        txtColor= findViewById(R.id.txtColor);
        tvOutput = findViewById(R.id.tvOutput);

        btnSave.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.btnSave) {
            if (validation()) {
                price = Double.parseDouble(txtPrice.getText().toString());
                engine = Double.parseDouble(txtEngine.getText().toString());
                year = Integer.parseInt(txtYear.getText().toString());
                color = txtColor.getText().toString();
                make = txtMake.getText().toString();
                TypeAndRun obj = new TypeAndRun();
                obj.setMake(make);
                obj.setColor(color);
                obj.setYear(year);
                obj.setEngine(engine);
                obj.setPrice(price);
                res = obj.runCmd();
                tvOutput.append(res);


            }
        }



    }

    public boolean validation(){
        boolean flag = true;
        if (TextUtils.isEmpty(txtMake.getText().toString())){
            txtMake.setError("Please enter Height");
            txtMake.requestFocus();
            flag = false;
        }
        else if (TextUtils.isEmpty(txtYear.getText().toString())){
            txtYear.setError("Please enter Height");
            txtYear.requestFocus();
            flag = false;
        }
        else if (TextUtils.isEmpty(txtColor.getText().toString())){
            txtColor.setError("Please enter Height");
            txtColor.requestFocus();
            flag = false;
        }
        else if (TextUtils.isEmpty(txtEngine.getText().toString())){
            txtEngine.setError("Please enter Height");
            txtEngine.requestFocus();
            flag = false;
        }
        else if (TextUtils.isEmpty(txtPrice.getText().toString())){
            txtPrice.setError("Please enter Height");
            txtPrice.requestFocus();
            flag = false;
        }
        return flag;
    }
}
