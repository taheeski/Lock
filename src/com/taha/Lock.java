package com.taha;

/**
*@author Taha Akbar
*@date: 3/21/2024
*program that creates a lock
*/

public class Lock {
   // Private instance variables
   private String combination;
   private int attempts;
   private boolean unlocked;
   // Default constructor
   public Lock() {
       this.combination = "0000";
       this.attempts = 0;
       this.unlocked = false;
   }
   // Overloaded constructor
   public Lock(String combination) {
       this.combination = combination;
       this.attempts = 0;
       this.unlocked = false;
   }
   // Accessor method
   public boolean isUnlocked() {
       return unlocked;
   }
   // Other methods
   public void attemptUnlock(String combo) {
       if(combo.equals(combination)) {
           System.out.println("Click.");
           this.unlocked = true;
           this.attempts = 0; // Reset incorrect attempts
       } else {
           this.attempts++;
           if(this.attempts >= 3) {
               System.out.println("Alarm!");
           }
       }
   }
// processing
   public boolean changeCombo(String newCombo) {
       if(this.unlocked) {
           this.combination = newCombo;
           this.unlocked = false; // Lock the lock
           return true;
       } else {
           return false;
       }
   }
   public void lock() {
       this.unlocked = false;
   }
}

