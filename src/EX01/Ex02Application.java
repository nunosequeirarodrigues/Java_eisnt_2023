package EX01;

import EX01.*;

public class Ex02Application {

    public static void main(String[] args) {
        System.out.println("EX 02 >");
        try {
            DBClient dbClient = new DBClientFactory().getDBClient(DBClientType.SQLITE3);
        } catch (DBException e) {
//            throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }


        System.out.println("EX 02 <");
    }
}
