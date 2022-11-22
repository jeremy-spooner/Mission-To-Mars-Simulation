# Mission To Mars Simulation

In this project, I built a (very simple) simulation that will help us with our mission to Mars!
The mission is to send a list of items (Habitats, bunkers, food supplies, and rovers) to Mars. In order to fulfill that
mission I created this simulation to test the financial effectiveness of two different Rockets, the U1 and U2.

## Concepts Used

* Inheritance
* Polymorphism
* Interfaces
* Super Classes
* Static Methods
* Data ingression from txt files

## External Libraries

There are no external libraries needed to run this project.

## Running the Program

To run the project pull down the code to you local machine that has a Java environment set up. You can run it using the
IDE or using the following steps:

* Open a command prompt window and go to the directory where you saved the Java program.
* Type `javac Main.java` and press enter to compile your code. Verify there are no errors.
* Type `java Main` to run the program.
* The results will print in the terminal.

## Example Output
```
Cost of using U1 Rockets: $3600 Million
Cost of using U2 Rockets: $4920 Million
```

## UML Diagram

![\images\SpaceChallengeUML.jpg](\images\SpaceChallengeUML.jpg)

This project was adapted from the free Udacity Course "Object Oriented Programming in Java". The prompt was given
as a final project. All code is implemented by the gitHub owner and the UML diagram was designed by the gitHub owner.
I highly recommend checking out [Udacity](https://www.udacity.com/) if you are looking to pick up a new tech skill. Many
of their courses are free!

## Simulation Details

### U-1

The U-1 Rocket is lightweight, agile and pretty safe, but can only carry a total of 18 tonnes of cargo. It costs $100
Million to build and weighs 10 tonnes. It has a slim chance of crashing while landing but a bigger chance of exploding
when launching, both chances depend on the amount of cargo carried in the rocket.

```
Rocket cost = $100 Million
Rocket weight = 10 Tonnes
Max weight (with cargo) = 18 Tonnes
Chance of launch explosion = 5% * (cargo carried / cargo limit)
Chance of landing crash = 1% * (cargo carried / cargo limit)
```

### U-2

The U2 Rocket heavier than the U-1 but much safer and can carry a lot more cargo; to a total of 29 tonnes. However, it
costs $120 Million to build and weighs 18 tonnes. It has a greater chance of crashing while landing than while
launching, but just like the U-1 both chances depend on the amount of cargo carried.

```
Rocket cost = $120 Million
Rocket weight = 18 Tonnes
Max weight (with cargo) = 29 Tonnes
Chance of launch explosion = 4% * (cargo carried / cargo limit)
Chance of landing crash = 8% * (cargo carried / cargo limit)
```

### The Mission

The mission consists of 2 phases:

#### Phase-1:

This phase is meant to send building equipment and construction material to help build the colony. In the resources tab,
there is a text file that contains the list of all items that we need to send called 'Phase-1.txt'. Each line in
the file contains the item name as well as its weight in Kgs.

#### Phase-2:

This phase is meant to send the colony of humans along with some food resources. In the resources tab, there is a
text file that contains the list of all items that we need to send called 'Phase-2.txt'. Each line in the file also
contains the item name and its weight in Kgs.

