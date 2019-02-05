class Rate {
    int Rate = (int)(Math.random()*40)+60;
    public void setUp(){
        System.out.printf("総合値　%d\n",Rate);
    }
}

class Age extends Rate{
    int Age = (int)(Math.random()*35)+15;
    @Override
    public void setUp(){
        System.out.printf("年齢 %d\n",Age);
    }
}

class Height extends Rate {
    int Height = (int)(Math.random()*50)+160;
    @Override
    public void setUp(){
        System.out.printf("身長　%d\n",Height);
    }
}

class Weight extends Rate{
    int Weight =(int)(Math.random()*40)+60;
    @Override
    public void setUp(){
        System.out.printf("体重　%d\n",Weight);
    }
}
public class Player{
    public static void main(String[] args){
        Rate[] rates = new Rate[4];
        rates[0] = new Rate();
        rates[1] = new Age();
        rates[2] = new Height();
        rates[3] = new Weight();
        for (Rate rate:rates){
            rate.setUp();
        }
    }
}