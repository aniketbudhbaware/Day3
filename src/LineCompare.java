import java.util.Scanner;
public class LineCompare {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x1;
        double y1;
        double x2;
        double y2;
        double distance1;
        double a1;
        double b1;
        double a2;
        double b2;
        double distance2;
        System.out.println("(Line-1)Enter X1 coordinates:");
        x1= scan.nextInt();
        System.out.println("(Line-1)Enter Y1 coordinates:");
        y1= scan.nextInt();
        System.out.println("(Line-1)Enter X2 coordinates:");
        x2= scan.nextInt();
        System.out.println("(Line-1)Enter Y2 coordinates:");
        y2= scan.nextInt();
        System.out.println("(Line-2)Enter X1 coordinates:");
        a1= scan.nextInt();
        System.out.println("(Line-2)Enter Y1 coordinates:");
        b1= scan.nextInt();
        System.out.println("(Line-2)Enter X2 coordinates:");
        a2= scan.nextInt();
        System.out.println("(Line-2)Enter Y2 coordinates:");
        b2= scan.nextInt();
        scan.close();


        distance1 = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
        System.out.println("The length of line-1 is :"+distance1);
        distance2 = Math.sqrt((b2 - b1) * (b2 - b1) + (a2 - a1) * (a2 - a1));
        System.out.println("The length of line-2 is :"+distance2);

        String myStr1 = Double.toString(distance1);
        String myStr2 = Double.toString(distance2);
        System.out.println(myStr1.compareTo(myStr2));
        if(myStr1.compareTo(myStr2) ==0){
            System.out.println("The line lengths are equal");}
        else if(myStr1.compareTo(myStr2) >0)
            System.out.println("The line-1 length is greater than line-2 length");
        else
            System.out.println("The line-1 length is smaller than line-2 length");
    }

}
