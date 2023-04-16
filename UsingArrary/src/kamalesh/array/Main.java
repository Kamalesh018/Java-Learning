package kamalesh.array;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));
        System.out.println();
        int[] secondArray = getRandomArray(10);
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));
        System.out.println();
        int[] thirdArray = getRandomArray(10);
        Arrays.sort(thirdArray);
        System.out.println(Arrays.toString(thirdArray));
        System.out.println();
        int[] fouthArray = Arrays.copyOf(thirdArray,thirdArray.length);
        System.out.println(Arrays.toString(fouthArray));

        int[] smallArray =Arrays.copyOf(thirdArray,5);
        System.out.println(Arrays.toString(smallArray));

        String sArray[] = {"kamalesh" , "bala", "mukesh", "dinesh","kavin"};
        Arrays.sort(sArray);
        if(Arrays.binarySearch(sArray,"hirthick") >= 0){
            System.out.println("found dinesh in the list");
        }else {
            System.out.println("not found in array");
        }

        int[] s1 = {1,2,3,4,5};
        int[] s2= {2,3,4,5};
        if(Arrays.equals(s1,s2)){
            System.out.println("Arrays are equal");
        }else{
            System.out.println("Arrays are not equal");
        }
    }

    public static int[] getRandomArray(int len){
        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i< len; i++){
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
}
