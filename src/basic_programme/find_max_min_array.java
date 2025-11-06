package basic_programme;

public class find_max_min_array {
    public static void main(String[] args) {
        int arr[]={0,1,5,401,32,78,21};
        System.out.print(max(arr));
        System.out.println();
        System.out.print(min(arr));

    }
    static int max(int arr[]){
        int max=arr[0];
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static int min(int arr[]){
        int min=arr[0];
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
