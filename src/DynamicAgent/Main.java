package DynamicAgent;

/**
 * 动态代理测试主方法
 *
 * @version 2018/1/22 14:19:30
 * @auther Pyctay
 */
public class Main {
    public static void main(String[] args){
        Jay realJay = new RealJay("菊花台");
        Agent agent = new Agent(realJay);
        Jay proxy = (Jay) agent.getProxy();
        proxy.sing();
    }
}
