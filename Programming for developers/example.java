class example {
    static int Factorial(int n){
        if(n != 0)
            return n * Factorial(n - 1);
        else
            return 1;
    }
    public static void main(String args[]){
        int num = 4, result;
        result = Factorial(num);
        System.out.println("Factorial of " + num + " is: " + result);
    }
}