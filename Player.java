// Author: Endri Dibra
// Topic: Mundial [Messi vs Ronaldo]

// importing the required libraries
import java.util.Scanner;


// class definition
public class Player {

    // defining the fields of the class
    private String name; 
    private String surname;
    private int id;
    private int goals;
    private String team;


    // defining constructor and initializing fields
    public Player(String a, String b, int c, String d) {
        
        this.name = a;
        this.surname = b;
        this.id = c;
        this.goals = 0;
        this.team = d;

    }


    // getting player's name
    public String get_Name() {

        return name;
    }


    // getting player's surname
    public String get_Surname() {

        return surname;
    }


    // getting player's id
    public int get_Id() {

        return id;
    }


    // increasing by one goal the total goals of the player
    public void score() {

        this.goals ++;
    }


    // getting player's total goals
    public int get_Goals() {

        return goals;
    }


    // getting player's team
    public String get_Team() {

        return team;
    }


    // main() definition
    public static void main(String[] args) {
        
        
        // greeting the user
        System.out.println("Hello! Nice to meet you, what is your name ?");

        Scanner input = new Scanner(System.in);
        String user_name = input.next();
        
        System.out.println("Welcome " + user_name);


        //initializing parameters for our player_1

        System.out.println("Please insert the name, surname, id and team of player_1 (Of Messi)");

        String name1 = input.next();
        String surname1 = input.next();
        int id1 = input.nextInt();
        String team1 = input.next();

        
        //initializing parameters for our player_1

        System.out.println("Please now insert the name, surname, id and team of player_2 (Of Ronaldo)");

        String name2 = input.next();
        String surname2 = input.next();
        int id2 = input.nextInt();
        String team2 = input.next();


        // defining player_1
        Player obj1 = new Player(name1, surname1, id1, team1);
        
        // defining player_2
        Player obj2 = new Player(name2, surname2, id2, team2);

        // the leg that player scored the goal
        String leg [] = {"Left", "Right", "Right", "Left", "Right", "Right", "Left"};

        // the way player scored the goal
        String way [] = {"Penalty", "Foul", "Foul", "Penalty", "Penalty"};

    
        // checking for goals
        for ( String i : leg ) {

            if (i == "Left") {

                obj1.score();
            }

            else if (i == "Right") {

                obj2.score();
            }
        }


        // checking for goals
        for ( String i : way ) {

            if (i == "Foul") {
                                
                obj1.score();
            }

            
            else if (i == "Penalty") {

                obj2.score();
            }
        }        
        

        // one empty line
        System.out.println();

        
        // comparing and getting the winner based on goals
        if ( obj1.get_Goals() > obj2.get_Goals() ) {
            
            System.out.println(" # THE WINNER IS #");
            System.out.println("Name: " + obj1.get_Name());
            System.out.println("Surname: " + obj1.get_Surname());
            System.out.println("ID: " + obj1.get_Id());
            System.out.println("with: " + obj1.get_Goals() + " goals");
            System.out.println("for: " + obj1.get_Team());        

        }


        else if ( obj2.get_Goals() > obj1.get_Goals() ) {

            System.out.println("# THE WINNER IS #");
            System.out.println("Name: " + obj2.get_Name());
            System.out.println("Surname: " + obj2.get_Surname());
            System.out.println("ID: " + obj2.get_Id());
            System.out.println("with: " + obj2.get_Goals() + " goals");
            System.out.println("for: " + obj2.get_Team());

        }

    }
}
