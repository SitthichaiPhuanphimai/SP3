import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Open_close {

    @Test
    public void openConnection_closeConnection()  {
        Connection connection;

        String url ="jdbc:mysql://mysql11.unoeuro.com:3306/?user=matechsolutions_dk_db";
        String userName = "matechsolutions_dk";
        String password ="cenyktwx";


        try {
            connection = DriverManager.getConnection(url,userName,password);
            Assertions.assertEquals(true,connection.isValid(1));
            connection.close();
            Assertions.assertEquals(false,connection.isValid(1));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
