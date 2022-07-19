/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomasdisiena
 */
public class Match {
    private String homeTeam;
    private String visitTeam;
    private int homePoints;
    private int visitPoints;
    
    public Match(String homeTeam, String visitTeam, int homePoints, int visitPoints){
        this.homeTeam = homeTeam;
        this.visitTeam = visitTeam;
        this.homePoints = homePoints;
        this.visitPoints = visitPoints;
    }
    
    public String getHomeTeam(){
        return this.homeTeam;
    }
    
    public String getVisitTeam(){
        return this.visitTeam;
    }
    
    public String getWinner() {
        if(homePoints > visitPoints){
            return this.homeTeam;
        } else{
            return this.visitTeam;
        }
    }
    
    public String getLoser() {
        if (homePoints < visitPoints) {
            return this.homeTeam;
        } else {
            return this.visitTeam;
        }
    }
    
    public String toString() {
        return this.homeTeam + " " + this.homePoints + " - " + this.visitTeam + " " + this.visitPoints;
    }
}
