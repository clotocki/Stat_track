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
        return "Name: " + name + "\n Points: " + playerPTS + "\n Rebounds: " + playerRBD + "\n Assists: " + playerAST+ "\n Steals: " + playerSTL + "\n Blocks: " + playerBLK + "\n Player ID:" + playerID;
    }
    //function that allows users to edit that stats of players
    public static void statEdit(players inputPlayer) {
        boolean check2 = true;
        while (check2) {
        check2 = false;
        System.out.println("Enter 1 to edit " + inputPlayer.name + "'s PTS, Enter 2 for RBDS, Enter 3 for AST, Enter 4 for STL, Enter 5 for BLK, Enter 10 to exit  ");
        //program takes user input to figure out what stat the user wants to edit
        Scanner myScanner = new Scanner(System.in);
        int codeEDT = myScanner.nextInt();
        String egs = "Enter game stats: ";
        String st = "Season total: ";
        //input of 1 allows users to edit points
        if (codeEDT == 1) {
            System.out.println(" ");
            System.out.println(egs);
            System.out.println(" ");
            int gameStat = myScanner.nextInt();
            inputPlayer.playerPTS = inputPlayer.playerPTS + gameStat;
            System.out.println(" ");
            System.out.println(st + inputPlayer.playerPTS + " pts");
        //input of 2 allows users to edit rebounds
        }
        else if (codeEDT == 2) {
            System.out.println(" ");
            System.out.println(egs);
            System.out.println(" ");
            int gameStat = myScanner.nextInt();
            inputPlayer.playerRBD = inputPlayer.playerRBD + gameStat;
            System.out.println(" ");
            System.out.println(st + inputPlayer.playerRBD + " rebounds");
        }
        else if (codeEDT == 3) {
            System.out.println(" ");
            System.out.println(egs);
            System.out.println(" ");
            int gameStat = myScanner.nextInt();
            inputPlayer.playerAST = inputPlayer.playerAST + gameStat;
            System.out.println(" ");
            System.out.println(st + inputPlayer.playerAST + " assists");
        }
        else if (codeEDT == 4) {
            System.out.println(" ");
            System.out.println(egs);
            System.out.println(" ");
            int gameStat = myScanner.nextInt();
            inputPlayer.playerSTL = inputPlayer.playerSTL + gameStat;
            System.out.println(" ");
            System.out.println(st + inputPlayer.playerSTL + " steals");
        }
        else if (codeEDT == 5) {
            System.out.println(" ");
            System.out.println(egs);
            System.out.println(" ");
            int gameStat = myScanner.nextInt();
            inputPlayer.playerBLK = inputPlayer.playerBLK + gameStat;
            System.out.println(" ");
            System.out.println(st + inputPlayer.playerBLK + " blocks");
        }
        else if (codeEDT == 10) {
            System.out.println("");
            System.out.println(">break");
            System.out.println(" ");  
        }
        else {
            System.out.println(" ");
            System.out.println("Invalid entry");
            System.out.println(" ");
            check2 = true;
        }
    }
}
/* public static void mergeSort(ArrayList arr) {
        if (arr.size() < 2) {
            return;
        }
        int mid = arr.size() / 2;
        ArrayList<Integer> left = new ArrayList<Integer>();
        ArrayList<Integer> right = new ArrayList<Integer>();
        for (int i = 0; i < mid; i++) {
            left.add(arr.get(i));
        }
        for (int i = mid; i < arr.size(); i++) {
            right.add(arr.get(i));
        }
        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }

    public static void merge(ArrayList<Integer> arr, ArrayList<Integer> left, ArrayList<Integer> right) {
        int i = 0, j = 0, k = 0;
        while (i < left.size() && j < right.size()) {
            if (left.get(i) < right.get(j)) {
                arr.set(k, left.get(i));
                i++;
            } else {
                arr.set(k, right.get(j));
                j++;
            }
            k++;
        }
        while (i < left.size()) {
            arr.set(k, left.get(i));
            i++;
            k++;
        }
        while (j < right.size()) {
            arr.set(k, right.get(j));
            j++;
            k++;
        }
    }
}
*/
}
