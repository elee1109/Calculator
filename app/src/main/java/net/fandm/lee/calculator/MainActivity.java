package net.fandm.lee.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import org.mozilla.javascript.Context;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String curr_eq = "";
        Button b1 = (Button)findViewById(R.id.one);
        Button b2 = (Button)findViewById(R.id.two);
        Button b3 = (Button)findViewById(R.id.three);
        Button b4 = (Button)findViewById(R.id.four);
        Button b5 = (Button)findViewById(R.id.five);
        Button b6 = (Button)findViewById(R.id.six);
        Button b7 = (Button)findViewById(R.id.seven);
        Button b8 = (Button)findViewById(R.id.eight);
        Button b9 = (Button)findViewById(R.id.nine);
        Button b0 = (Button)findViewById(R.id.zero);
        Button add =(Button)findViewById(R.id.add);
        Button subtract=(Button)findViewById(R.id.subtract);
        Button multiply=(Button)findViewById(R.id.multiply);
        Button divide=(Button)findViewById(R.id.div);
        Button exponent=(Button)findViewById(R.id.exp);
        Button enter=(Button)findViewById(R.id.enter);
        Button clear=(Button)findViewById(R.id.clear);
        Button decimal=(Button)findViewById(R.id.decimal);

        b1.setOnClickListener(new calcOnClickListener());
        b2.setOnClickListener(new calcOnClickListener());
        b3.setOnClickListener(new calcOnClickListener());
        b4.setOnClickListener(new calcOnClickListener());
        b5.setOnClickListener(new calcOnClickListener());
        b6.setOnClickListener(new calcOnClickListener());
        b7.setOnClickListener(new calcOnClickListener());
        b8.setOnClickListener(new calcOnClickListener());
        b9.setOnClickListener(new calcOnClickListener());
        b0.setOnClickListener(new calcOnClickListener());
        add.setOnClickListener(new calcOnClickListener());
        subtract.setOnClickListener(new calcOnClickListener());
        multiply.setOnClickListener(new calcOnClickListener());
        divide.setOnClickListener(new calcOnClickListener());
        exponent.setOnClickListener(new calcOnClickListener());
        enter.setOnClickListener(new calcOnClickListener());
        clear.setOnClickListener(new calcOnClickListener());
        decimal.setOnClickListener(new calcOnClickListener());












    }
}