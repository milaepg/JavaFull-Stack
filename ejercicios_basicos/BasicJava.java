import java.util.ArrayList;
import java.util.Arrays;

public class BasicJava {
    public static void printNumbers(){
        for(int i = 1; i <= 255; i++){
          System.out.println(i);  
        }
    }

    public static void printOddNumbers(){
        for(int i = 1; i <= 255; i +=2){
            System.out.println(i);  
        }
    }

    public void iterateArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(i);
        }
    }
    public int findMaz(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public double findAverege(int[] arr){
        double sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum / arr.length;

    }
    public int [] createOddArray(){
        ArrayList <Integer> oddList = new ArrayList<Integer>();
        for(int i = 1; i <= 255; i +=2){
            oddList.add(i);
        }
        int[] oddArray = new int[oddList.size()];
        for(int i = 0; i < oddArray.length; i++){
            oddArray[i] = oddList.get(i);
        }
        return oddArray;
    }
    public int countGreaterThanY(int[] arr, int y){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > y){
                count++;
            }
        }
        return count;
    }
}
