package my.edu.utar.practical_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        damn just realized something,once i defined the listview entries inside
//        strings.xml, i don't even actually need to declare anything inside main_activity.java

    }
}