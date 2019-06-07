package com.example.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
        textView = findViewById(R.id.textView);
    }

    public void showTemp(View view) {
        int position = spinner.getSelectedItemPosition();
        String description = getDescritionByPosition(position);
        textView.setText(description);
    }
    private String  getDescritionByPosition(int position){
        String[] description = getResources().getStringArray(R.array.Temp);
        return description[position];

    }
}
