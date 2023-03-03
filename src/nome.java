public class nome {
    public static void main(String[] args) {
        char[][] arrA = letraA();
        escrever(arrA);
        char[][] arrN = letraN();
        escrever(arrN);
        char[][] arrD = letraD();
        escrever(arrD);
        char[][] arrR = letraR();
        escrever(arrR);
        char[][] arrE = letraE();
        escrever(arrE);
        char[][] arrY = letraY();
        escrever(arrY);
    }
    public static char[][] letraA() {
        char[][] arrA = {
                {'A', 'A', 'A', 'A', 'A'},
                {'A', ' ', ' ', ' ', 'A'},
                {'A', 'A', 'A', 'A', 'A'},
                {'A', ' ', ' ', ' ', 'A'},
                {'A', ' ', ' ', ' ', 'A'},
                {'-', '-', '-', '-', '-'}
        };
        return arrA;
    }
    public static char[][] letraN() {
        char[][] arrN = {
                {' ', ' ', ' ', 'N', ' '},
                {'N', ' ', ' ', 'N', ' '},
                {'N', 'N', ' ', 'N', ' '},
                {'N', ' ', 'N', 'N', ' '},
                {'N', ' ', ' ', 'N', ' '},
                {'-', '-', '-', '-', '-'}
        };
        return arrN;
    }
    public static char[][] letraD() {
        char[][] arrD = {
                {'D', 'D', 'D', ' ', ' '},
                {'D', ' ', ' ', 'D', ' '},
                {'D', ' ', ' ', 'D', ' '},
                {'D', ' ', ' ', 'D', ' '},
                {'D', 'D', 'D', ' ', ' '},
                {'-', '-', '-', '-', '-'}
        };
        return arrD;
    }
    public static char[][] letraR() {
        char[][] arrR = {

                {' ', 'R', 'R', ' ', ' '},
                {' ', 'R', ' ', 'R', ' '},
                {' ', 'R', 'R', ' ', ' '},
                {' ', 'R', ' ', 'R', ' '},
                {' ', 'R', ' ', ' ', 'R'},
                {'-', '-', '-', '-', '-'}
        };
        return arrR;
    }
    public static char[][] letraE() {
        char[][] arrE = {
                {'E', 'E', 'E', 'E', ' '},
                {'E', ' ', ' ', ' ', ' '},
                {'E', 'E', 'E', 'E', ' '},
                {'E', ' ', ' ', ' ', ' '},
                {'E', 'E', 'E', 'E', ' '},
                {'-', '-', '-', '-', '-'}
        };
        return arrE;
    }
    public static char[][] letraY() {
        char[][] arrY = {

                {'Y', ' ', ' ', ' ', 'Y'},
                {' ', 'Y', ' ', 'Y', ' '},
                {' ', ' ', 'Y', ' ', ' '},
                {' ', ' ', 'Y', ' ', ' '},
                {' ', ' ', 'Y', ' ', ' '},
                {'-', '-', '-', '-', '-'}
        };
        return arrY;
    }
    public static void escrever(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
