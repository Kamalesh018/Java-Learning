public class EnhanchedPlayer {
    private String fullName;
    private int healthPercentage;
    private String weapon;

    public EnhanchedPlayer(String fullName) {
       this(fullName,100,"sword");
    }

    public EnhanchedPlayer(String fullName, int health, String weapon) {
        this.fullName = fullName;
        if(health <= 0) {
            this.healthPercentage = 1;
        } else if (health > 100) {
            this.healthPercentage = 100;
        } else {
            this.healthPercentage = health;
        }
        this.weapon = weapon;
    }


    public void loseHealth(int damage) {
        healthPercentage = healthPercentage - damage;
        if(healthPercentage <= 0) {
            System.out.println("player knocked out of game");
        }
    }

    public int haalthRemaing() {
        return healthPercentage;
    }

    public void restoreHealth(int extraHealth) {
        healthPercentage = healthPercentage + extraHealth;
        if(healthPercentage > 100){
            System.out.println("player restored to 100%");
            healthPercentage = 100;
        }
    }
}
