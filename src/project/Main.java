package project;

import java.util.Scanner;

public class Main {
    /*
       1. 用输出语句完成主界面的编写
       2. 用Scanner实现键盘录入数据
       3. 用switch语句完成操作的选择
       4. 用循环完成再次回到主界面
    */
    public static void main(String[] args) {
        //用循环完成再次回到主界面,重复整个操作,但无法退出，需要强制退出
        while (true) {
            //用输出语句完成主界面的编写
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看所有学生");
            System.out.println("5.退出");
            System.out.println("请输入你的选择：");

            //用Scanner实现键盘录入
            Scanner in = new Scanner(System.in);//标准式输入
            String line = in.nextLine();//获取一行字符串

            //用switch语句完成操作的选择
            switch (line) {
                case "1":
                    System.out.println("添加学生");
                    break;
                case "2":
                    System.out.println("删除学生");
                    break;
                case "3":
                    System.out.println("修改学生");
                    break;
                case "4":
                    System.out.println("查看所有学生");
                    break;
                case "5":
                    System.out.println("谢谢使用！");
                    System.exit(0);//虚拟机退出（整个程序退出）
            }
        }
    }

}
