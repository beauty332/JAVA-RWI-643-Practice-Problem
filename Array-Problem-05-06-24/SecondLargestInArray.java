public class SecondLargestInArray {
    public static void main(String[] args) {
        int[] numbers = {45, 86, 63, 29, 57, 90, 83, 39};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number != largest) {
                secondLargest = number;
            }
        }

        System.out.println("The second largest number is: " + secondLargest);
    }
}