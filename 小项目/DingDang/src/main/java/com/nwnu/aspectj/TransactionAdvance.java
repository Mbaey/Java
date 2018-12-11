package com.nwnu.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by lcy on 2018/6/30.
 */

@Aspect
@Component
@Transactional//没有用？所以别人都加到Service上？
public class TransactionAdvance {
    //    @Around(value = "execution(public * com.nwnu.mapper.ClassMapper.*(..))")
//    public Object transactionAdvanceTest(ProceedingJoinPoint joinPoint) throws Throwable {
//        System.out.println("start log: " + joinPoint.getSignature().getName());
//        Object object = joinPoint.proceed();
//        System.out.println("end log: " + joinPoint.getSignature().getName());
//        return object;
//    }
    @Pointcut(value = "execution(public * com.nwnu.mapper..*.*(..))")
    public Object transactionAdvance(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("start log: " + joinPoint.getSignature().getName());
        Object object = joinPoint.proceed();
        System.out.println("end log: " + joinPoint.getSignature().getName());
        return object;
    }
}