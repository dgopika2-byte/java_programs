import java.util.*;
class student {
    
    private int id;
    private String name;
    private String[] course;
    private int count;
    student(int id,String name,int count){
        this.name=name;
        this.id=id;
        course=new String[count];
        this.count=0;
    }
    void register(String course){
        this.course[count]=course;
        count++;
    }
    void display(){
        System.out.println("Student name: "+name);
        System.out.println("Student ID: "+id);
        System.out.println("regiatered course:-");
        for(int i=0;i<count;i++){
            System.out.println(course[i]);
        }
    }

    
}
public class StudentCourse{
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name");
        String name=sc.nextLine();
        System.out.println("Enter ID");
        int id=sc.nextInt();
        System.out.println("Enter number of course");
        int num=sc.nextInt();    
        student s=new student(id,name,num);
        System.out.println("Enter courses");
        for(int i=0;i<num;i++){
            String course=sc.nextLine();
            s.register(course);
        }
        s.display();
        sc.close();
    }

}
