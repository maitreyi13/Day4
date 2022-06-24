public class UC4_EmpWage {
    public static final int attpart = 1;
    public static final int attfull = 2;
    public static final int wph = 20;
    public static void main(String[] args) {
        int emphrs = 0;
        int empwage = 0;
        int a = (int) Math.floor(Math.random() * 10) % 3;
        switch (a){
            case attfull:
                emphrs = 8;
                break;
            case attpart:
                emphrs = 4;
                break;
            default:
                emphrs = 0;
        }
        empwage = emphrs * wph;
        System.out.println("Daily wage for an employee : "+empwage);
    }
}
