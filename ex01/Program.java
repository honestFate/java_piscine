package ex01;

public class Program {

    public static void main(String[] args) {
        User john = new User();
        User mike = new User();
        User bobi = new User();

        john.setName("John");
        john.setBalance(111);
        john.printState();

        mike.setName("Mike");
        mike.setBalance(222);
        mike.printState();

        bobi.setName("Bobi");
        bobi.setBalance(333);
        bobi.printState();
    }
}
