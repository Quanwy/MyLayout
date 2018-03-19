package net.fspt.layoutdemo2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * 室内自动照明-基本布局
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void MyOnClick(View view) {
        switch (view.getId()) {
            //线性布局
            case R.id.btnLinearLayout:
                startActivity(new Intent(this, LinearLayoutActivity.class));
                break;
            //相对布局
            case R.id.btnRelativeLayout:
                startActivity(new Intent(this, RelativeLayoutActivity.class));
                break;
            //帧布局
            case R.id.btnFrameLayout:
                startActivity(new Intent(this, FrameLayoutActivity.class));
                break;
            //表格布局
            case R.id.btnTableLayout:
                startActivity(new Intent(this, TableLayoutActivity.class));
                break;
           //绝对布局
            case R.id.btnAbsoliteLayout:
                startActivity(new Intent(this, AbsoluteLayoutActivity.class));
                break;
        }

    }
}
