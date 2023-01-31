import java.util.Scanner;
class fourVariables{
public static void main(){
Scanner sc = new Scanner(System.in);
    String name;
   // String m;
    int dayOfBirth;
    int age;
    double salary;
    //char letter;
    System.out.println("introduce your name");
    name=sc.next();
    System.out.println("Introduce your year of birth");
    dayOfBirth=sc.nextInt();
    age=2023-dayOfBirth;
    System.out.println("Introduce your Salary");
    salary=sc.nextDouble();
    //System.out.println("Introduce a letter");
    //m=sc.next();
    System.out.println("your name is= "+name);
    System.out.println("yuo are= "+age);
    System.out.println("your salary"+salary);
    //System.out.println("your letter is= "+m);
    
    
}
}

