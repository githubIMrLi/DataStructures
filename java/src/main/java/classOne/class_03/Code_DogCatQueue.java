package classOne.class_03;

import java.util.LinkedList;
import java.util.Queue;

public class Code_DogCatQueue {
    public static class Pet {
        private String type;

        public Pet(String type) {
            this.type = type;
        }

        public String getPetType() {
            return this.type;
        }
    }

    public static class Dog extends Pet {
        public Dog() {
            super("dog");
        }
    }

    public static class Cat extends Pet {
        public Cat() {
            super("cat");
        }
    }

    public static class PetEnter {
        private Pet pet;
        private long count;

        public PetEnter(Pet pet, long count) {
            this.pet = pet;
            this.count = count;
        }

        public Pet getPet() {
            return pet;
        }

        public long getCount() {
            return count;
        }

        public String getEnterType() {
            return pet.getPetType();
        }
    }

    public static class CatDogQueue {
        private Queue<PetEnter> catQ;
        private Queue<PetEnter> dogQ;
        private long count;

        public CatDogQueue() {
            this.catQ = new LinkedList<PetEnter>();
            this.dogQ = new LinkedList<PetEnter>();
            this.count = 0;
        }

        public void add(Pet pet){
            if (pet.getPetType().equals("dog")){
                dogQ.add(new PetEnter(pet,count++));
            }else if (pet.getPetType().equals("cat")){
                catQ.add(new PetEnter(pet,count++));
            }else {
                throw new RuntimeException("err, not dog or cat");
            }
        }

        public Pet pollAll() {
            if (!dogQ.isEmpty() && catQ.isEmpty()) {
                return dogQ.poll().getPet();
            } else if (dogQ.isEmpty() && !catQ.isEmpty()) {
                return catQ.poll().getPet();
            } else if (!dogQ.isEmpty() && !catQ.isEmpty()) {
                if (dogQ.peek().getCount() > catQ.peek().getCount()) {
                    return catQ.poll().getPet();
                } else {
                    return dogQ.poll().getPet();
                }
            } else {
                throw new RuntimeException("err, queue is empty!");
            }
        }

        public Cat pollCat() {
            if (catQ.isEmpty()) {
                throw new RuntimeException("Cat queue is empty!");
            } else {
                return (Cat) this.catQ.poll().getPet();
            }
        }

        public Dog pollDog() {
            if (dogQ.isEmpty()) {
                throw new RuntimeException("Dog queue is empty!");
            } else {
                return (Dog) this.dogQ.poll().getPet();
            }
        }

        public boolean isEmpty() {
            return catQ.isEmpty() && dogQ.isEmpty();
        }

        public boolean isCatEmpty() {
            return catQ.isEmpty();
        }

        public boolean isDogEmpty() {
            return dogQ.isEmpty();
        }
    }

    public static void main(String[] args) {
        CatDogQueue test = new CatDogQueue();

        Pet dog1 = new Dog();
        Pet cat1 = new Cat();
        Pet dog2 = new Dog();
        Pet cat2 = new Cat();
        Pet dog3 = new Dog();
        Pet cat3 = new Cat();

        test.add(dog1);
        test.add(cat1);

        System.out.println(test.pollAll().getPetType());
        System.out.println(test.isCatEmpty());
        System.out.println(test.isDogEmpty());

        System.out.println(test.pollAll().getPetType());
    }
}
