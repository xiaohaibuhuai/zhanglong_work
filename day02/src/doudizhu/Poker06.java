package doudizhu;

import java.util.ArrayList;
import java.util.Collections;
/**
 * 斗地主
    1.准备牌
       定义2个集合分别存储花色和牌号
       定义1个集合存储花色和牌号的组合
       再存大王小王
    2.洗牌
       Collections.shuffle(list)
    3.发牌
       定义3个集合分别代表3个人,定义一个集合代表存储底牌
    4.看牌
 * @author zhanglong
 *
 */
public class Poker06 {
	public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<>();
        ArrayList<String> number = new ArrayList<>();
        ArrayList<String> pokerNumber = new ArrayList<>();
        color.add("♥");
        color.add("♠");
        color.add("♦");
        color.add("♣");
        //System.out.println(color);
        for (int i = 2;i<=10;i++){
            number.add(i+"");
        }
        number.add("J");
        number.add("Q");
        number.add("K");
        number.add("A");
        //System.out.println(number);
        for (String s : number) {
            for (String s1 : color) {
                String poker = s+s1;
                pokerNumber.add(poker);
            }
        }
       //System.out.println(pokerNumber);
        pokerNumber.add("大😊");
        pokerNumber.add("小😊");
        //System.out.println(pokerNumber);

        //洗牌
        Collections.shuffle(pokerNumber);
        // System.out.println(pokerNumber);
        //发牌
        ArrayList<String> tangseng = new ArrayList<>();
        ArrayList<String> wukong = new ArrayList<>();
        ArrayList<String> jingjing = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
        for (int i = 0; i < pokerNumber.size(); i++) {
            String pokerPai = pokerNumber.get(i);
            if (i>=51){
                dipai.add(pokerPai);
            }else if(i%3==0){
                tangseng.add(pokerPai);
            }else if(i%3==1){
                wukong.add(pokerPai);
            }else{
                jingjing.add(pokerPai);
            }
        }
        //看牌
        System.out.println("唐僧:"+tangseng);
        System.out.println("悟空:"+wukong);
        System.out.println("晶晶:"+jingjing);
        System.out.println("底牌:"+dipai);
    }
}
