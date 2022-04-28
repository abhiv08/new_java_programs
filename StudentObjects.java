
public class StudentObjects {
    private int rollNo;
    private String name;

    static int countStudents; // class variable or static variable or shared variable

    StudentObjects(){
        //initialize data members
    }
    StudentObjects(String nameParam ,int rollNo){  //parameterized contructor or overloaded constructor
        name = nameParam;
        this.rollNo = rollNo;
        countStudents++;
        System.out.println("Student count " +countStudents);
    }

    public String getName(){
        return name;
    }
    public int getRollNo (){
        return rollNo;
    }

    static void displayStaticMembers()
    {
        countStudents=20;

    }
    static
    {
        countStudents=20;


    }


    public static void main(String...args) {
        StudentObjects studentObjects = new StudentObjects();


        StudentObjects studentObj1 = new StudentObjects("Amit",1);
        StudentObjects studentObj2 = new StudentObjects("Akhil",2);
        StudentObjects studentObj3 = new StudentObjects("Akshit",3);

        System.out.println("Student 1 Roll No " +studentObj1.getRollNo());
        System.out.println("Student 1 Name " +studentObj1.getName());

        System.out.println("Student 2 Roll No " +studentObj2.getRollNo());
        System.out.println("Student 2 Name " +studentObj2.getName());

        System.out.println("Student 3 Roll No " +studentObj3.getRollNo());
        System.out.println("Student 3 Name " +studentObj3.getName());


    }
}

