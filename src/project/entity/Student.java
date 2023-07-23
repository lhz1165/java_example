package project.entity;
/*
    学生类
    Alt+Insert 根据自己的需求进行选择
 */

public class Student {
    //学号
    private String sid;
    //姓名
    private String name;
    //年龄
    private String age;
    //居住地
    private String address;
    //构造方法
    public Student() {//快捷键：Alt+Insert 一个参数都不选，选择包就是无参构造
    }
    //带四个参数构造
    public Student(String sid, String name, String age, String address) {//按住Shift全选构造带四个参数的方法
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.address = address;
    }
    //相应get/set方法,快捷键全选
    public String getSid() {
        return sid;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
