package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        if (printToInclusive > 0){
            System.out.println(2);
            System.out.println(3);
            System.out.println(5);
            System.out.println(7);
            int counter = 8;
            while (counter <= printToInclusive){
                if (counter%2 != 0){
                    if (counter%3 !=0){
                        if (counter%5 !=0){
                            if(counter%7 != 0){
                                System.out.println(counter);
                            }
                        }
                    }
                }
                counter++;

            }
        }

    }
    public static void main (String [] args){
        PrimeNumbers primeNumbers = new PrimeNumbers();
        int number = 65554133;
        primeNumbers.printPrimeNumbers(number);
    }
}
