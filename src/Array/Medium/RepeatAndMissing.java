package Array.Medium;

public class RepeatAndMissing {
        public static void repeatedNumber(int[] A) {
            int[] res = new int[2];
            int i = 0;
    
            for(i=0; i<A.length; i++) {
                if(A[i] != i+1 && A[A[i]-1] != A[i]) {
                    int temp = A[A[i]-1];
                    A[A[i]-1] = A[i];
                    A[i] = temp;
                    i--;
                }
                
            }
            
            for(i=0; i<A.length; i++) {
                if(A[i] != i+1) {
                    res[0] = A[i]; 
                    res[1] = i+1; 
                    break;
                }
            }
            System.out.println(res[0] + " " + res[1]);
        }
    
    
    public static void main(String[] args) {
        int[] A = {3, 1, 2, 5, 3};

        repeatedNumber(A);
    }
}
