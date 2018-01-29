package CglibAgent;
/**
 * 周杰伦真身
 *
 * @version 2018/1/21 16:59:44
 * @auther Pyctay
 */
public class RealJay {
    private String songName;
    public RealJay(String songName){
        this.songName = songName;
        ready();
    }
    public  RealJay(){};
    public void ready() {
        System.out.println("周杰伦被请来了，正在准备唱歌");
    }

    public void sing() {
        System.out.println("周杰伦在唱"+songName);
    }
}
