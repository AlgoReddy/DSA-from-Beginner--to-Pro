package OopsConcepts.packages;


// when we are on the same folder level we don't need to import the package
public class Ex {
    public static void main(String[] args) {
        sapien yash = new sapien("yeswanth", 23, 90000, false);
        sapien ram = new sapien("ram", 29, 80000, false);
        sapien sai = new sapien("ram", 29, 80000, false);
        System.out.println(yash.population);
        System.out.println(ram.population);
        Ex fun = new Ex();
        fun.fun2();
        Main random2 = new Main();
        random2.greeting();
    }

    static void fun() {
        // greeting(); here you cannot use the function or method for non static things
        // in java without creating a object for it
        /*
         * but you can create the objects through setting a instance like a object to it
         */

        // you cannot access non static stuff without referecing their instances in a
        // static context
        Ex random = new Ex();

        random.greeting();

    }
    // here we are calling nonstatic function in another function to use that you
    // can create the fun2 obje

    void fun2() {
        greeting();
    }

    void greeting() {
        System.out.println("hello this is yash ");
    }
}
