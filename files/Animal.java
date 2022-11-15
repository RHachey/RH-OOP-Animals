public class Animal {

    private String name;
    private double weight;
    private String species;
    private int numLegs;
    private double unitPrice;
    private String sku;
    private int age;
    private boolean isDead = false;
    private int currentAge;

    public Animal (String n, double w, String s, int l, double u, String k, int a) {

        this.name = n;
        this.weight = w;
        this.species = s;
        this.numLegs = l;
        this.unitPrice = u;
        this.sku = k; 
        this.age = a;
        this.currentAge = a;

    }

    public boolean isDead () {

        return isDead;

    }

    public String name() {

        return name;

    }

    public void deathTracker(int increase) {

        isDead = Math.random() * 100 > (100 - (this.age + increase));

        if (isDead) {

            System.out.println("RIP " + this.name + ". They were " + String.valueOf(this.age + increase));

        }

    }

    public int age(int increase) {

        if (increase - (currentAge - age) != 0) {

            this.deathTracker(increase);
            currentAge++;

        }

        return this.age + increase;

    }

    public void hasBirthday() {

        this.age++;

    }

    public void name (String name) {

        this.name = name;

    }

    public String species() {

        return species;

    }

    public String toString() {

        return name + " " + weight;

    }

    public double weight() {

        return this.weight;

    }

    public int numLegs() {

        return numLegs;

    }

    public double unitPrice() {

        return unitPrice;

    }

    public String sku() {

        return sku;

    }

}  
