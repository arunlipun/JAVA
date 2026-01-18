package basic_programme;

public class second_largest_inarray {
    public static void main(String[] args) {
        int arr[]={11,12,34,75,1,2,46};
        System.out.println(find_largest(arr));

    }
    static int find_largest(int arr[]){
       int largest=Integer.MIN_VALUE;
       int sl=Integer.MIN_VALUE;
       for(int num:arr){
           if(num>largest){
              sl=largest;
              largest=num;
           } else if(num > sl && num != largest) {
               sl = num;
           }
       }
       return  sl;

    }
}
