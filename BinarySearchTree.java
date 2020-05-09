import java.util.Scanner;

public class BinarySearchTree {
    public static void main(String[] args) {
        int[] data = {1,2,3,4,5,6,7,8,9,10};
        Scanner scan = new Scanner(System.in);
        System.out.print("Cari : ");
        int cari = scan.nextInt();
        scan.close();
        int i = 0;
        int bot = 0;
        int top = data.length;
        int mid = data.length / 2;
        System.out.print("Index : ");

        while (i < data.length) {
            if (mid == top || mid == bot) { // apabila data tidak ditemukan
                System.out.print(-1);
                break;
            } else if (cari == data[mid]) { // apabila data ditemukan maka dia return index
                System.out.print(mid);
                break;
            } else if (cari < data[mid]) {
                top = mid;
                mid = (bot + mid) / 2;
            } else if (cari > data[mid]) {
                bot = mid;
                mid = (mid + top) / 2;
            }
            i++;
        }
    }
}