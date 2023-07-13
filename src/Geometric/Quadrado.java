package Geometric;

public class Quadrado extends Shape2D {
    public Quadrado(Float XX) {
        super(XX, XX);
    }

    @Override
    public void descricao() {
        // super.descricao();
        System.out.println("Sou o quadrado com as arestas introduzidas " + getXX() + ", " + getYY() +
                " com area " + get_area( ) + " e perimetro " + get_perimetro( ) );

    }
}
