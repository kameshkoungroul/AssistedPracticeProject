package assistedPracticeProject;

interface Animal {
    public void eat();
}

class Dog implements Animal {
    public void eat() {
        System.out.println("Dog is barking");
    }
}

class Cat implements Animal {
    public void eat() {
        System.out.println("Cat is sleeping");
    }
}

class CatDog implements Animal {
    Animal dog = new Dog();
    Animal cat = new Cat();
    
    public void eat() {
        dog.eat(); 
        cat.eat(); 
    }
}

public class Main {
    public static void main(String[] args) {
        CatDog cd = new CatDog();
        cd.eat(); 
    }
}

