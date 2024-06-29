import java.util.Scanner;
interface youtube{
  void playvideo();
}
class playvideo1 implements youtube{
    @Override
    public void playvideo() {
        System.out.println("This video is blocked in this URL");
        System.out.println("Try another URL");
    }
}
class  playvideo2 implements youtube{
    @Override
    public void playvideo() {
        System.out.println("This video is also blocked in this URL");
        System.out.println("Try again with another URL");
    }
}
class playvideo3 implements youtube{
    @Override
    public void playvideo() {
        System.out.println("The video is now playing..................");

    }
}

class Factory{
    public youtube getvideo(String videoType){
        if (videoType==null){
            return null;
        }
        if (videoType.equalsIgnoreCase("playvideo1")){
            return new playvideo1();
        }
        else if (videoType.equalsIgnoreCase("playvideo2")){

            return new playvideo2();
        }
        else if (videoType.equalsIgnoreCase("playvideo3")){
            return new playvideo3();
        }
        else {
            return null;
        }
    }
}
public class Final_Lab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Factory factory = new Factory();
        int a;
        a = sc.nextInt();
        switch (a){
            case 1: {
                youtube fact = factory.getvideo("playvideo1");
                fact.playvideo();
            }
            case 2:{
                youtube fact1 = factory.getvideo("playvideo2");
                fact1.playvideo();
            }
            case 3:{
                youtube fact2 = factory.getvideo("playvideo3");
                fact2.playvideo();
            }

            default:{
                System.out.println("Invalid value");
            }

        }



//        youtube fact1 = factory.getvideo("shooting");
//        fact1.playvideo();
    }
}
