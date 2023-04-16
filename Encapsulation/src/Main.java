public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "kamal";
//        player.health = 20;
//        player.weapon = "sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("remaing health = " +player.haalthRemaing());
//        player.health = 200;
//        player.loseHealth(11);
//        System.out.println("remaing health = " + player.haalthRemaing());



        EnhanchedPlayer tim = new EnhanchedPlayer("kamal",200,"sword");
        System.out.println("initial health is " + tim.haalthRemaing() );
    }
}