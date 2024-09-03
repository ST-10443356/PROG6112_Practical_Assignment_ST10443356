/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proga1q2;

import java.util.Scanner;


public class ProgA1Q2 {

    public static void taskManagement() {
        
        Scanner input = new Scanner(System.in);
        Task[] tasks = new Task[5]; 
        int taskCount = 0;
        
        while (true) {
        System.out.println("Task Management System");
        System.out.println("1. Add new task");
        System.out.println("2. Display all tasks");
        System.out.println("3. Exit");
        
        System.out.println("Choose an option: ");
        int optionChosen = input.nextInt();
        input.nextLine();
        
        switch (optionChosen) {
            case 1:
                if (taskCount < tasks.length){
                    System.out.print("Enter task description: ");
                        String description = input.nextLine();
                        tasks[taskCount] = new Task(description);
                        taskCount++;
                        System.out.println("Task added: " + description);
                    } else {
                        System.out.println("Task list is full.");
                    }
                
                break;
                case 2:
                    System.out.println("Task List:");
                    for (int i = 0; i < taskCount; i++) {
                        System.out.println("Task " + (i + 1) + ": " + tasks[i].getDescription());
                    }
                    break;
                case 3:
                    System.out.println("Exiting");
                    input.close();
                    return;
                    
                    
            
        }
        
    }
    }
    
    public static void main(String[] args) {
        taskManagement();
    }
    
}
