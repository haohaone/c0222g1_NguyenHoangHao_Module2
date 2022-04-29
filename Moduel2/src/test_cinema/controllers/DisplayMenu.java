package test_cinema.controllers;



import test_cinema.service.implement.CinemaServiceImplement;

import java.util.Scanner;

public class DisplayMenu {
    public static CinemaServiceImplement cinemaServiceImplement = new CinemaServiceImplement();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (true){
            System.out.println("----Menu Cinema----");
            System.out.println("1. Display Cinema interest");
            System.out.println("2. Add new interest");
            System.out.println("3. Delete by id interest");
            System.out.println("4. Exit menu");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");;
            }
            switch (choice){
                case 1:
                    cinemaServiceImplement.display();
                    break;
                case 2:
                    cinemaServiceImplement.addNew();
                    break;
                case 3:
                    cinemaServiceImplement.delete();
                    break;
                case 4:
                    System.exit(4);
            }
        }
    }
}
