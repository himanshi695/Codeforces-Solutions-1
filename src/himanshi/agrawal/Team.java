package himanshi.agrawal;

import java.util.ArrayList;

public class Team<T extends Player> {
    private String name;
    private int won = 0;
    private int loss=0;
    private int tied=0;
    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println(player.getName() + " is on team " + this.name);
            return false;
        } else{
            members.add(player);
            System.out.println(player.getName() + " is added to the team " + this.name);
            return true;
        }
    }
    public int numPlayers(){
        return this.members.size();
    }

    public int matchResult(Team opponent, int ourScore, int theirScore){
        if(ourScore>theirScore){
            return won++;
        }else if(ourScore==theirScore){
            return tied++;
        }else{
            return loss++;
        }
    }



}
