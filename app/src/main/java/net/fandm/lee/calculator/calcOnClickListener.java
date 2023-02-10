package net.fandm.lee.calculator;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.mariuszgromada.math.mxparser.*;


public class calcOnClickListener implements View.OnClickListener {
    public static final String TAG = "MAIN";


    public void onClick(View v) {
        View grandparent = (View)v.getParent().getParent();
        Button button_type=(Button)v;

        String button_text=button_type.getText().toString();
        TextView display = grandparent.findViewById(R.id.equation);

        String data=display.getText().toString();
        if(!button_text.equals("enter") && !button_text.equals("C")){
            if(button_text.equals("^")){
                button_text = "**";
            }
            data = data + button_text;
            display.setText(data);


        if(button_text.equals("c")) {
            Log.d(TAG, button_text);
            display.setText("");
        }
        if(button_text.equals("Enter"))
            doMath(data);

        }


    }

    public String doMath(String data) {
        return "string";

    }


}
