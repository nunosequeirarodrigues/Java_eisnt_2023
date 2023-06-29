package aula02.veiculo;

enum EnergyTypes {
    MANUAL,
    GASOLINA,
    GASOLEO,
    ELECTIC
}

public class Veiculo {

    public String cor;
    public EnergyTypes energyType;

    public Veiculo() {
        setEnergyType( );
    }

    public void setEnergyType( ){
        energyType = EnergyTypes.MANUAL;
    }

    public void display_characteristics( ){
        System.out.printf("Energy Type: %s", this.energyType);
    }

}
