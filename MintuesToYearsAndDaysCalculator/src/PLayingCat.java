public class PLayingCat {
    public static boolean isCatPlaying(boolean summer,int temperture){
        if(summer == true){
            if(temperture >= 25 && temperture <= 45){
                return true;
            }
            else return false;
        }
        if(temperture >= 25 && temperture <= 35){
            return true;
        }else return false;
    }
    public static void main(String[] args) {
        System.out.println(isCatPlaying(false,35));
    }
}
