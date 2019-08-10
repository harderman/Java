package www.bittch.jdbc;

import java.sql.*;

public class MemoGroup {
    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Boolean createMemoGroup(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection
                    ("jdbc:mysql://127.0.0.1:3306/text?user=root&password=88888888&useSSL=false");
            String sql = "insert into memogroup(id,name) values (1,'jack'),(2,'mary')";
            Statement statement = connection.createStatement();
            int effect = statement.executeUpdate(sql);
            if(effect == 2){
                System.out.println("插入成功");
            }else{
                System.out.println("插入失败");
                return false;
            }
            statement.close();
            connection.close();
            return true;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public static void main(String[] args) {
       createMemoGroup();
    }
}
