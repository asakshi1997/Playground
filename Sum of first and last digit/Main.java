import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int first_dig = in.nextInt();
      int last_dig = first_dig % 10;
      while(first_dig >= 10)
      {
        first_dig = first_dig / 10;
      }
      int sum = last_dig + first_dig;
      System.out.println(sum);
	}
}