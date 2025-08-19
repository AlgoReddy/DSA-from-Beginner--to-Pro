package OopsConcepts;

import java.util.Arrays;

public class firstLectures {
    public static void main(String[] args) {
        // store 5 rolls nos
        int[] numbers = new int[5];
        // store 5 names
        String[] names = new String[5];
        System.out.println(names);

        // data of the 5 students {roll no , name , marks }
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];
        Student[] students = new Student[5];

        System.out.println(Arrays.toString(students));

        // just declaring
        Student kunal;
        kunal = new Student();
        kunal.rno = 13;
        kunal.name = "kunal the dev";
        kunal.marks = 90.1f;
        kunal.changeName("animal lover");
        Student random = new Student(kunal);
        System.out.println(kunal.rno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);
        Student random2 = new Student();
        System.out.println(random2.name);

        Student one =new Student();
        Student two = one;
        one.name="something something";
        System.out.println(two.name);

        // System.out.println(kunal.rno); // The local variable kunal may not have been
        // initialized

    }
}

// class is a kind of like our custom datatype in the java
// class -- logical construct
// object -- physical reality // occupying space in memory
class Student {
//by this way you can a constructor using another constructor
Student(){
    //internally : new Student (13, "default person " , 100.0f);
    this(13, "default person " , 100.0f);
}

    // why can't we declare like this
    /*
     * int[] rno = new int[5];
     * String[] name = new String[5];
     * float[] marks = new float[5];
     */
    void greeting() {
        // both are same you can write with or without this
        System.out.println("Hello !  , My Name is " + name);
        System.out.println("Hello !  , My Name is " + this.name);
    }

    void changeName(String newName) {
        this.name = newName;
    }

    // Student() {
    //     this.rno = 13;
    //     this.name = "kunal kushwaha";
    //     this.marks = 88.5f;
    // }

    // we can pass the values through other object
    Student(Student other) {
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }

    // if we are passing the same names that we should like rno=rno .
    // we have to use the this keyword compulsory , if not it won't work
    public Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    // but we can make the same thing happen by using diff arguments names
    public Student(String peru, int kramasankya, float markulu) {
        rno = kramasankya;
        name = peru;
        marks = markulu;
    }




    int rno;
    String name;
    float marks;

}
