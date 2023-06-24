package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int counter = 0;
        while (counter <= printTillInclusive) {
            System.out.println(counter++);
            ++counter;
        }
    }
    public static void main (String [] args){
        EvenNumbersPrinter evenNumbersPrinter = new EvenNumbersPrinter();
        int number = 120;
        evenNumbersPrinter.printEvenNumbers(number);
    }
}
