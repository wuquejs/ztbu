package cc.wuque;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            int x, y, z;
            System.out.println("****欢迎使用口算练习系统****");
            System.out.println("1、加法练习");
            System.out.println("2、减法练习");
            System.out.println("3、乘法练习");
            System.out.println("4、除法练习");
            System.out.print("请选择需要练习的序号:");
            z = sc.nextInt();
            System.out.print("请选择需要练习的次数:");

            int count = sc.nextInt();
            if (z == 1){
                System.out.print("您选择了加法练习");
                while(count != 0 ){
                    System.out.println("当前剩余练习次数:" + count);
                    x = (int) (Math.random() * 50);
                    y = (int) (Math.random() * 50);
                    System.out.print(x + "+" + y + "=");
                    int result = sc.nextInt();
                    if (result != (x + y)){
                        System.out.println("回答错误,正确答案:" + (x + y));
                    }else {
                        System.out.println("回答正确");
                    }
                    count--;
                }

            }else if (z == 2){
                System.out.print("您选择了减法练习");
                while (count != 0){
                    System.out.println("当前剩余练习次数:" + count);
                    x = (int) (Math.random() * 100);
                    y = (int) (Math.random() * 100);
                    while(y > x){
                        x = (int) (Math.random() * 100);
                    }
                    System.out.print(x + "-" + y + "=");
                    int result = sc.nextInt();
                    if (result != (x - y)){
                        System.out.println("回答错误，正确答案:" + (x - y));
                    }else {
                        System.out.println("回答正确");
                    }
                    count--;
                }
            }else if (z == 4){
                System.out.println("您选择了除法练习");
                //System.err.println("除法的运算结果只能为整数！！！");
                while (count != 0){
                    System.out.println("当前剩余练习次数:" + count );

                    x = (int) (Math.random() * 100);
                    y = (int) (Math.random() * 10);
                    while (x < y){
                        x = (int) (Math.random() * 100);
                    }
                    System.out.print(x + " / " + y + "=");
/*                    System.out.println();
                    System.out.println();*/
                    if (x % y == 0){
                        int result = sc.nextInt();
                        if (result != (x / y)){
                            System.out.println("回答错误,正确答案:" + (x / y));
                        }else {
                            System.out.println("回答正确");
                        }
                    }else {
                        double result = sc.nextDouble();
                        if (result != (double)x / (double)y){
                            System.out.println(x + "-----" + y);
                            System.out.println("回答错误,正确答案:" + ((double)x / (double) y));
                        }else {
                            System.out.println("回答正确");
                        }
                    }

                    count--;
                }
            }else if (z == 3){
                System.out.print("您选择了乘法练习");
                while (count != 0){
                    System.out.println("当前剩余练习次数:" + count);
                    x = (int) (Math.random() * 10);
                    y = (int) (Math.random() * 10);
                    System.out.print(x + " x " + y + "=");

                    int result = sc.nextInt();
                    if (result != (x * y)){
                        System.out.println("回答错误,正确答案:" + (x * y));
                    }else {
                        System.out.println("回答正确");
                    }
                    count--;
                }
            }else {
                System.out.println("您选择的序号有误或非法，请重新输入！！！！  ");
            }
        }
    }
}
