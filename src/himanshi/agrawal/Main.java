package himanshi.agrawal;

import himanshi.agrawal.BaseballPlayer;
import himanshi.agrawal.Team;

public class Main {
    public static void main(String[] args) {
        Team<FootballPlayer> footballTeam = new Team("andrew clubs");
        FootballPlayer joe = new FootballPlayer("joe");
        FootballPlayer zoe= new FootballPlayer("zoe");
        FootballPlayer toe = new FootballPlayer("toe");

        footballTeam.addPlayer(joe);
        footballTeam.addPlayer(zoe);
        footballTeam.addPlayer(toe);

        System.out.println(footballTeam.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("chicago cubs");
        BaseballPlayer num = new BaseballPlayer("num");
        BaseballPlayer bum = new BaseballPlayer("bum");
        BaseballPlayer pum = new BaseballPlayer("pum");

        baseballTeam.addPlayer(num);
        baseballTeam.addPlayer(bum);
        baseballTeam.addPlayer(pum);

        System.out.println(baseballTeam.numPlayers());




    }
}
