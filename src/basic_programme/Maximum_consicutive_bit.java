package basic_programme;

public class Maximum_consicutive_bit {
    public static void main(String[] args) {
        int arr[]={0,0,1,1,0,0,0,0};
        System.out.println(max_cons_bit(arr));

    }
    static  int max_cons_bit(int arr[]){
        if(arr.length==0)return 0;
        int count=1;
        int max=1;

        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                count++;
            }else {
                count=1;
            }
            max=Math.max(max,count);

        }
        return  max;
    }
}
