package StaticAgent;

/**
 * 周杰伦的经纪人
 *
 * @version 2018/1/21 17:01:30
 * @auther Pyctay
 */
public class Agent implements Jay {
    private String songName;
    private  RealJay realJay;
    public Agent (String songName){
        this.songName = songName;
    }
    @Override
    public void sing() {
        System.out.println("主持人：今天有幸请到了周杰伦来为大家演唱一首歌");
        if(realJay==null){
            realJay = new RealJay(songName);
        }
        realJay.sing();
        System.out.println("主持人：晚会结束，谢谢大家");
    }
}
