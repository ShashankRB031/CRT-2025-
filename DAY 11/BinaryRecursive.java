public class BinaryRecursive {

    static void toBinary(int n){
        if( n== 0) return ;
         
        toBinary(n/2);
        System.out.print(n % 2);
    }
    public static void main(String[] args) {
        int number = 13;
        if(number == 0){
            System.out.print("0");
        }
        else{
            System.out.print("Binary of " + number + " is :");
            toBinary(number);
        }
    }
}
