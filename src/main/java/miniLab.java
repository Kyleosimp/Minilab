public class miniLab {
    public static void main(String[] args) {
        char grade = 'B';
        switch (grade){
            case 'A':
                System.out.println("You have an A. You are performing well.");
                break;
            case 'B':
                System.out.println("You have a B. Keep it up.");
                break;
            case 'C':
                System.out.println("You have a C. You can do better.");
                break;
            case 'D':
                System.out.println("You have a D. You are barely passing.");
                break;
            case 'F':
                System.out.println("You have an F. You have failed.");
                break;
            default:
                System.out.println("Grade input error");


        }
    }
}
