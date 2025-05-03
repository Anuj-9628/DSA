class Main {
    public static int sumOfnNumber(int n)
    {
        if(n<0) return 0;
        return sumOfnNumber(n-1)+n;
    }
    public static void main(String[] args) {
        System.out.println("Try programiz.pro "+ sumOfnNumber(5));
    }
}
