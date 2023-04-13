import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner; 

public class playerlist {

    static String filename = "PlayerStatstest2.txt";
    //creates arraylist to hold player data
    static ArrayList<players> pList = new ArrayList<>();
    //player id corresponds to index in arraylist
    static int playID = 0;


    static void readPlayerFile() {
    try {
        BufferedReader reader = new BufferedReader(new FileReader("TestStats.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            String name = parts[0];
            int id = Integer.parseInt(parts[1]);
            int points = Integer.parseInt(parts[2]);
            int rebounds = Integer.parseInt(parts[3]);
            int assists = Integer.parseInt(parts[4]);
            int blocks = Integer.parseInt(parts[5]);
            int steals = Integer.parseInt(parts[6]);
            players newPlayer = new players(name, id, points, rebounds, assists, blocks, steals);
            addPlayer(newPlayer);
            playID++;
        }
        reader.close();
    } catch (IOException e) {
        System.out.println("An error occurred while reading player data from file: " + e.getMessage());
    }
}
    //function takes inputed player and adds them to array list, also printing it out to display
    static void addPlayer(players exPlayer) {
        pList.add(exPlayer);
        System.out.println(pList.get(exPlayer.playerID).toString());
        System.out.println(" ");
    }
     
    //function to add players into system
     static players playerCreator() {
        String name;

        Scanner s0 = new Scanner(System.in);

        System.out.print("Enter Player Name: ");
        name = s0.nextLine();

        players newPlayers = new players(name, playID, 0, 0, 0, 0, 0);
        playID++;

        System.out.println("\nNew Player Added!");
        System.out.println(" ");

        return newPlayers;
    }
}
