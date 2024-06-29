import java.util.Scanner;
class AudioDriverService{
    private static AudioDriverService audio = new AudioDriverService();
    private  AudioDriverService(){};
    public static AudioDriverService getInstance(){
        return audio;
    }
    public void in(){
        System.out.println("I am in");
    }
}



public class Mid_Dp {
    public static void main(String[] args) {
        System.out.println("Hello java");
    AudioDriverService ins = AudioDriverService.getInstance();
    ins.in();



    }
}
