import static java.lang.String.join;

/**
 * @author: lydsgy699
 * @email: 337887790@qq.com
 * @date: 2021/5/7 17:49
 *
 * 字符串
 */
public class Test1 {
    public static void main(String args[]){
        /*
        子串
         */
        String e="";
        String greeting="Hello";
        String s=greeting.substring(0,3);//substring：可以从一个较大字符串提取出一个子串。
        System.out.println(s);
        /*
        拼接
         */
        String expletive="Expletive+";
        String PG13="deleted";
        String message=expletive+PG13;
        System.out.println(message);
        /*
        界定符 join方法
         */
        String join=String.join("!","l","r","s");
        System.out.println(join);
        /*
        repeat 方法
         */
//        String repeat="java".repeat(3); //java11提供repeat方法

    }
}
