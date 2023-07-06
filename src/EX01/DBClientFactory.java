package EX01;

public class DBClientFactory {


    public DBClient getDBClient(DBClientType dbType ) throws DBException {
        switch (dbType){
            case SQLITE3:
                return new DBClientSQLite3();
            case HANA:

            case MYSQL:

            default:
                throw new DBException(Constants.DB_EXCEPTION.toString() + dbType);
        }

    }

}
