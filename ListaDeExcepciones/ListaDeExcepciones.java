package ListaDeExcepciones;
import java.util.*;

public class ListaDeExcepciones{
    public void workTest(){
        ArrayList<Object> workList = new ArrayList<Object>();
        workList.add("22");
        workList.add("Gatos en mi pasta");
        workList.add(15);
        workList.add("¿O cubrí de pasta a mis gatos?");
        workList.add(99);
    
        try {
            for(int i = 0; i < workList.size(); i++){
                Integer castedValue = (Integer) workList.get(i);
            } 
        } catch(ClassCastException e) {
            System.out.println("Moo");
        }
    
   }
    
}
