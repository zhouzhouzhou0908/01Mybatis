package cn.zjl.AOP;



import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.lang.Nullable;

import java.lang.reflect.Method;

public class LogAdd implements MethodBeforeAdvice {


    public void before(Method method, Object[] objects, @Nullable Object o) throws Throwable {
        System.out.println("=======mmp========");
    }
}