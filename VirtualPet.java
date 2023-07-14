public class VirtualPet {
    private String name;
    private int hunger;
    private int thirst;
    private int affection;
    private int sleepyness;
    private double age;

    public VirtualPet(double age, int hunger, int thirst, int affection, int sleepyness, String name) {
        this.hunger = 0;
        this.thirst = 0;
        this.affection = 100;
        this.sleepyness = 0;
        this.name = name;
        this.age = 1;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHunger() {
        return this.hunger;
    }

    public double getAge() {
        return this.age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getThirst() {
        return this.thirst;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public int getAffection() {
        return this.affection;
    }

    public void setAffection(int affection) {
        this.affection = affection;
    }

    public int getSleepyness() {
        return this.sleepyness;
    }

    public void setSleepyness(int sleepyness) {
        this.sleepyness = sleepyness;
    }

     // I did Math.floor() to avoid decimals from showing on status and have the age only affect the tick(time) function every whole year

    public void time() {
        age += 0.5;
        hunger += (5 + Math.floor(age));
        if (hunger > 100) {
            hunger = 100;
        }
        thirst += (5 + Math.floor(age));
        if (thirst > 100) {
            thirst = 100;
        }
        sleepyness += (5 + Math.floor(age));
        if (sleepyness > 100) {
            sleepyness = 100;
        }

        affection -= (5 + Math.floor(age));
        if (affection < 0) {
            affection = 0;
        }
    }

    public void feed() {
        hunger -= 20;
        if (hunger < 0) {
            hunger = 0;
        }
        affection += 15;
        if (affection > 100) {
            affection = 100;
        }
        sleepyness += 5;
        if (sleepyness > 100) {
            sleepyness = 100;
        }
    }

    public void hydrate() {
        thirst -= 20;
        if (thirst < 0) {
            thirst = 0;
        }
        sleepyness -= 5;
        if (sleepyness < 0) {
            sleepyness = 0;
        }

    }

    public void sleep() {
        sleepyness -= 20;
        if (sleepyness < 0) {
            sleepyness = 0;
        }
    }

    public void play() {
        affection += 30;
        if (affection > 100) {
            affection = 100;
        }
        thirst += 5;
        if (thirst > 100) {
            thirst = 100;
        }
        hunger += 5;
        if (hunger > 100) {
            hunger = 100;
        }
        sleepyness += 5;
        if (sleepyness > 100) {
            sleepyness = 100;
        }
    }

}