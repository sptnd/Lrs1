import java.util.Arrays;

/**
 * @author: lydsgy699
 * @email: 337887790@qq.com
 * @date: 2021/5/8 23:54
 */
public class Test3 {
    public static void main(String args[]){
        /*
        数组
         */
        int lrs1[] = new int[10];
        int lrs2[] = {1,2,3,4};
         for(int i=0;i<lrs1.length;i++){
             System.out.println(lrs1[i]);
         }
         /*
         for each循环
         for(variable:collection)
         statement
         循环lrs2中的每一个元素，而不是下标值
         for each循环显得更加简洁，更不易出错，不必为了下标的起始值和终止值操心
          */
         int a;
         for(int j:lrs2){
             System.out.println(j);
         }
         /*
         有一个更简单的方式可以打印数组中的所有值
         Arrays类的toString 调用Arrays.toString(a) 返回一个包含数组元素的字符串,[a,a,a,a]
          */
         System.out.println(Arrays.toString(lrs2));
         /*
         命令行参数
         String args[]
          */
         if(args.length==0||args[0].equals("-h")){
             System.out.println("Hello");
         }else if (args[0].equals("-g")){
             System.out.println("Goodbye,");
         }
         for (int i=1;i<args.length;i++){
             System.out.println(""+args[i]);
         }
         System.out.println("!");
                  /*
         数组排序
          */
        int[] lrs3={5,2,1,5,2};
        Arrays.sort(lrs3);
        for (int x:lrs3
             ) {
            System.out.println(x);
        }
         }
    }
