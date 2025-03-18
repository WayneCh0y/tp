package seedu.duke.ui;

import java.util.Scanner;


public class Ui {
    private final Scanner scanner;

    public Ui() {
        this.scanner = new Scanner(System.in);
    }

    public String readCommand() {
        if (scanner.hasNextLine()) {
            return scanner.nextLine();
        } else {
            System.out.println("No input detected. Exiting...");
            System.exit(0);
            return ""; // Dummy return to satisfy compiler
        }
    }

    public void printWelcomeMessage() {
        printSeparator();
        System.out.println("Welcome to Lebook, your personal book management system!");
        printSeparator();
    }

    public void printExitMessage() {
        printSeparator();
        System.out.println("Goodbye! See you again.");
        printSeparator();
    }

    public void printSuccess(String message) {
        printSeparator();
        System.out.println("[SUCCESS] " + message);
        printSeparator();
    }

    public void printError(String message) {
        printSeparator();
        System.out.println("[ERROR] " + message);
        printSeparator();
    }

    public void printWithSeparator(String message) {
        printSeparator();
        System.out.println(message);
        printSeparator();
    }

    public void printSeparator() {
        System.out.println("========================================");
    }
}

