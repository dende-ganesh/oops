import java.util.Random;
class led {
    boolean status;
    void setOn(){
        status =true;
        System.out.println("Bulb is On");
    }
    void setOff(){
        System.out.println("Bulb is Off");
        status =false;
    }
}
public class ledlight{
    public static void main(String args[]){
        led l=new led();
        //l.setOn();
        for(int i=0;i<10;i++)
        {
            Random r=new Random();
            boolean status =r.nextBoolean();
            if(status)
            {
                l.setOn();
            }
            else
            {   
                l.setOff();
            }
        
    }
}
}