public class Main {
    public static void main(String[] args) {
        for (int i = 1;i<=5;i++){
            Student s = new Student("100" + i,
                    switch (i){
                        case 1 -> "kamalesh";
                        case 2 -> "jp";
                        case 3 -> "kavin";
                        case 4 -> "hari";
                        case 5 -> "momo";
                        default -> "no name";
                }
                    ,"18/09/2002"
                    ,"engineering");
            System.out.println(s);                  //here the toString will be called in it. POJO plain old java object.
        }
    }

}
