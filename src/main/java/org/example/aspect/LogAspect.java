package org.example.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;

@Aspect
public class LogAspect {

    @Around("execution(* org.example.service.*.* (..))")
    public Object bussinessLog(ProceedingJoinPoint joinPoint) throws Throwable {
        Method method = ((MethodSignature)joinPoint.getSignature()).getMethod();
        System.out.println("excute Method: " + method.getName());
        System.out.println("excute Method return type: " + method.getReturnType());

        return joinPoint.proceed();
    }

    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("doAround begin");
        Object result = joinPoint.proceed();
        System.out.println("doAround end");
        return result;
    }

    public void doBefore() {
        System.out.println("doBefore");
    }

    public void doAfterReturning(String result) {
        System.out.println("doAfterReturning result " + result);
    }

    public void doAfterThrowing(Exception e) {
        System.out.println("doAfterThrowing exception" + e.getMessage());
    }

    public void doAfter() {
        System.out.println("doAfter");
    }

}
