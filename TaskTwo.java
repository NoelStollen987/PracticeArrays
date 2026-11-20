public class TaskTwo {
    public static void main(String[] args){
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8};
        int max = num[0];
        int imax = 0;
        int min = num[0];
        int imin = 0;
        int i = 0;
        System.out.print("Array: ");
        for (int n : num){
            System.out.print(n + " ");
            if (n > max){
                max = n;
                imax = i;
            }
            if (n < min){
                min = n;
                imin = i;
            }
            i++;
        }
        System.out.println("\nMax: " + max + " - index: " + imax);
        System.out.println("Min: " + min + " - index: " + imin);

    }
}