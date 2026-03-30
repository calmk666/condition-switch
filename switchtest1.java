import java.util.Scanner;

public class switchtest1 {
    public static void main(String[] args){
        //每天做不同的运动,周一:跑步,周二:游泳,周三:打篮球,周四:踢足球,周五:羽毛球,周六:爬山,周日:休息
        //键盘录入星期几
        Scanner sc = new Scanner(System.in);
        System.out.println("输入星期几:");
        int week = sc.nextInt();
        
        //利用switch对星期数进行匹配
        switch (week){
            case 1:
                System.out.println("周一:跑步");
                break;
            case 2:
                System.out.println("周二:游泳");
                break;
            case 3:
                System.out.println("周三:打篮球");
                break;
            case 4:
                System.out.println("周四:踢足球");
                break;
            case 5:
                System.out.println("周五:羽毛球");
                break;
            case 6:
                System.out.println("周六:爬山");
                break;
            case 7:
                System.out.println("周日:休息");
                break;
            default:
                System.out.println("输入有误,请重新输入!");
                break;
            
        }
    }
}