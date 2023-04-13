import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class App {
    static int killswitch = 0;
    static Scanner s0 = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        playerlist.readPlayerFile();
        int playerCode = 0;
        while (killswitch == 0) {
        boolean check = true;
        //while loop allows system to keep taking inputs until killswitch function is called
        while (check) {
        check = false;
            //System takes user input looking for code of either 1,2,3 or 827
        System.out.println("Enter Code: ");
        System.out.println("");
        int code = s0.nextInt();
           //if "1", program enters stat editor function
        if (code == 1) {
            System.out.println(" ");
            System.out.println(">Enter Stat Editor");
            getPlayerCode(playerCode);
            players.statEdit(playerlist.pList.get(playerCode));
        }
            //if "2", program enters stat check function
        else if (code == 2) {
            System.out.println("");
            System.out.println(">Enter Stat Check");
            getPlayerCode(playerCode);
            System.out.println(" ");
            System.out.println(playerlist.pList.get(playerCode));
            System.out.println(" ");
        }
            //if "3", program enters player creator function
        else if (code == 3) {
            System.out.println("");
            System.out.println(">Enter Player Creator");
            players myPlayer = playerlist.playerCreator();
            playerlist.addPlayer(myPlayer); 
        }
            //827 is the killswitch which will shut off the program
        else if (code == 827) {
            killswitchFunc();
    }
        else {
            System.out.println("Incorrect Value");
            check = true;
        }
            //add another function that sorts data if time allows
    }
    }
}
    static void killswitchFunc() {
        //killswitch function
        Boolean check1 = true;
            while (check1) {
            check1 = false;
            System.out.println("Press 1 to Confirm Killswitch, Press 2 to exit Killswitch");
            System.out.println(" ");
            int Confirmcode = s0.nextInt();
            if (Confirmcode == 1) {
                killswitch++;
            }
            else if (Confirmcode == 2) {
                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter("TestStats.txt"));
                    for (players p : playerlist.pList) {
                        String line = String.format("%s,%d,%d,%d,%d,%d,%d", p.name, p.playerID, p.playerPTS, p.playerAST, p.playerRBD, p.playerSTL, p.playerBLK);
                        writer.write(line);
                        writer.newLine();
                    }
                    writer.close();
                    System.out.println("Player stats saved successfully!");
                } catch (IOException e) {
                    System.out.println("An unexpected error occurred while saving player stats: " + e.getMessage());
                }
                break;
            }
            else {
                System.out.println("Invalid Input");
                check1 = true;
            } 
        }
        }
    static void getPlayerCode(int a) {
        //function to retrieve player ID from users
        System.out.println("Enter player code:");
        System.out.println(" ");
        a = s0.nextInt();
    }
}
