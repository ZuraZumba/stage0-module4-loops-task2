package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power < 0) {
            System.out.println("too much power");
        }
        int counter = 0;
        int result = 1;
        while (counter <= power){
            System.out.println(result);
           result *= 2;
            counter ++;
        }
    }

    public static void main(String[] args) {
       PowerOfTwo powerOfTwo = new PowerOfTwo();
        int power = 8;
        powerOfTwo.printPower(power);
    }
}
