package com.example.sb_cm.rjwwidget;

import android.Manifest;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.ViewParent;
import android.widget.Toast;

import com.app.hubert.guide.NewbieGuide;
import com.app.hubert.guide.model.GuidePage;
import com.example.sb_cm.rjwwidget.countdownview.CountDownTimerView;
import com.example.sb_cm.rjwwidget.countdownview.OnTimerFinishListener;
import com.example.sb_cm.rjwwidget.tab.TabAdapter;
import com.flyco.tablayout.SlidingTabLayout;
import com.flyco.tablayout.listener.OnTabSelectListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_tab);
        SlidingTabLayout tabLayout = findViewById(R.id.tablayout);
        ViewPager viewPager = findViewById(R.id.view_pager);
        String[] list = {"全部采购", "第一條", "第一條", "第一", "第一條", "第一條"};
        viewPager.setAdapter(new TabAdapter(getSupportFragmentManager()));
        tabLayout.setViewPager(viewPager, list);

        tabLayout.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelect(int position) {

            }

            @Override
            public void onTabReselect(int position) {

            }
        });


//        String html = "<html><body style='font-size:15px;color:#57AFFC'><p>18888元大礼包免费送给你<br />等等，还没完，还有<br /><font size='20px'><size>100元</size></font>返现，用不用随你</p></body></html>";
//        textview.setText(Html.fromHtml(html, null, new SizeLabel(30)));

    }
}
