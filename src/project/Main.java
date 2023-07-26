package project;

import project.db.Db;
import project.entity.Student;

import java.util.List;
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
                    Scanner in2 = new Scanner(System.in);
                    System.out.println("输入学生学号");
                    String sid = in2.nextLine();
                    System.out.println("输入学生姓名");
                    String name = in2.nextLine();
                    System.out.println("输入学生年龄");
                    int age = in2.nextInt();
                    Student student = new Student(sid,name,age);
                    //这种方式也行
//                    student.setAge(age);
//                    student.setName(name);
//                    student.setSid(sid);
                    List<Student> students = Db.students;
                    students.add(student);
                    break;
                case "2":
                    System.out.println("请输入你要删除的学生学号");
                    String sid1 = in.nextLine();



                    break;
                case "3":
                    System.out.println("请输入你要修改的学生学号");
                    break;
                case "4":
                    List<Student> students1 = Db.students;
                    System.out.println(students1.toString());
                    break;
                case "5":
                    System.out.println("谢谢使用！");
                    System.exit(0);//虚拟机退出（整个程序退出）
                default:
                    System.out.println("输入不正确");
            }
        }
    }

}
