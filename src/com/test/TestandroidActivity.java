package com.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
public class TestandroidActivity extends Activity {
	 EditText et;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //加载界面
        setContentView(R.layout.lianxi);
        //获取组件对象
         et=(EditText)this.findViewById(R.id.username);
         //btn为事件源
        Button btn=(Button)this.findViewById(R.id.btn1);
        //注册监听器
        btn.setOnClickListener(new OnClickListener()//匿名类
        {

		      //单击事件方法
			public void onClick(View arg0) {
				//获取组件对象的值
				String name=et.getText().toString();
				System.out.println("姓名="+name);
			}
        	
        });
    }
}//已完成
