package com.example.test2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import cn.bmob.v3.Bmob;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.SaveListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bmob.initialize(this,"fd0969d70fab5bfe9eec83ec25aa0097");
    }

    public void save(View view) {
        Person p2 = new Person();
        p2.setName("lucky");
        p2.setAddress("北京海淀");
        p2.save(new SaveListener<String>() {
            @Override
            public void done(String objectId,BmobException e) {
                if(e==null){
                    Toast.makeText(MainActivity.this, ""+objectId, Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "保存数据出错"+objectId, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
