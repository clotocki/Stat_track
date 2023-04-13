import java.util.Scanner;

//blueprint to create player objects to add to system
public class players {
    
    //player atributes system holds, all start at zero
    int playerPTS;
    int playerAST;
    int playerRBD;
    int playerBLK;
    int playerSTL;
    String name;
    int playerID;

    public players(String pName, int pID, int pPTS, int pAST, int pRBD, int pBLK, int pSTL) {
        name = pName;
        playerID = pID;
        playerPTS = pPTS;
        playerAST = pAST;
        playerRBD = pRBD;
        playerBLK = pBLK;
        playerSTL = pSTL;
    }
    @Override
    //converts data to string to be held in arraylist
    public String toString() {
        return "\nName: " + name + "\n Points: " + playerPTS + "\n Rebounds: " + playerRBD + "\n Assists: " + playerAST+ "\n Steals: " + playerSTL + "\n Blocks: " + playerBLK + "\n ID: " + playerID;
    }
    //function that allows users to edit that stats of players
    public static void statEdit(players inputPlayer) {
        boolean check2 = true;
        while (check2) {
        check2 = false;
        //System.out.println("Enter 1 to edit " + inputPlayer.name + "'s PTS, Enter 2 for RBDS, Enter 3 for AST, Enter 4 for STL, Enter 5 for BLK, Enter 10 to exit  ");
        
        System.out.println("Choose which stat to input:");
        System.out.println("1. Points");
        System.out.println("2. Rebounds");
        System.out.println("3. Assists");
        System.out.println("4. Steals");
        System.out.println("5. Blocks");
        System.out.println("10. Exit Stat Editor");
        System.out.print("--> ");
        //program takes user input to figure out what stat the user wants to edit
        Scanner myScanner = new Scanner(System.in);
        int codeEDT = myScanner.nextInt();
        String egs = "Enter game stats: ";
        String st = "Season total: ";
        //input of 1 allows users to edit points
        if (codeEDT == 1) {
            System.out.println(" ");
            System.out.println(egs);
            System.out.print("--> ");
            int gameStat = myScanner.nextInt();
            inputPlayer.playerPTS = inputPlayer.playerPTS + gameStat;
            System.out.println(" ");
            System.out.println(st + inputPlayer.playerPTS + " points");
        //input of 2 allows users to edit rebounds
        }
        else if (codeEDT == 2) {
            System.out.println(" ");
            System.out.println(egs);
            System.out.print("--> ");
            int gameStat = myScanner.nextInt();
            inputPlayer.playerRBD = inputPlayer.playerRBD + gameStat;
            System.out.println(" ");
            System.out.println(st + inputPlayer.playerRBD + " rebounds");
        }
        else if (codeEDT == 3) {
            System.out.println(" ");
            System.out.println(egs);
            System.out.print("--> ");
            int gameStat = myScanner.nextInt();
            inputPlayer.playerAST = inputPlayer.playerAST + gameStat;
            System.out.println(" ");
            System.out.println(st + inputPlayer.playerAST + " assists");
        }
        else if (codeEDT == 4) {
            System.out.println(" ");
            System.out.println(egs);
            System.out.print("--> ");
            int gameStat = myScanner.nextInt();
            inputPlayer.playerSTL = inputPlayer.playerSTL + gameStat;
            System.out.println(" ");
            System.out.println(st + inputPlayer.playerSTL + " steals");
        }
        else if (codeEDT == 5) {
            System.out.println(" ");
            System.out.println(egs);
            System.out.print("--> ");
            int gameStat = myScanner.nextInt();
            inputPlayer.playerBLK = inputPlayer.playerBLK + gameStat;
            System.out.println(" ");
            System.out.println(st + inputPlayer.playerBLK + " blocks");
        }
        else if (codeEDT == 10) {
            System.out.println("");
            System.out.println(">break");
            System.out.println(" ");
            break;  
        }
        else {
            System.out.println(" ");
            System.out.println("Invalid entry");
            System.out.println(" ");
            check2 = true;
        }
    }
}
}
