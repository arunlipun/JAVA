package basic_programme;

public class chocolate_code {
    public static void main(String[] args) {
        int arr[]={4,5,0,1,9,0,5,0};
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if (arr[i]!=0){
                arr[count++]=arr[i];
            }

        }
        for (int i=count;i<arr.length;i++){
            arr[i]=0;
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
