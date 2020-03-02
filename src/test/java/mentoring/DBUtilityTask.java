package mentoring;

import utilities.DBUtility;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DBUtilityTask {

    public static void main(String[] args) throws SQLException {
        DBUtility dbUtility = new DBUtility();
        dbUtility.createConnection();
        List<Map<Object, Object>> myData = DBUtility.executeQuery("select * from employees");
        DBUtility.close();
        for (Map<Object, Object> map : myData) {
            System.out.println(map.get("EMPLOYEE_ID"));
        }
    }
}

//        public static void main(String[] args) {
//            // url: ec2-18-219-241-100.us-east-2.compute.amazonaws.com
//            // port: 1521
//            // SID: xe
//            // username: hr
//            // password: hr
////        String url = "jdbc:oracle:thin:@yoururl:1521:xe";
//            String url = "jdbc:oracle:thin:@ec2-18-219-241-100.us-east-2.compute.amazonaws.com:1521:xe";
//            String username = "hr";
//            String password = "hr";
//            // 3 classes that we need for testing database
//            // Connection => create connection
//            // Statement => write query
//            // ResultSet => result will be stored => new datatype
//            try {
//                Connection connection = DriverManager.getConnection(url, username, password);
//                Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
//                ResultSet resultSet = statement.executeQuery("select first_name, last_name, salary from employees");
//                // we will get information of our resultset, like how many columns and name of the column and so on...
//                ResultSetMetaData metaData = resultSet.getMetaData();
//                // we get number of column
//                int numberOfColumns = metaData.getColumnCount();
//                String columnName1 = metaData.getColumnName(1);
//                String columnName2 = metaData.getColumnName(2);
//                String columnName3 = metaData.getColumnName(3);
////            String columnName4 = metaData.getColumnName(4);
//                System.out.println("Index 1 Column Name: "+columnName1);
//                System.out.println("Index 2 Column Name: "+columnName2);
//                System.out.println("Number of Columns: "+numberOfColumns);
//                List<Map<Object, Object>> data = new ArrayList<>();
//                int number = 1;
//                while(resultSet.next()){
//                    Map<Object, Object> map = new HashMap<>();
//                    for(int i = 1; i <= numberOfColumns; i++ ){
//                        map.put(metaData.getColumnName(i), resultSet.getObject(i));
//                    }
//                    data.add(map);
//                }
//                // print row 4, first and last name : expected : Alexander, Hunold
//                System.out.println("Connection successful!");
//                connection.close();
//                statement.close();
//                resultSet.close();
//
//                for(Map<Object, Object> map: data){
//                    System.out.println(map);
//                }
//            } catch (SQLException e) {
//                System.out.println(e.getLocalizedMessage());
//                System.out.println("Connection failed!");
//            }
//        }
//    }