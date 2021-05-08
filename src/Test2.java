/**
 * @author: lydsgy699
 * @email: 337887790@qq.com
 * @date: 2021/5/8 23:29
 */
public class Test2 {
    public static void main(String args[]){
        /*
        while循环
        当while（）条件为true是，while循环执行一条语句
         */
        int i=0 ;
        int j=0 ;
        while(i<2)
        {
            i++;
            System.out.println("1<2");
        }
        System.out.println(i);
        /*
        do-while循环
        先执行语句，再检测循环条件
         */
        do{
            j++;
            System.out.println("lrs");
        } while(j<2);
            /*
    for循环 for语句的第一部分通常是对计数器初始化，第二部分给出每次新一轮循环执行前要检测的循环条件，第三部分指定如何更新计数器
     */
        for(int k=0;k<5;k++){
          System.out.println(k);
        }
    }


}
