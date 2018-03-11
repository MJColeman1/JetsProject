## Jets Project

### Week 2 Homework for Skill Distillery

#### Description 

The objective of this project is to create an application that contains a fleet of jets with different attributes and capabilities. The application uses a menu to allow the user to use the jets and access information about them.

#### How To Run This Project

To run this project, a user is presented with a menu of options to choose from. The user has to simply select a numerical option (1-7) or press "8" to quit. If the user selects an option below 1 or above 8, he or she will be prompted that their selection is invalid and to try again. 

#### Technologies Used

* Abstract and Concrete Classes
* Interfaces
* Recursion 
* While Loops
* For Loops
* If Statements
* Casting Data Types
* Class Comparisons
* Encapsulation
* Class Constructors
* Switch Statements
* Arrays of Objects
* Inheritance 
* Getters and Setters

#### Lessons Learned

Being able to have a method call itself was a valuable asset in my program to allow for continual functionality. I created a method to display the menu to the user, and I was able to have that method invoke itself through recursion. This allows the user to select an option, have the program run the relative code, and display the application's menu again until the user quits the program. This also minimized the redundancy in some of my code. 

Calling methods from other classes was difficult at times. Creating a new instance of a class and using the dot operator to call that class's methods is something I still struggle with at times, syntactically speaking.

Comparing classes within an array of objects to ensure the correct output to the user was another lesson learned. For example, when a user selects the "Load all Cargo Jets" option, the program should only invoke the load cargo method for cargo aircraft. To ensure this functionality, I had to loop through an array of aircraft and compare the class of the object in the current spot of the array to the CargoPlane class and only invoke the load cargo method if the object in the array was an instance of the CargoPlane class. 

Having null values in an array can lead to runtime errors if you don't create appropriate if statements to stop iterating through an array when a null value is found.
