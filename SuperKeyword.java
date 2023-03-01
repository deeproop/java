public class SuperKeyword {
    public static void main(String[] args) {
        Horse h = new Horse();

        System.out.println(h.color);
    }
}

class Animal {
    String color;
    Animal() {
        System.out.println("animal class constructor called");
    }
}

class Horse extends Animal {
    Horse() {
        super.color = "black";
        System.out.println("Horse class constructor called");
    }
}
