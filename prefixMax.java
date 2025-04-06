class prefixMax{
    public static void main(String[] args) {
        int[] arr=new int[]{12,6,1,2,7};

        int result=0;
        //find out max element for i
        int imax=0;
        int kmax=arr[arr.length-1];
        int n=arr.length;
        int imaxpos=0;
        int kmaxpos=0;
        for(int j=n-2; j>=0; j--){
            if(arr[j]>imax){
                imax=arr[j];
                
                imaxpos=j;
            }
        }
        System.out.println(imax+"\t"+imaxpos);

        for(int j=imaxpos+1; j<n; j++){
            if(arr[j+1]>kmax && arr[j]!=arr.length-1){
                kmax=arr[j];
                kmaxpos=j;
            }

            if(kmax>arr[j]){
                System.out.println(imax+"\t"+arr[j]+"\t"+kmax);
                result=(imax-arr[j])*kmax;
            }
        }

        System.out.println(result);

    }
}