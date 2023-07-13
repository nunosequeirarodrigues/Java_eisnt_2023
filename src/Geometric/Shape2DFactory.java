package Geometric;

public class Shape2DFactory {
    public static Shape2D criarfigura(float xx, float yy){

        if(xx == 0 || yy == 0){
            return null;
        }else if( xx != yy ){
            return new Retangulo(xx, yy);
        }
            return new Quadrado(xx);

    }
}
