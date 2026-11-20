public class TaskOne {
    public static void main(String[] args){
        int[] num = {0, 23, -45, 0, -12, 0, 465, 432, 0, -90};
        int pos = 0;
        int neg = 0;
        int zero = 0;
        for (int n : num){
            System.out.print(n + " ");
            if (n == 0)
                zero++;
            else if (n > 0)
                pos++;
            else
                neg++;
        }
        System.out.println("\nZero: " + zero);
        System.out.println("Negative: " + neg);
        System.out.println("Positive: " + pos);
    }
}