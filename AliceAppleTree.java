import java.util.Scanner;

public class AliceAppleTree {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int applesNeeded = inp.nextInt();
        int noOfApples = inp.nextInt();
        int north = inp.nextInt();  
        int south = inp.nextInt();
        int west = inp.nextInt();
        int east = inp.nextInt();

        if(applesNeeded<=noOfApples*south)
            System.out.println(applesNeeded);
        else if(applesNeeded<=noOfApples*south+east+west)
            System.out.println(noOfApples*south + (applesNeeded-noOfApples*south));
        else
            System.out.println(-1);
        inp.close();
    }
    
}
