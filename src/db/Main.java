package db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1 加载驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2 获取连接
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/java_test?serverTimezone=Asia/Shanghai&autoReconnect=true&useSSL=false", "root", "root");
        //3 创建操作对象
        Statement smt = connection.createStatement();

        //4 发送命令
        ResultSet rs = smt.executeQuery("select * from tb_user");
        List<User> users = new ArrayList<>();
        //5 获取结果
        int i = 0;
        while (rs.next()) {
            int userId = rs.getInt(1);
            String userName = rs.getString(2);
            String userPassword = rs.getString(3);
            String userEmail = rs.getString(4);
            User user = new User(userId, userName, userPassword, userEmail);
            users.add(user);
        }

        System.out.println(users);

        String sql = "INSERT INTO tb_user (`userId`, `userName`, `userPwd`,`userEmail`) VALUES (5, 'test', 'test', 'test');";
        smt.executeUpdate(sql);


    }

}
