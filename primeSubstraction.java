public class primeSubstraction{
int prev=0;
    public boolean maxPrimeNumber(int nums[]){
        int n=nums.length;
        for(int i=0; i<n; i++){
            int maxPrime=prevMax(nums[i]);
            if(maxPrime>prev){
                nums[i]=nums[i]-maxPrime;
            }else{
                return false;
            }
            prev=nums[i];
        }
        
        
        
        return true;
    }
    public int prevMax(int data){
        for(int i=data; i>=0; i--){
        boolean cheack=isPrime(i);
        if(cheack==true){
            return i;
        }
        
        }
        return 0;
    }

    public boolean isPrime(int no){
        for(int i=2; i<=no/2; i++){
            if(no%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int [] arr=new int[]{15,20,17,7,16};
        primeSubstraction obj=new primeSubstraction();
        boolean cheack= obj.maxPrimeNumber(arr);
        if(cheack){
            System.out.println("Yes");
        }else{
            System.out.println("false");
        }
    }
}
