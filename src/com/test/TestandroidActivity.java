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
        //���ؽ���
        setContentView(R.layout.lianxi);
        //��ȡ�������
         et=(EditText)this.findViewById(R.id.username);
         //btnΪ�¼�Դ
        Button btn=(Button)this.findViewById(R.id.btn1);
        //ע�������
        btn.setOnClickListener(new OnClickListener()//������
        {

		      //�����¼�����
			public void onClick(View arg0) {
				//��ȡ��������ֵ
				String name=et.getText().toString();
				System.out.println("����="+name);
			}
        	
        });
    }
}