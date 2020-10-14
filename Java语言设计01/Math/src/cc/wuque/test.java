package cc.wuque;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int j,k,m,z;
            System.out.println("****欢迎使用口算练习系统****");
            System.out.println("1、加法练习");
            System.out.println("2、减法练习");
            System.out.println("3、乘法练习");
            System.out.println("4、除法练习");
            System.out.print("请选择需要练习的序号:");
            z = sc.nextInt();

            if (z == 1){
                j = (int) (Math.random() * 50);
                k = (int) (Math.random() * 50);
                System.out.print(x + "+" + y + "=");
                int result = sc.nextInt();
                if (result != (x + y)){
                    System.out.println("回答错误,正确答案:" + (x + y));
                }else {
                    System.out.println("回答正确");
                }
            }else if (z == 2){

                j = (int) (Math.random() * 100);
                k = (int) (Math.random() * 100);
                while(k > j){
                    j = (int) (Math.random() * 100);
                }
                System.out.print(j + "-" + k + "=");
                int result = sc.nextInt();
                if (result != (j - k)){
                    System.out.println("回答错误，正确答案:" + (j - k));
                }else {
                    System.out.println("回答正确");
                }
            }else if ()



        }
    }
}
