package kz.bitlab.techorda.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DBConnection {

    private static Connection connection;

    static {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static ArrayList<Items> getItems(){
        ArrayList<Items> items = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement("select * from tech_orda_db.items");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                Items item = new Items();
                item.setId(resultSet.getInt("id"));
                item.setName(resultSet.getString("name"));
                item.setRam(resultSet.getString("ram"));
                item.setMemory(resultSet.getString("memory"));
                item.setOs(resultSet.getString("os"));
                item.setPrice(resultSet.getDouble("price"));
                items.add(item);
            }
            statement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return items;
    }

    public static Items getItem(int id){
        Items item = null;
        try {
            PreparedStatement statement = connection.prepareStatement("" +
                    "select * from tech_orda_db.items where id = ?");
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()){
                item = new Items();
                item.setId(resultSet.getInt("id"));
                item.setName(resultSet.getString("name"));
                item.setRam(resultSet.getString("ram"));
                item.setMemory(resultSet.getString("memory"));
                item.setOs(resultSet.getString("os"));
                item.setPrice(resultSet.getDouble("price"));
            }
            statement.close();

        }catch (Exception e){
            e.printStackTrace();
        }
        return item;
    }

    public static boolean isUserExist(String email, String password) {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT * FROM tech_orda_db.users WHERE email = ? AND password = ?");
            statement.setString(1, email);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();
            boolean userExists = resultSet.next();
            statement.close(); // закрытие statement
            return userExists;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

}
















