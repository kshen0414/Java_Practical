package my.edu.utar.practical_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.results);

        Intent intent = getIntent();
//        String string = intent.getStringExtra("ckb1");

        boolean isChecked = this.getIntent().getBooleanExtra("checkBoxValue",false);

        StringBuilder results = new StringBuilder("Selected Options:");
        if (isChecked) results.append("Options");

//        TextView textView = (TextView) findViewById(R.id.result);

//        textView.setText(isChecked);
    }
}