Java is a OOP language.
Java is platform independent: "write once run anywhere"
Java Source Code - > Compile(JAVAC) - > Byte Code(.class)
JVM - JRE - JDK
    JVM: Java Virtual Machine. jvm runs java btye code
    JRE: Java Runtime Environment. jvm + libraries
    JDK: Java Development Kit. jre + development tools
         jdk is needed to compile Java Source Code. .java to .class file
How many types of memory areas are allocated by JVM?
    Stack: Local Variables, Methods
    Heap: Obejects
What is Garbage Collection?
    is the process of looking at heap memory, identifying which objects are in use and which are not, and deleting the unused objects.
public static void main(String[] args)
    public:access modifier,which is used to specify who can access this method.
    static:keyword which identifies it is a class based. Can be accessed w/o creating the instance of a class. 
    void: return type of method. void defines the method will not return any value.
    main:name of the method which is searched by JVM as a starting point for an application.
    String args[]:it is the parameter passed to the main method.
Data Types in JAVA:
    Primitive Data Types:byte,short,int,long,float,double,char,boolean
    Reference Data Type:classes,interfaces,arrays,strings
Operators:
    Arithmetic: +,-,/,*,%
    Unary Operators: +,-,++,--,!
    Relational Operators: >,>=,<,<=,==,!=
    Logical Operators:&&,&,||,|,^
    Assignment Operators: =,+=,,-=,*=,/=,%=
Casting: Converting from one type to another
         Implicit Casting: When we assign value of a smaller data type to a bigger data type. 
         (byte -> short - > int - > long - > float - > double)
         int i = 100;
         long l = i;
         Explicit Casting: When we assign value of larger data type to a smaller data type.
         (double -> float - > long - > int - > short - > byte)
         double d = 100.04;
         long l = (long)d;
         int i = (int)l;
Control Statements:
    Selection Statements(if,if-else,if-else if-else,switch)
    if(condition){
        statement;
    }else if(condition){
        statement;
    }else{
        statement;
    }
    switch(expression){
        case constant1:
            statement;
            break;
        case constant2:
            statement;
            break;
        default:
            statement;
            break; 
    }
    Looping Statements: for, while,do-while
        for(int i=0;i<5;i++){
            statement;
        }
        while(condition){
            statement;
        }
        do{
            statement;
        }while(condition)
    Branching Statements:break,continue
        break: breaks the loop and continues executing the code after the loop(if any)
            for(i=0;i>10;i++){
                if(i==3){
                    break;
                }
                statement;
            }
        continue: breaks one iteration(in the loop), if a specified condition ocuurs, and continues with the next iteration in the loop.
            for(i=0;i>10;i++){
                if(i==3){
                    continue;
                }
                statement;
            }
Methods: A method is a collection of statements that perform some specific task. Method allow us to reuse the code w/o retyping the code.
    public int calculateSum(int a , int b){
        int c = a+b;
        return c;
    }
    public: Accessible from everywhere in the program
    private: Accessible only within the class in which they are declared
    protected: Accesible within same package, or sub classes in different package
    default:Accesible only within the same package.
Method Overloading: Different methods with the same name, but different signatures(sigantures can differ by number of input parameters or type of input parameters or both). Compile-time polymorphism
    
    public int sum(int x,int y){
        retun x+y;
    }
    public int sum(int x,int y,int z){
        retun x+y+z;
    }
    
    public int sum(double x,int double){
        retun x+y;
    }
    sum(10,20);
    sum(10.5,20,5);
    sum(10,20,30);
Parsing Values From String:
    String number ="2018";
    int number = Integer.parseInt(number);
    double number = Double.parseDouble(number);
Wrapper Classes: Every primitive data type has a class dedicated to it.Thease are known wrapper classes because they "wrap" the primitive data type into an object of that class.Wrapper classes in Java provides the mechanism to convert primitive into object and object into primitive,
    autoboxing: primitive  - > object
    unboxing: object - > primitive
    int n =12;
    Integer num=n; //autoboxing
    int j =num; //unboxing
Reading User input
    Scanner sn = new Scanner(System.in);
    System.out.println("enter you name");
    String input = sn.nextLine();
    int input  = sn.nextInt();
Arrays:
    int[] scores = new int[4];
    String[] names = new String[3];
    scores[0]=50;
    System.out,println(scores[0]); //50
    scores.length; //4
    int[] scores = {50,70,90};
For-Each
    for(int x : scores){
        Systemout.println(x);
    }
===========================================
Find and print 5 even numbers between 10 and 100
Create a method called isEvenNumber that takes a parameter of type int
Its purpose is to determine if the argument passed to the method is an even number or not.
Return true if an even number, otherwise return false;
===========================================
Task:
-Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
-Before the user enters the number, print the message "Enter number"
-If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
Hint:
-Use an endless while loop.
===========================================
Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int with the name kiloBytes
The method should not return anything(void) and it needs to calculate the megabytes and remaining kilobytes from the kilobytes parameter.
Then it needs to print a message in the format "XX KB = YY MB and ZZ KB". XX represents the original value kiloBytes. YY represents the calculated megabytes. ZZ represents the calculated remaining kilobytes.
If the parameter kiloBytes is < 0 then print "Invalid Value"
Sample Output:
printMegaBytesAndKiloBytes(2050) = > "2050 KB = 2 MB and 2KB"
Tip:
1 MB = 1024 KB
===================================
Create a method called getDurationString with two parameters, first parameter minutes and 2nd parameter seconds.
You should validate that the first parameter minutes is >= 0.
You should validate that the 2nd parameter seconds is >= 0 and <= 59.
The method should return "Invalid value" in the method if either of the above are not true.
If the parameters are valid then calculate how many hours minutes and seconds equal the minutes and seconds passed to this method and return that value as string in format XXh YYm ZZs where XX represents a number of hours, YY the minutes and ZZ the seconds.
Create a 2nd method of the same name but with only one parameter seconds.
Validate that it is >= 0, and return "Invalid value" if it is not true.
If it is valid, then calculate how many minutes are in the seconds value and then call the other overloaded method passing the correct minutes and seconds calculated so that it can calculate correctly.
Call both methods to print values to the console.
Tips:
    Use int or long for your number data types is probably a good idea.
    1 minute = 60 seconds and 1 hour = 60 minutes or 3600 seconds.
    Methods should be static as we have used previously.
===================================
Static keyword means that the variable or method belongs to class and shared between all instances.
We can call static members by using classname.
Static methods can not call Non-Static members.
===================================
String Pool
===================================
Class: Template/Blueprint
Constructor: A constructor initializes an object when it is created.
    2 typpes of constructor: No argument(Default), Patameterized Constructor
    Constructor(S) of a class must have same name as the class name
    Constructor can not be final,static
    Constructors do not have any return type
    Constructor is called only once at the time of Object creation while methods can be called any numbers of time.
Constructor Chaining: is the process of calling one constructor from another constructor.
    Within same class: done by using this()
    From Base class: done by using super()
    this(),super() expressions should always be the first line of constructor.
===================================
OOP
Encapsulation: Data Hiding
    Declare variables of a class as private
    Provide getter and setter methods
Inheritance: Process where one class inherits the properties(method and fields) of another.
   extends keyword used to inherit the properties of a class
Abstraction: We can create a base/blueprint for our code and let sub classes implement as needed according to requirements.
2 ways to achieve abstraction:  
    1-Abstract classes
    2-Interfaces
Differences:
1.Type of Methods: Interface can have only abstract methods. Abstract class can have abstract and n on-abstract methods.
2.Final Variables: Variables declared in interface are by default final. An abstract class may contain non-final variables.
3.Type of variables: Abstract class can have final,non-final,static,non-static variables. Interface has only static and final variables.
4.Inheritance vs Abstraction: A interface can be implemented using "implements" and abstract class can be extended using "extends"
5. Multiple Implementation: An interface can extend another interface only, an abstract class can extend another class and implement multiple interfaces.
6. Accessibility of Data Members: Members of interface are public by default. An abstract class can have class members like private,protected,etc...
Overloading vs Overriding
1. Overloading same method name but different parameters
   Overriding  same method name and same parameters
2.Overloding return type can be different.
  Overriding same or return type or sub type (Covariant return type)
3.Overloading can overlaod static methods
  Overriding can not override static methods
4.Overloading can be done in same class, or to inherited methods.
  Overriding can only be done to ineherited methods.
5.Private methods can not be overriden.
6.Final methods can be overloaded in same class, but can not be overriden in sub class.
Polymorphism: ability of an object to take many forms. The most common use of poly, occurs when a parent class reference is used to refer to a child class object.
    Webdriver driver = new chromeDriver;
    driver = new FirefoxDriver();
