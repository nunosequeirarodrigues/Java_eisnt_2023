package Aula04;

import java.util.ArrayList;

public class EmpregadosArrayList extends ArrayList<Empregado> {

    @Override
    public boolean contains(Object o) {
        if (true == super.contains(o)){

            return true;
        }
        else{
        Empregado emp = (Empregado) o;
        for( Empregado itm: this ){
            if(itm.getName() == emp.getName() ){
                return true;
            }
            else{
                return false;
            }
        }
        }
        return false;
    }
}
