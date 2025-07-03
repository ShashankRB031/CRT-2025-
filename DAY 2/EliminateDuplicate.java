public class EliminateDuplicate {
    public static void main(String[] args) {
        int[] arr = {8,4,3,5,7,4};
        for(int i=0 ; i<arr.length; i++){
            for(int j = i; j<i ; j++){
                if(arr[i]== arr[j]){
                    System.out.println("Duplicat find");
                }
            }
            
        }
    }
}
