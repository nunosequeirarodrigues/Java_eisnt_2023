package aula02.veiculo;

public class Carro extends Veiculo{


    @Override
    public void setEnergyType() {
        this.energyType = EnergyTypes.GASOLINA;
    }
}
