package com.example.a48608.dn_aop_20180305.aspect;

import android.util.Log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by 48608 on 2018/3/5.
 */
@Aspect
public class UserInfoBehaviorTraceAspect {
    //定义切面的规则
    //1.就在原来应用中哪些注释的地方放到当前切面进行处理
    //execution(注释名   注释用的地方)
    @Pointcut("execution(@com.example.a48608.dn_aop_20180305.annotation.UserInfoBehaviorTrace * *(..))")
    public void methodAnnotatedWithBehaviorTrace(){}

    //2.对进入切面的内容如何处理
    //advice
    //@Before()  在切入点之前运行
    //@After()   在切入点之后运行
    //@Around()  在切入点前后都运行
    @Before("methodAnnotatedWithBehaviorTrace()")
    public Object weaveJoinPoint(ProceedingJoinPoint joinPoint) throws Throwable{
        Log.d("jett","被执行了");
        return null;
    }
}








