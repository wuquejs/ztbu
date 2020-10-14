import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("欢迎使用幸运猜猜猜！！！！");
        int over = ((int) (Math.random() * 100));//随机生成一个1-100的数字，并赋值给变量over
        /*System.out.println(over);*/
        System.out.print("幸运已生成，请输入您要选择的数字:");
        int min = 0, max = 100, temp;//min是幸运数字区间最小值，max是幸运区间最大值，temp是用户输入的的值

        while (true) {//死循环，这里是内部进行判断满足条件结束循环
            temp = sc.nextInt();//把用户输入 的值赋值给变量temp
            if (temp > over) {//判断temp是否大于over，如果大于则继续执行，否则执行判断else if语句
                if (temp > max){//判断temp是否大于max，这里是为了解决当程序多次执行时，用户输入的数值超出已定的取值范围，如：当前数字区间为： 50----80，此时用户如果输入90则条件成立，提示用户超出范围
                    System.out.println("您输入的数字超出合法区间范围！！");
                }else {//反正则把temp值赋值给max，用于提示用户当前区间
                    max = temp;
                }
                System.out.println("当前数字区间为:" + min + "----" + max);//提示用户当前区间
                System.out.print("请继续输入您要选择的幸运数字:");//提示用户继续输入数值
                /*result1 = sc.nextInt();*/
                /*if (result1 < over) {
                    System.out.println("当前数字区间为:" + result1 +"----" + result);
                    System.out.print("请继续输入您要选择的幸运数字:");
                    result1 = sc.nextInt();
                    System.out.println("当前数字区间为:" + result + "----" + result1);
                    System.out.print("请继续输入您要选择的幸运数字:");
                    result = sc.nextInt();
                }*/
            } else if (temp < over) {
                if (temp < min){
                    System.out.println("您输入的数字超出合法区间范围！！");
                }else {
                    min = temp;
                }

                System.out.println("当前数字区间为:" + min + "----" + max);
                System.out.print("请继续输入您要选择的幸运数字:");
                /*result1 = sc.nextInt();*/
                /*if (result1 > over) {
                    System.out.println("当前数字区间为:" + result + "----" + result1);
                    System.out.print("请继续输入您要选择的幸运数字:");
                    result = sc.nextInt();
                }*/
            } else {//当temp既不大于over也不小于over时，只有temp == over一种条件，则用户猜中幸运数字，程序结束
                System.out.println("恭喜您选中幸运数字，程序结束！！");
                break;//因为程序中使用的是while(true)，所以这里使用break结束循环
            }
        }
    }
}
