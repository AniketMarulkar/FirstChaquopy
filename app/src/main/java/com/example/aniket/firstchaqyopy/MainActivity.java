package com.example.aniket.firstchaqyopy;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.chaquo.python.PyObject;
import com.chaquo.python.Python;
import com.chaquo.python.android.AndroidPlatform;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    Context context=this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1);

        Toast.makeText(getApplicationContext(),""+Python.isStarted(),Toast.LENGTH_LONG).show();
        Python.start(new AndroidPlatform(context));
        Toast.makeText(getApplicationContext(),""+Python.isStarted(),Toast.LENGTH_LONG).show();

       /* Python py = Python.getInstance();
        PyObject pym = py.getModule("1");
        PyObject pyf = pym.callAttr("fun");*/

    }
    public void btnClick(View v)
    {
        if (! Python.isStarted()) {
            Toast.makeText(getApplicationContext(),"before",Toast.LENGTH_LONG).show();
            Python.start(new AndroidPlatform(context));

            Toast.makeText(getApplicationContext(),"After",Toast.LENGTH_LONG).show();
        }
    }
}
