package Geometric;

public class Retangulo extends Shape2D{
    public Retangulo(Float XX, Float YY) {
        super(XX, YY);
    }

    @Override
    public void descricao() {
        // super.descricao();
        System.out.println("Sou o retangulo com as arestas introduzidas " +  + getXX() + ", " + getYY() +
                " com area " + get_area( ) + " e perimetro " + get_perimetro( ) );

    }
}
