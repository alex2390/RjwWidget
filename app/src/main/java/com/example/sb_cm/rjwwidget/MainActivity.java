package com.example.sb_cm.rjwwidget;

import android.Manifest;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.app.hubert.guide.NewbieGuide;
import com.app.hubert.guide.model.GuidePage;
import com.example.sb_cm.rjwwidget.countdownview.CountDownTimerView;
import com.example.sb_cm.rjwwidget.countdownview.OnTimerFinishListener;

public class MainActivity extends AppCompatActivity {
    //test
    //dev test
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CountDownTimerView countDownTimerProcess = (CountDownTimerView) findViewById(R.id.countdown);

        countDownTimerProcess.setTime(3, 4, 5);
        countDownTimerProcess.start();
        countDownTimerProcess.setOnFinishListener(new OnTimerFinishListener() {
            @Override
            public void finish() {
                //结束
                Toast.makeText(MainActivity.this, "倒计时结束了", Toast.LENGTH_LONG).show();


            }
        });

    }
}
