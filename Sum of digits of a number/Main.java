import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int sum = 0;
      while(num > 0)
     {
     int rem = num % 10;
     sum = sum + rem;
     int second_dig = num % 10;
     num = num / 10;
      }
    System.out.println(sum);
  }
}