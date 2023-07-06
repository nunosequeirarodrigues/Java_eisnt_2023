package EX01;

public class DBClientSQLite3 implements DBClient {
    @Override
    public void connect() {
        System.out.println("connectSQLite3 ...");
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
    public void list() {
        System.out.println("list SQLite3 ...");

    }


}
