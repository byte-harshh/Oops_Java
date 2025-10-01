import java.util.*;
import java.lang.*;
class StudentDetails{
    String name;
    int ID;
    String Grade;
    public StudentDetails(String name,int ID,String Grade){
        this.name = name;
        this.ID = ID;
        this.Grade = Grade;
    }

    public String getGrade() {
        return Grade;
    }

    public String getName() {
        return name;
    }
}

public class Student {
    public static void main(String[] args) {
       List <StudentDetails> L = new ArrayList(new MyComp());
       StudentDetails S1 = new StudentDetails("Leo   ",81,"A");
       StudentDetails S2 = new StudentDetails("Raja  ",12,"C");
       StudentDetails S3 = new StudentDetails("Gabbar",56,"B");
       StudentDetails S4 = new StudentDetails("Coolie",10,"F");
       StudentDetails S5 = new StudentDetails("War   ",23,"E");
        L.add(S1);
        L.add(S2);
        L.add(S3);
        L.add(S4);
        L.add(S5);
        //Collections.sort(L, (s1, s2) -> s1.ID - s2.ID);
        //Collections.sort(L,(StudentDetails s1, StudentDetails s2) -> s1.getGrade().compareTo(s2.getGrade()));
       // Collections.sort(L,(StudentDetails s1, StudentDetails s2) -> s1.getName().compareTo(s2.getName()));
        //Collections.sort(L,(StudentDetails s1, StudentDetails s2) -> s2.getName().compareTo(s1.getName()));
        class MyComp implements Comparator{
            public int compare(Object s1,Object s2){
                return s1.compareTo(s2);
            }
        }
        Iterator itr = L.iterator();
        while(itr.hasNext()){
            StudentDetails s = (StudentDetails)itr.next();
            System.out.println(s.ID+"  "+s.name+"  "+s.getGrade());
        }
    }
}
