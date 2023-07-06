package Aula04;

public enum Constants {
    EMPREGADO_NAME_NONE("Jonh Doe"),
    EMPREGADO_IDADE_NONE("0");
    private String constants;

    private Constants(String cons) {
        this.constants = cons;
    }

    @Override
    public String toString(){
        return constants;
    }
}
