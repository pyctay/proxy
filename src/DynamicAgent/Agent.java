package DynamicAgent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 周杰伦的经纪人
 *
 * @version 2018/1/22 14:21:05
 * @auther Pyctay
 */
public class Agent implements InvocationHandler{
    // 目标对象
    private Object target;
    // 构造目标对象
    public Agent (Object target){
        super();
        this.target = target;
    }
   // 执行目标方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("主持人：今天有幸请到了周杰伦来为大家演唱一首歌");
        Object resultValue = method.invoke(target,args);
        System.out.println("晚会结束，谢谢大家");
        return resultValue;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),target.getClass().getInterfaces(),this);
    }
}
