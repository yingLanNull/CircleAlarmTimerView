package com.yinglan.circlealarmtimerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.yinglan.circleviewlibrary.CircleAlarmTimerView;


public class MainActivity extends AppCompatActivity {


    private TextView textView1;
    private TextView textView2;
    private CircleAlarmTimerView circleAlarmTimerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    private void initView(){
        textView1 = (TextView) findViewById(R.id.start);
        textView2 = (TextView) findViewById(R.id.end);

        circleAlarmTimerView = (CircleAlarmTimerView) findViewById(R.id.circletimerview);
        circleAlarmTimerView.setOnTimeChangedListener(new CircleAlarmTimerView.OnTimeChangedListener() {
            @Override
            public void start(String starting) {
                textView1.setText(starting);
            }

            @Override
            public void end(String ending) {
                textView2.setText(ending);
            }
        });
    }
}
