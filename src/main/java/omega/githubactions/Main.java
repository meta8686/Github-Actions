package omega.githubactions;

public class Main {
    public static void main(String[] args) {
        System.out.println("HTesting github actions");
        int sum = addTwoNumbers(2, 4);
        System.out.println("Sum is : "+sum);
    }

    public static int addTwoNumbers(int a ,int b){
        return a+b;
    }
}