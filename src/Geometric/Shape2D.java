package Geometric;

public class Shape2D {

    public static void main(String[] args) {

    }

    private Float XX;
    private Float YY;

    public Float getXX() {
        return XX;
    }

    public Float getYY() {
        return YY;
    }

    public Shape2D(Float XX, Float YY) {
        this.XX = XX;
        this.YY = YY;
    }

    public void descricao() {
        System.out.println("A figura com as arestas introduzidas "  + XX + ", " + YY +
                " tem a area " + get_area( ) + " e perimetro " + get_perimetro( ) );

    }

    public String get_perimetro() {
        String s;
        float f = XX + YY;
        s = String.valueOf( f );
        return s;
    }

    public String get_area() {
        String s;
        s = String.valueOf( XX * YY );
        return s;
    }


}
