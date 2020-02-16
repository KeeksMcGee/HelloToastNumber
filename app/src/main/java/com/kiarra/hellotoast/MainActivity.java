package com.kiarra.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.kiarra.hellotoast.R;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private boolean even = ((mCount%2)==0);
    private TextView mShowCount;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        btn = (Button) findViewById(R.id.button_count);
    }


    public void showToast(View view) {
        Toast toast = Toast.makeText(this,R.string.toast_message,Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        if(mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));{
            if((mCount % 2)==0) {
                btn.setBackgroundColor(Color.MAGENTA);
            } else {
                btn.setBackgroundColor(Color.CYAN);
            }
        }
        if(mCount>0) {
        findViewById(R.id.btn_zero).setBackgroundColor(Color.GREEN);
        }
    }

    public void zeroCount(View view){
        mCount = 0;
        if(mShowCount!=null)
            mShowCount.setText(Integer.toString(mCount)); {
                if(mCount == 0) {
                    findViewById(R.id.btn_zero).setBackgroundColor(Color.LTGRAY);
                }
        }
    }


}
