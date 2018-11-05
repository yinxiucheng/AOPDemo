package com.example.a48608.dn_aop_20180305;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.a48608.dn_aop_20180305.annotation.BehaviorTrace;
import com.example.a48608.dn_aop_20180305.annotation.UserInfoBehaviorTrace;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @BehaviorTrace("摇一摇")
    public void mShake(View view){
        SystemClock.sleep(new Random().nextInt(2000));
//        long begin=System.currentTimeMillis();
//        SystemClock.sleep(new Random().nextInt(2000));
//        long duration=System.currentTimeMillis()-begin;
    }
    @BehaviorTrace("语音消息")
    public void mAudio(View view){
        SystemClock.sleep(new Random().nextInt(2000));
    }
    @UserInfoBehaviorTrace("视频消息")
    @BehaviorTrace("视频消息")
    public void mVideo(View view ){
        SystemClock.sleep(new Random().nextInt(2000));
    }
    @UserInfoBehaviorTrace("说说功能")
    public void saySomething(View view){
        SystemClock.sleep(new Random().nextInt(2000));
    }
}







