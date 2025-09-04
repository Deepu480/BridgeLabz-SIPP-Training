package Week1_day1;

class Pet {
 String name;
 int age;3
 String breed;
 
 public Pet(String name, int age, String breed) {
     this.name = name;
     this.age = age;
     this.breed = breed;
 }
 public void displayInfo() {
     System.out.println("Name: " + name + ", Age: " + age + ", Breed: " + breed);
 }
}
class Dog extends Pet {
 boolean isTrained;

 public Dog(String name, int age, String breed, boolean isTrained) {
     super(name, age, breed);  
     this.isTrained = isTrained;
 }
 public void displayInfo() {
     super.displayInfo();
     System.out.println("Trained: " + (isTrained ? "Yes" : "No"));
 }
}
class Cat extends Pet {
 boolean isIndoor;

 public Cat(String name, int age, String breed, boolean isIndoor) {
     super(name, age, breed);
     this.isIndoor = isIndoor;
 }
 public void displayInfo() {
     super.displayInfo();
     System.out.println("Indoor Cat: " + (isIndoor ? "Yes" : "No"));
 }
}
class Bird extends Pet {
 boolean canTalk;

 public Bird(String name, int age, String breed, boolean canTalk) {
     super(name, age, breed);
     this.canTalk = canTalk;
 }
 public void displayInfo() {
     super.displayInfo();
     System.out.println("Can Talk: " + (canTalk ? "Yes" : "No"));
 }
}
public class PetAdoptionApp {
 public static void main(String[] args) {
     Dog dog = new Dog("Buddy", 3, "Labrador", true);
     Cat cat = new Cat("Whiskers", 2, "Persian", true);
     Bird bird = new Bird("Mithu", 1, "Parrot", true);

     System.out.println("🐶 Dog Details:");
     dog.displayInfo();
     System.out.println("\n🐱 Cat Details:");
     cat.displayInfo();
     System.out.println("\n🐦 Bird Details:");
     bird.displayInfo();
 }
}
