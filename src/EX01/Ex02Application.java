package EX01;

import EX01.*;

public class Ex02Application {
    private static DBClient dbClient;

    public static void main(String[] args) {

        System.out.println("EX 02 >");

        try {
            dbClient = new DBClientFactory().getDBClient(DBClientType.SQLITE3);
        } catch (DBException e) {
//            throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }

        try {
            dbClient.connect( );
        } catch (DBException e) {
 //           throw new RuntimeException(e);
            System.err.println(e.getMessage());
        }
        dbClient.write( );
        dbClient.read( );


        System.out.println("EX 02 <");
    }


}
