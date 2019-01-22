package com.example.sb_cm.rjwwidget.third.AliEvent;

import com.alibaba.sdk.android.man.MANHitBuilders;
import com.alibaba.sdk.android.man.MANService;
import com.alibaba.sdk.android.man.MANServiceProvider;
import com.alibaba.sdk.android.man.customperf.MANCustomPerformanceHitBuilder;

/**
 * Desc:
 * <p>
 * Created by renjiawen on 2019/1/22.
 */
public class AliEventUtil {
    public static void addEventLog(String Index, String eventName, String type) {
        // 事件名称：play_music
        MANHitBuilders.MANCustomHitBuilder hitBuilder = new MANHitBuilders.MANCustomHitBuilder(Index);
// 设置关联的页面名称：聆听
        hitBuilder.setEventPage(eventName);
// 设置属性：类型摇滚
        hitBuilder.setProperty("type", type);
        // 发送自定义事件打点
        MANService manService = MANServiceProvider.getService();
        manService.getMANAnalytics().getDefaultTracker().send(hitBuilder.build());
    }


    public static  void  add(){

        MANService manService = MANServiceProvider.getService();

        String labelKey = "fibonacci";
        MANCustomPerformanceHitBuilder performanceHitBuilder = new MANCustomPerformanceHitBuilder(labelKey);
// 记录自定义性能事件起始时间
        performanceHitBuilder.hitStart();
       // fibonacci(1);
// 记录自定义性能事件结束时间
        performanceHitBuilder.hitEnd();
// 设置时长方法2
// long timeCost = 0;
// performanceHitBuilder.setDuration(timeCost);
        performanceHitBuilder.withExtraInfo("EXTRA_INFO_KEY1", "EXTRA_INFO_VALUE")
                .withExtraInfo("EXTRA_INFO_KEY2", "EXTRA_INFO_VALUE");
// 上报自定义性能事件打点数据
        manService.getMANAnalytics().sendCustomPerformance(performanceHitBuilder.build());

    }



}
