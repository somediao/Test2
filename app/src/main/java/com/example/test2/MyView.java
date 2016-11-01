package com.example.test2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;

import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/10/31.
 */

public class MyView extends LinearLayout {


    public MyView(Context context) {
        super(context);
    }

    public MyView(final Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.view_my,this);
        RadioGroup radioGroup= (RadioGroup) findViewById(R.id.radio_group);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.radio_1:
                        Toast.makeText(context, "1", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radio_2:
                        Toast.makeText(context, "2", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radio_3:
                        Toast.makeText(context, "3", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radio_4:
                        Toast.makeText(context, "4", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }
}
