public Class Product{

public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5};
    int product = 1;
    for (int number : numbers) {
        product *= number;
    }
    System.out.println("Product of all numbers: " + product);
    
}
        }