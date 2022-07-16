
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String fileName = scan.nextLine();
        
        System.out.println("Team:");
        String teamName = scan.nextLine();
        
        int count = 0;
        int wins = 0;
        int losses = 0;

        ArrayList <Match> matches = new ArrayList<>();

        try ( Scanner fileReader = new Scanner(Paths.get(fileName))) {
            while (fileReader.hasNextLine()) {
               String line = fileReader.nextLine();
               String[] parts = line.split(",");
               
               matches.add(new Match(parts[0], parts[1], Integer.valueOf(parts[2]), Integer.valueOf(parts[3])));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        for(Match match : matches){
            if(match.getHomeTeam().equals(teamName) || match.getVisitTeam().equals(teamName)){
                count++;
            }
            
            if(match.getWinner().equals(teamName)){
                wins++;
            }
            
            if (match.getLoser().equals(teamName)) {
                losses++;
            }
        }
        
        System.out.println("Games: " + count);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

}
