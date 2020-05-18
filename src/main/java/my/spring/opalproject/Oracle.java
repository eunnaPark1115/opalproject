package my.spring.opalproject;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Oracle {
   public static void main(String[] args) {
      String driver = "oracle.jdbc.driver.OracleDriver";
      String url = "jdbc:oracle:thin:@localhost:1521:XE";
      String user = "opal";
      String password = "opal";
      try {
         Class.forName(driver);
         System.out.println("jdbc driver 로딩 ?성공");
         DriverManager.getConnection(url, user, password);
         System.out.println("?��?��?�� ?���? ?���?");
      } catch (ClassNotFoundException e) {
         System.out.println("jdbc driver 로딩 ?-_-");
      } catch (SQLException e) {
         System.out.println("jdbc driver오류오류 ?-_-");
      }
   }

}