
## Classes and Responsibilities

### **AbstractFactory.java**
An abstract class defining methods to create food and drink objects.

### **ChineseRestaurantFactory.java**
Concrete factory that creates Chinese food (`Noodle`) and drink (`Tea`).

### **ItalianRestaurantFactory.java**
Concrete factory that creates Italian food (`Pizza`) and drink (`Wine`).

### **Product Package (Food & Drinks)**
- `Food.java`: Interface for food items.
- `Drink.java`: Interface for drink items.
- `Noodle.java`: Implements `Food`, representing a Chinese dish.
- `Pizza.java`: Implements `Food`, representing an Italian dish.
- `Tea.java`: Implements `Drink`, representing a Chinese drink.
- `Wine.java`: Implements `Drink`, representing an Italian drink.

### **Main.java**
Tests the factory implementations by creating instances of food and drink for both Chinese and Italian restaurants.

## How to Run
1. Compile all Java files:
   ```sh
   javac -d out src/com/restaurant/**/*.java
