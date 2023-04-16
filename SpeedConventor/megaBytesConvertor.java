public class megaBytesConvertor {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
            int megaBytes = 0;
            int remainder = 0;
            if(kiloBytes<0){
                System.out.println("Invalid Value");
            }else{
                megaBytes = kiloBytes/1024;
                remainder = kiloBytes%1024;
                System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainder + " KB ");
            }
        }
}
