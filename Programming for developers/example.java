// class example {
//     static int Factorial(int n){
//         if(n != 0)
//             return n * Factorial(n - 1);
//         else
//             return 1;
//     }
//     public static void main(String args[]){
//         int num = 4, result;
//         result = Factorial(num);
//         System.out.println("Factorial of " + num + " is: " + result);
//     }
// }

//Java Program to illustrate the use of mutli dimensional array
class Testarray3{
    public static void main(String[] args) {
        int arr[][] = { {1, 2, 3}, {2, 4, 5}, {4, 4, 5} };
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}