package com.example.sb_cm.rjwwidget;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.Toast;

import com.app.hubert.guide.NewbieGuide;
import com.app.hubert.guide.core.Controller;
import com.app.hubert.guide.listener.OnGuideChangedListener;
import com.app.hubert.guide.listener.OnLayoutInflatedListener;
import com.app.hubert.guide.listener.OnPageChangedListener;
import com.app.hubert.guide.model.GuidePage;
import com.app.hubert.guide.model.HighLight;

/**
 * Desc:
 * <p>
 * Created by renjiawen on 2018/12/5.
 */
public class GuideAct extends AppCompatActivity {
    private AppCompatButton btn1, btn2, btn3;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_guide);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        initGuide();


    }

    private void initGuide() {
        NewbieGuide.with(this)
                .setLabel("home")//设置引导层标示区分不同引导层，必传！否则报错
                .alwaysShow(true)//是否每次都显示引导层，默认false，只显示一次
                .addGuidePage(//添加一页引导页
                        GuidePage.newInstance()//创建一个实例
                                .addHighLight(btn1, HighLight.Shape.ROUND_RECTANGLE)
                                .setLayoutRes(R.layout.home_tips_two, R.id.iv_1)//引导页布局，点击跳转下一页或者消失引导层的控件id
                                .setOnLayoutInflatedListener(new OnLayoutInflatedListener() {
                                    @Override
                                    public void onLayoutInflated(View view) {
                                        //引导页布局填充后回调，用于初始化
                                        view.findViewById(R.id.iv_1).setVisibility(View.VISIBLE);
                                    }
                                })

                )
                .addGuidePage(//添加一页引导页
                        GuidePage.newInstance()//创建一个实例
                                .addHighLight(btn2, HighLight.Shape.CIRCLE)
                                .setLayoutRes(R.layout.home_tips_two, R.id.iv_2)//引导页布局，点击跳转下一页或者消失引导层的控件id
                                .setOnLayoutInflatedListener(new OnLayoutInflatedListener() {
                                    @Override
                                    public void onLayoutInflated(View view) {
                                        //引导页布局填充后回调，用于初始化
                                        view.findViewById(R.id.iv_2).setVisibility(View.VISIBLE);
                                    }
                                })

                )


                .addGuidePage(//添加一页引导页
                        GuidePage.newInstance()//创建一个实例
                                .addHighLight(btn3, HighLight.Shape.CIRCLE, 0)
                                .setEverywhereCancelable(false)
                                .setLayoutRes(R.layout.home_tips_two, R.id.iv_3)//引导页布局，点击跳转下一页或者消失引导层的控件id

                                .setOnLayoutInflatedListener(new OnLayoutInflatedListener() {
                                    @Override
                                    public void onLayoutInflated(View view) {
                                        //引导页布局填充后回调，用于初始化
                                        view.findViewById(R.id.iv_3).setVisibility(View.VISIBLE);

                                    }
                                })

                )
                .setOnGuideChangedListener(new OnGuideChangedListener() {
                    @Override
                    public void onShowed(Controller controller) {

                    }

                    @Override
                    public void onRemoved(Controller controller) {
                        Toast.makeText(GuideAct.this, "game over", Toast.LENGTH_LONG).show();
                        }
                })


                .show();//显示引导层(至少需要一页引导页才能显示)

    }
}
