package CglibAgent;

/**
 * cglib代理测试主类
 *
 * @version 2018/1/22 14:57:34
 * @auther Pyctay
 */
public class Main {
    public static void main(String[] args){
        RealJay realJay = new RealJay("发如雪");
        Agent agent = new Agent(realJay);
        RealJay proxy = (RealJay) agent.getProxyInstance();
        proxy.sing();
    }
}
