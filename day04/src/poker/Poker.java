package poker;
/**
 * 步骤分析:

   组合牌:
      1.创建一个Map集合用于存储编号以及牌面
      2.创建一个List集合用于存储花色
      3.创建一个List集合用于存储2,3,4,5,6,7,8,9,10,J,Q,K,A
      4.创建一个List集合用于存储Map中牌面对应的编号
      5.遍历花色的集合以及牌的集合,组合起来和对应的编号存储到Map集合中,同时将编号一起存到第四个集合中

   洗牌:
      Collections.shuffle(存有编号的List集合)

   发牌:
      1.定义4个List集合(当三个人,一个底牌)
      2.遍历存有编号的List集合
         用索引%3发牌(发的是编号)

      3.排序
         Collections.sort(list集合)

   看牌:
       1.遍历三个人加一个底牌的集合,同时调用map中的get方法,根据遍历出来的编号(key)获取对应的Map中的牌面

 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Poker {
	  public static void main(String[] args) {
	        //组合牌
	        //1.创建一个Map集合用于存储编号以及牌面
	        HashMap<Integer,String> hashMap = new HashMap<>();
	        // 2.创建一个List集合用于存储花色
	        ArrayList<String> color = new ArrayList<>();
	        //3.创建一个List集合用于存储2,3,4,5,6,7,8,9,10,J,Q,K,A
	        ArrayList<String> number = new ArrayList<>();
	        //4.创建一个List集合用于存储Map中牌面对应的编号
	        ArrayList<Integer> pokerNumber = new ArrayList<>();

	        //存花色和JQKA
	        Collections.addAll(color,"♥","♠","♦","♣");
	        Collections.addAll(number,"2","3","4","5","6","7","8","9","10","J","Q","K","A");

	        int index = 2;

	        for (String s : number) {
	            for (String s1 : color) {
	                String poker = s+s1;
	                //将组合好的牌和编号存到map中
	                hashMap.put(index,poker);
	                //将编号存到用于存储Map中牌面对应的编号的List集合
	                pokerNumber.add(index);
	                index++;
	            }
	        }

	       /* System.out.println(hashMap);
	        System.out.println(pokerNumber);*/

	       hashMap.put(0,"大😊");
	       hashMap.put(1,"小☺");
	       pokerNumber.add(0);
	       pokerNumber.add(1);

	       //洗牌
	        Collections.shuffle(pokerNumber);

	        //发牌--定义4个List集合(当三个人,一个底牌)
	        ArrayList<Integer> play01 = new ArrayList<>();
	        ArrayList<Integer> play02 = new ArrayList<>();
	        ArrayList<Integer> play03 = new ArrayList<>();
	        ArrayList<Integer> dipai = new ArrayList<>();

	        //遍历存有编号的集合
	        for (int i = 0; i < pokerNumber.size(); i++) {
	            Integer num = pokerNumber.get(i);
	            if (i>=51){
	                dipai.add(num);
	            }else if(i%3==0){
	                play01.add(num);
	            }else if(i%3==1){
	                play02.add(num);
	            }else{
	                play03.add(num);
	            }
	        }

	        //排序
	        Collections.sort(play01);
	        Collections.sort(play02);
	        Collections.sort(play03);
	        Collections.sort(dipai);

	        //看牌
	        show("柳岩",play01,hashMap);
	        show("晓亭",play02,hashMap);
	        show("孝艳",play03,hashMap);
	        show("底牌",dipai,hashMap);

	    }

	    public static void show(String name, ArrayList<Integer> list, HashMap<Integer, String> hashMap) {
	        System.out.print(name+":");

	        //遍历存有编号的每一个集合
	        for (Integer key : list) {
	            String poker = hashMap.get(key);
	            System.out.print(poker+" ");
	        }
	        System.out.println();
	    }
}
