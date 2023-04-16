package academy.learnprogramming;

public class Main {
    public static void main(String args[]){
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Minimum Value = " + myMaxIntValue);

        byte myByteMinValue = Byte.MIN_VALUE;
        byte myByteMaxValue = Byte.MAX_VALUE;
        System.out.println("byte Minimum Value = " + myByteMinValue);
        System.out.println("byte Minimum Value = " + myByteMaxValue);

        int myTotal = (myMinIntValue / 2);
        byte myNewByte = (byte) (myByteMinValue / 2);//casting means convert number into one type to another type.

    }
}
