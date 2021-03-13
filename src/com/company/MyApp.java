package com.company;

import com.company.controllers.StoneController;
import com.company.repositories.StoneRepository;
import com.company.repositories.interfaces.IStoneRepository;
import java.util.Scanner; //It declares a Java class to use in the code below the import statement

public class MyApp {
    private final StoneController controller;
    private final Scanner scanner;

    public MyApp(IStoneRepository stoneRepository) {
        controller = new StoneController(stoneRepository);
        scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println();
            System.out.println("Select option:");
            System.out.println("1. Get precious stones");
            System.out.println("2. Select stone to calculate weight and cost of necklace1");
            System.out.println("0. Exit");
            System.out.println(); //The text that comes out when you activate the compiler
            try {
                System.out.print("Enter option (1-2): ");
                int option = scanner.nextInt();
                if (option == 1) {
                    getAllPreciousMenu();
                } else if (option == 2) {
                     SelectStoneForNecklace();

                } else {
                    break; //Sends us to the method depending on what the user chooses
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                scanner.next(); // to ignore incorrect input
            }

            System.out.println("______________________________");


        }
    }
    public void getAllPreciousMenu() {
        String response = controller.getAllPrecious();
        System.out.println(response); //Sent us to a method that calls all students
    }
    public void SelectStoneForNecklace() {
        String response = controller.getAllPrecious();
        System.out.println(response); //Sent us to a method that calls all students
    }




}