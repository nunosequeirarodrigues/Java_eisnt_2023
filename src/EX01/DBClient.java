package EX01;

public interface DBClient {
    public void connect() throws DBException;

    public void disconnect() throws DBException;

    public void read();

    public void write();

    public void list() throws DBException;
}
