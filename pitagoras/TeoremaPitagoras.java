package pitagoras;

public class TeoremaPitagoras {
    public double calcularHipotenusa(int catetoA, int catetoB) {

        double resultado = 0.0;

        if(Math.abs(catetoA) > Math.abs(catetoB)){
            resultado = catetoB/catetoA;
            resultado = Math.abs(catetoA) * Math.sqrt(1 + resultado*resultado);
        }
        else if(catetoB != 0){
            resultado = catetoA/catetoB;
            resultado = Math.abs(catetoB) * Math.sqrt(1 + resultado*resultado);
            
        }

        System.out.println(catetoA +  catetoB);
        return resultado;
            }


}