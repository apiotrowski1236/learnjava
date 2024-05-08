import java.util.Random;

public class OutputGenerator {

    public OutputGenerator() {}

    public String generateARandomOutHello() {
        int randomNumber = generateRandomNumber();
        //TODO: Replace this with an enhanced switch statement.
        switch(randomNumber) {
            case 0:
                return "HELLO WORLD!!!" ;
            case 1:
                return "Hi world";
            case 2:
                return "Howdy world";
            case 3:
                return "Hey world";
            case 4:
                return "Hola world";
            default:
                return "Unexpected result!!!! This was coded incorrectly. :-) ";
        }
    }

    /**
     * Generates either 0 or  a random positive whole number.
     * Since our upper-bound is 5, our number will be either 0, 1, 2, 3, or 4.
     * Check out <a href="https://docs.oracle.com/javase/8/docs/api/java/util/Random.html">...</a> for more info!
     */
    private int generateRandomNumber() {
        Random random = new Random();
        int upperbound = 5;
        //TODO: If you want, you can combine the next two lines into return random.nextInt(upperbound)
        int randomNum = random.nextInt(upperbound);
        return randomNum;
    }
}
