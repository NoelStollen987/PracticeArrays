public class TaskFour {
    public static void main(String[] args) {
        int[] num = {234, 456, 675, 3545, 46, 74324, 352};
        int[] renum = new int[num.length];
        System.out.print("Array: ");
        for (int n : num){
            System.out.print(n + " ");
        }
        System.out.print("\nReversed: ");
        for (int i = num.length - 1; i >= 0; i--){
            System.out.print(num[i] + " ");
        }
    }
}