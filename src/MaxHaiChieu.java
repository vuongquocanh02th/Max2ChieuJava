import java.util.Scanner;

public class MaxHaiChieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Buoc 1: Tao ma tran
        System.out.print("Nhap so dong cua ma tran: ");
        int rows = sc.nextInt();
        System.out.print("Nhap so cot cua ma tran: ");
        int cols = sc.nextInt();

        //Khoi tao ma tran
        double[][] matrix = new double[rows][cols];

        //Khoi tao bien de chua gia tri lon nhat va toa do cua phan tu lon nhat
        double maxValue = Double.MIN_VALUE; //Gia tri nho nhat co the co cua double
        int maxRow = 0, maxCol = 0;

        //Buoc 2: Nhap cac phan tu cho ma tran tu nguoi dung
        System.out.println("Nhap cac phan tu cua ma tran: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nhap phan tu vi tri ("+i+","+j+"): ");
                matrix[i][j] = sc.nextDouble();

                //Cap nhat gia tri lon nhat va toa do neu tim duoc gia tri lon hon
                if (matrix[i][j] > maxValue) {
                    maxValue = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        //Buoc 3: In ra ket qua phan tu lon nhat va toa do cua no
        System.out.println("Phan tu lon nhat trong ma tran la: "+maxValue);
        System.out.println("Vi tri cua phan tu lon nhat la: ("+maxRow+","+maxCol+")");
        //In ra ma tran
        System.out.println("Ma tran la: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
