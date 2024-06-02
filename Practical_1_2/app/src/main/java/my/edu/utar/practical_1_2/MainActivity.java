package my.edu.utar.practical_1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
//    Create an array of fruits
    String [] fruits = {"Apple","Orange","Banana","Kiwi"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.list_view,fruits);

//        declare a listview object
        ListView listView = (ListView) findViewById(R.id.mylist);
        listView.setAdapter(adapter);
    }
}