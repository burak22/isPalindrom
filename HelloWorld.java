public class HelloWorld{
    public static void main(String[] args) {
        System.out.println(isPalindrom(694908));
    }            

    static boolean isPalindrom(int n){

        int temp = n,reverseNumber=0,lastDigit;
        while(temp!=0){
            lastDigit = temp%10;
            reverseNumber = (reverseNumber*10) + lastDigit;
            temp /=10;
        }
        boolean isP = (reverseNumber == n)? true:false;
        return isP;
    }
}