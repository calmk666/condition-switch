public class stuswitch {
    public static void main(String[] args){
        /*swith(表达式){
            case 值1:
                语句体1;
                break;
            case 值2:
                语句体2;
                break;
            ...
            default:
                语句体n+1;
                break;
    
        }
        
        执行流程:
        1. 首先计算表达式的值.
        2. 依次和case后面的值进行比较,如果有对应的值,就会执行相应
           语句,在执行过程中,遇到break就会结束.
        3. 如果所有的case后面的值和表达式的值都不匹配,就会执行
           default里面的语句体,然后结束整个switch语句.
        
        格式说明:
        1. 表达式: (将要匹配的值) 取值为byte,short,int,char.
                  JDK5以后可以式枚举,JDK7以后可以是String.
        2. case: 后面跟的是要和表达式进行比较的值(被匹配的值).
        3. break: 表示中断,结束的意思,用来结束switch语句.
        4. default: 表示所有情况都不匹配的时候,就执行该出的内容,
                    和if语句的else语句相似.
        5. case: 后面的值只能是自变量,不能是变量
        6. case: 给出的值不允许重复
        */
        //兰州拉面,武汉热干面,北京炸酱面,陕西油泼面

        //1. 定义心中想吃的面
        String noodles = "北京炸酱面";
        //2. 拿着这个面利用switch跟四种面条匹配
        switch(noodles){
            case "兰州拉面":
                System.out.println("吃兰州拉面");
                break;
            case "武汉热干面":
                System.out.println("吃武汉热干面");
                break;
            case "北京炸酱面":
                System.out.println("吃北京炸酱面");
                break;
            case "陕西油泼面":
                System.out.println("吃陕西油泼面");
                break;
            default:
                System.out.println("吃方便面");
                break;
        }


    }
}