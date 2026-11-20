public class TaskThree {
    public static void main(String[] args) {
        int[] num = {23, 34, 46, 56, 67, 50};
        int aver = 0;
        int abaver = 0;
        System.out.print("Array: ");
        for (int n : num){
            System.out.print(n + " ");
            aver += n;
        }
        System.out.println("\nAverage: " + aver/6);
        for (int i : num){
            if (i > aver/6)
                abaver++;
        }
        System.out.println("Numbers above average: " + abaver);
    }
}