package Generic;
interface Player {
    String name();
}
record BaseballPlayer(String name, String position) implements Player{}
record FootballPlayer(String name, String position) implements Player{}
record VolleyballPlayer(String name, String position) implements Player{}

public class Main {
    public static void main(String[] args) {

        var philly = new Affiliation("city","philadelphia, PA","US");
        BaseBallTeam crca1 = new BaseBallTeam("challengers");
        BaseBallTeam hrs1 = new BaseBallTeam("hockers");
        scorceResult(crca1,3,hrs1,5);

        SportsTeam crca2 = new SportsTeam("challengers");
        SportsTeam hrs2 = new SportsTeam("hockers");
        scorceResult(crca2,3,hrs2,5);

        Team<BaseballPlayer, Affiliation> crca = new Team<>("challengers",philly);
        Team<BaseballPlayer, Affiliation> hrs = new Team<>("hockers");
        scorceResult(crca,3,hrs,5);

        var kamalesh = new BaseballPlayer("B Harper", "left position");
        var bala =  new BaseballPlayer("B marsh", "right position");
        crca.addTeamMember(kamalesh);
        crca.addTeamMember(bala);
        var guthrie = new BaseballPlayer("D Guthrie","center fielder");
        crca.addTeamMember(guthrie);
        crca.listTeamMembers();

        SportsTeam afc1 = new SportsTeam("adelaide crows");
        Team<FootballPlayer, Affiliation> afc = new Team<>("adelaide crows");
        var tex = new FootballPlayer("tex walker", "center position");
        afc.addTeamMember(tex);
        var rory = new FootballPlayer("Rory Laird","midfield");
        afc.addTeamMember(rory);
        afc.listTeamMembers();

        Team<VolleyballPlayer, Affiliation> adelaide = new Team<>("adelaide storm");
        adelaide.addTeamMember(new VolleyballPlayer("N Roberts", "setter"));
        adelaide.listTeamMembers();

        var canberra = new Team<VolleyballPlayer, Affiliation>("Canberra Heat");
        canberra.addTeamMember(new VolleyballPlayer("B Black", "opposite"));
        canberra.listTeamMembers();
        scorceResult(canberra,0,adelaide,1);

//        Team<Integer> melbourneVB = new Team<>("Melbourne Vipers");

    }

    public static void scorceResult(BaseBallTeam team1 , int t1_score,
                                    BaseBallTeam team2 , int t2_score){
        String message = team1.setScore(t1_score,t2_score);
        team2.setScore(t2_score,t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scorceResult(SportsTeam team1 , int t1_score,
                                    SportsTeam team2 , int t2_score){
        String message = team1.setScore(t1_score,t2_score);
        team2.setScore(t2_score,t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scorceResult(Team team1 , int t1_score,
                                    Team team2 , int t2_score){
        String message = team1.setScore(t1_score,t2_score);
        team2.setScore(t2_score,t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }
}
