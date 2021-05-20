public class palindrome_numbers {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-5005));
    }
        public static boolean isPalindrome(int number){
            int rev_num=0;
            int dup=number;
            while(dup!=0){
                rev_num=(rev_num*10)+(dup%10);
                System.out.println(rev_num);
                dup/=10;
                System.out.println(dup);
            }
            if(rev_num==number){
                return true;
            }
            else{
                return false;
            }
        }
}