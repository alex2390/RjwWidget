package com.example.sb_cm.rjwwidget;

import android.os.CountDownTimer;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.sb_cm.rjwwidget.third.tab.TabAdapter;
import com.example.sb_cm.rjwwidget.widget.ball.BallView;
import com.example.sb_cm.rjwwidget.widget.ball.TaskModel;
import com.flyco.tablayout.SlidingTabLayout;
import com.flyco.tablayout.listener.OnTabSelectListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private BallView ball = null;
    private ArrayList<TaskModel> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_tab);

        ball = findViewById(R.id.ball_view);
        for (int i = 0; i < 100; i++) {
            list.add(new TaskModel(i + "", i + "test", i + ""));
        }
        if (list != null) {
            ball.setData(list);
            ball.requestLayout();
            ball.setBallViewListener(new BallView.BallViewListener() {
                @Override
                public void getTaskId(String taskId) {


                }
            });
        }


    }
}
