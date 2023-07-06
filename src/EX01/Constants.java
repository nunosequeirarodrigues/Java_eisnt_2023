package EX01;

public enum Constants {
    DB_EXCEPTION("DB Exception");

    private String constants;

    private Constants(String cons) {
        this.constants = cons;
    }

    @Override
    public String toString(){
        return constants;
    }
}
