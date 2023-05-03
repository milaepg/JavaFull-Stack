package ListadeExcepciones;
import java.util.*;

public class ExceptionsList {
    static ArrayList myList = new ArrayList<>();
    public static void main(String[] args){
        myList.add("13");
        myList.add("hello word");
        myList.add(48);
        myList.add("goodbye world");
        
        for(int i = 0; i < myList.size(); i++){
            try{
                int castedValue = (Integer) myList.get(i);
            }
            catch(ClassCastException exception){
                exception.printStackTrace();
                System.out.println("Excepción capturada: " + myList.get(i));
            }
        }
    }
    
}
