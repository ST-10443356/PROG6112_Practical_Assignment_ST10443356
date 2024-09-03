/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proga1q2;

/**
 *
 * @author Sihle
 */
class Task {
    private String description;
    private boolean isCompleted;

    // Constructor
    public Task(String description) {
        this.description = description;
        this.isCompleted = false; // By default, the task is not completed
    }

    // Method to mark the task as completed
    public void markAsCompleted() {
        this.isCompleted = true;
    }

    // Method to get the task description
    public String getDescription() {
        return description;
    }

    // Method to check if the task is completed
    public boolean isCompleted() {
        return isCompleted;
    }
}
