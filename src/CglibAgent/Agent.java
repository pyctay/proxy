package CglibAgent;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 周杰伦经纪人
 *
 * @version 2018/1/22 14:50:20
 * @auther Pyctay
 */
public class Agent implements MethodInterceptor {
    // 维护一个目标
    private Object target;
    // 构造一个目标对象
    public Agent(Object target){
        super();
        this.target = target;
    }

    public Object getProxyInstance() {
        Enhancer en = new Enhancer();
        en.setCallback(this);
        en.setSuperclass(target.getClass());
        return en.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("主持人：今天有幸请到了周杰伦来为大家演唱一首歌");
        Object resultValue = method.invoke(target,objects);
        System.out.println("晚会结束，谢谢大家");
        return resultValue;
    }

}
