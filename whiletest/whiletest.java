package whiletest;

import java.util.Scanner;



public class whiletest {
    /**
     * @param args
     */
    public static void main(String[] args){
        try (//如果一个数是回文数,那么就打印True,如果不是回文数就返回false
        Scanner sc = new Scanner(System.in)) {
            System.out.println("请输入一个数:");
            int x = sc.nextInt();
            int term = x;
            int num = 0;
            while(x != 0){
                int ge = x % 10;
                x = x /10;
                num = num * 10 + ge;
            }
            System.out.println(num == term);
        }
    }
    
}
