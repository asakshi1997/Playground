import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int arr_size = in.nextInt();
        int arr[] = new int[arr_size];
        for(int index = 0; index <= arr_size - 1; index++)
        {
            arr[index] = in.nextInt();
        }
        int search_elem1 = in.nextInt();
        int search_elem2 = in.nextInt();
        int elem1_index = -1;
        int elem2_index = -1;
        for(int index = 0; index <= arr_size - 1; index++)
        {
            if(search_elem1 == arr[index])
            {
                elem1_index = index;
            }
            if(search_elem2 == arr[index]){
                elem2_index = index;
            }
        }
        System.out.println(elem1_index);
        System.out.println(elem2_index);
    }
}