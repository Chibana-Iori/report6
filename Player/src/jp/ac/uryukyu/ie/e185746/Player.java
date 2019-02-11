package jp.ac.uryukyu.ie.e185746;

import java.util.Scanner;
class Rate {
    int Rate = (int)(Math.random()*40)+60;//50~100まで
    public void setUp(){
        System.out.printf("総合値　%d\n",Rate);
    }
}

class Age extends Rate{
    int Age = (int)(Math.random()*35)+15;//15~50まで
    @Override
    public void setUp(){
        System.out.printf("年齢 %d\n",Age);
    }
}

class Height extends Rate {
    int Height = (int)(Math.random()*50)+160;//160~210まで
    @Override
    public void setUp(){
        System.out.printf("身長　%d\n",Height);
    }
}

class Weight extends Rate{
    int Weight =(int)(Math.random()*40)+60;//60~100まで
    @Override
    public void setUp(){
        System.out.printf("体重　%d\n",Weight);
    }
}
public class Player{
    public static void main(String[] args){
        String input;//読み込んだユーザ入力を格納するStringオブジェクトを用意。
        Scanner in = new Scanner(System.in);// 標準入力から読み込むスキャナを用意
        System.out.println("選手名を入力してください");
        input = in.nextLine();// inputにユーザ入力を保存する。
        System.out.println(input);
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