public class exercise2 {

    int sum = 0;
    int count = 0;

    double avg;


    public int countElements(int[] listOfNumbetrs) {
        for (int i = 0; i < listOfNumbetrs.length; i++) {
            count++;
        }
        return count;
    }

    public double average() {
        avg = sum / count;
        return avg;
    }

    public int sum(int[] listOfNumbers) {
        for (int i = 0; i < listOfNumbers.length; i++) {
            sum = sum + listOfNumbers[i];
        }
        return sum;
    }



}
