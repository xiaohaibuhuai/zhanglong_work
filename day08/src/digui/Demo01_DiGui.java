package digui;
/**
 * 递归:
      方法自己调用自己


      从前有座山,山上有座庙,庙里有个老和尚,老和尚给小和尚讲故事,讲得啥?
         从前有座山,山上有座庙,庙里有个老和尚,老和尚给小和尚讲故事,讲得啥?
             从前有座山,山上有座庙,庙里有个老和尚,老和尚给小和尚讲故事,讲得啥?
                从前有座山,山上有座庙,庙里有个老和尚,老和尚给小和尚讲故事,讲得啥?


   注意:
      1.不能一直递归,有出口,不然就是死递归
      2.构造方法不能递归



   public static void method(int n){
      if(n==1){
         return;
      }
      n--;
      method(n);
 * @author zhanglong
 *
 */
public class Demo01_DiGui {
	public static void main(String[] args) {
        method(3);
    }
    public static void method(int n){
        if(n==1){
            return;
        }
        n--;
        method(n);
    }
}
