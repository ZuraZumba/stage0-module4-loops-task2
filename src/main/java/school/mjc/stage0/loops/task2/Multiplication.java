package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int counter = 0;
        if (multiplyByAndToInclusive == 0){
//            System.out.println();
        }
        if (multiplyByAndToInclusive > 0 ) {
            while (counter <= multiplyByAndToInclusive) {

                System.out.println(multiplyByAndToInclusive * counter);
                counter++;
            }
        }
        else if (multiplyByAndToInclusive < 0){
            int positive = -1 * multiplyByAndToInclusive;
            while (counter <= positive){
                System.out.println(multiplyByAndToInclusive * counter);
                counter ++;
            }

        }

        }

    public static void main(String [] args){
        Multiplication multiplication = new Multiplication();
        int number = 0;
        multiplication.printMultiplied(number);
    }
}
