package my.edu.utar.practical_2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //    when we declare objects and variables in the MainActiviy class, outside of any methods
//    have class-level scope
//    the fields are accesible to all methods within the 'MainActivity' class
    String[] fruits = {"Apple", "Orange", "Banana", "Kiwi"};

    Button btn;
    AlertDialog.Builder builder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        declare objects and variables within onCreate methods, they are local to this method
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_list, fruits);

//        declare a listview object
//        if i want to limit the visibility of the views, i probably have to use a custom adapter
        ListView listView = (ListView) findViewById(R.id.mylist_view);
        listView.setAdapter(adapter);

//        now let's create a dialog
//        i guess i have to create another xml file? If i were to create a custom dialog button
//        but practical note shows we should to use an alert dialog instead
//        check this out, from stack overflow


        btn = findViewById(R.id.click);
        builder = new AlertDialog.Builder(this);

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                builder.setTitle("Question!");
                builder.setMessage("Yes or No");
                builder.setCancelable(false);

                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "YES", Toast.LENGTH_SHORT).show();
                        finish();
                    }
                });

                builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                builder.show();

            }


        });


    }


    //do not define the onCheckBoxClicked method inside the onCreate method
//    define method instead at class level
    //        declare logic for checkbox
    public void onCheckboxClicked(View view) {
        CheckBox ckb1 = (CheckBox) findViewById(R.id.ckb1);
        CheckBox ckb2 = (CheckBox) findViewById(R.id.ckb2);
        CheckBox ckb3 = (CheckBox) findViewById(R.id.ckb3);
        CheckBox ckb4 = (CheckBox) findViewById(R.id.ckb4);
        CheckBox ckb5 = (CheckBox) findViewById(R.id.ckb5);

        Intent intent = new Intent(this, ResultsActivity.class);

//        has the checkbox that was clicked been checked
        boolean checked = ((CheckBox) view).isChecked();

//        retrieve which checkbox was clicked
        if (view.getId() == R.id.ckb1) {
            if (checked) {
                intent.putExtra("checkBoxValue", checked);
            }
        } else if (view.getId() == R.id.ckb2) {
            if (checked) {
                intent.putExtra("checkBoxValue", checked);
            }
        } else if (view.getId() == R.id.ckb3) {
            if (checked) {
                intent.putExtra("checkBoxValue", checked);
            }
        } else if (view.getId() == R.id.ckb4) {
            if (checked) {
                intent.putExtra("checkBoxValue", checked);
            }
        } else if (view.getId() == R.id.ckb5) {
            if (checked) {
                intent.putExtra("checkBoxValue", checked);
            }

        }

        startActivity(intent);

    }

}