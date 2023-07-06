package Aula04;

public class Empregado {
    private String name;
    private Integer idade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Empregado() {
        this.name = Constants.EMPREGADO_NAME_NONE.toString();

        this.idade = Integer.parseInt(Constants.EMPREGADO_IDADE_NONE.toString());
    }

    public Empregado(String name, Integer idade) {
        this.name = name;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Empregado [Nome = " + name + ", Idade = " + idade.toString() + "]";
    }
}
