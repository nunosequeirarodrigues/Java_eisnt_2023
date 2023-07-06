package EX01;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBClientSQLite3 implements DBClient {
    Connection connection = null;
    Boolean IsOpen = false;

    @Override
    public void connect() throws DBException {
        System.out.println("connect SQLite3 ...");

        try
        {
            connection = DriverManager.getConnection("jdbc:sqlite:src/EX01/DB/EX02.db");
            IsOpen = true;
        }
        catch(SQLException e)
        {
            // if the error message is "out of memory",
            // it probably means no database file is found
            IsOpen = false;
            System.err.println(e.getMessage());
            throw new DBException(e.getMessage());
        }
    }

    @Override
    public Boolean isConnected() {
        return IsOpen;
    }

    @Override
    public void disconnect() throws DBException {

        try
        {
            if(connection != null) {
                connection.close();
            }
            IsOpen = false;

        }
        catch(SQLException e)
        {
            // connection close failed.
            System.err.println(e.getMessage());
            throw new DBException(e.getMessage());
        }

    }

    @Override
    public void read() {
        System.out.println("read SQLite3 ...");

    }

    @Override
    public void write() {
        System.out.println("write SQLite3 ...");
    }


    @Override
    public void list() throws DBException {
        System.out.println("list SQLite3 ...");
        try
        {
            Integer rowNumber = 0;

            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30);  // set timeout to 30 sec.

                ResultSet rs = statement.executeQuery("select * from COMMENTS LIMIT 10;");

                System.out.println("List " + rs.getRow() + " lines from table COMMENTS");

                // criar class Comments
                while(rs.next())
                {
                    ++rowNumber;
                    // read the result set
                    System.out.println("Row [" + rowNumber.toString() + "]");
                    System.out.println("Id = " + rs.getInt("Id"));
                    System.out.println("USER = " + rs.getString("USER"));
                    System.out.println("COMMENT = " + rs.getString("COMMENT"));

                }

        }
        catch(SQLException e)
        {
            // connection close failed.
            System.err.println(e.getMessage());
            throw new DBException(e.getMessage());
        }
    }


}
