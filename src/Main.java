public class Main {
    public static void main(String[] args) {

        int listOfNumbers[] = {112,121,33,1,2,34};
        exercise1 ex1 = new exercise1(listOfNumbers);

        exercise2 ex2 = new exercise2();

        System.out.println("Suma: " + ex2.sum(listOfNumbers));

        System.out.println("Numarul de  elemente: " + ex2.countElements(listOfNumbers));

        System.out.println("Media: " + ex2.average());



    }
}
