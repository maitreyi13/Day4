import java.lang.Math;
public class UC1_EmpWage {
    public static void main(String[] args){
        int attfull = 1;
        // generate random number
        double a = Math.floor(Math.random() * 10) % 2;

        if(a == attfull){
            System.out.println("Employee is Present");
        }else {
            System.out.println("Employee is Absent");
        }
    }
}

