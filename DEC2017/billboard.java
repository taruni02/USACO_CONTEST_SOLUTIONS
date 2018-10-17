/*ID: sritaru1
LANG: JAVA
TASK: billboard
*/
import java.util.*;
import java.io.*;
public class billboard {
    public static void main(String args[]) throws IOException {
        PrintStream output = new PrintStream(new FileOutputStream("billboard.out"));
        Scanner s = new Scanner(new File("billboard.in"));
        int x1 = s.nextInt();
        int y1 = s.nextInt();
        int x2 = s.nextInt();
        int y2 = s.nextInt();
        int x3 = s.nextInt();
        int y3 = s.nextInt();
        int x4 = s.nextInt();
        int y4 = s.nextInt();
        int x5 = s.nextInt();
        int y5 = s.nextInt();
        int x6 = s.nextInt();
        int y6 = s.nextInt();
        long totalArea;
        totalArea= findArea(x1,y1,x2,y2,x5,y5,x6,y6) +
        findArea(x3,y3,x4,y4,x5,y5,x6,y6);
        output.println(totalArea);
         
        
    }
    private static long findArea(int bx1, int by1, int bx2, int by2, int tx1, int ty1, int tx2, int ty2)
    {
        long h = 0; //overlap height
        long w = 0; //overlap width
        long area = calcArea(bx1,by1,bx2,by2); //area of board
        if((tx1>=bx2)||(tx2<=bx1)||(ty1>=by2)||(ty2<=by1))
        {
            return area; //no overlap
        }
        if((ty1<by1)&&(ty2<by2))
            h = ty2-by1; //t cuts bottom part
        if((ty2>=by2)&&(ty1<=by1))
            h = (by2-by1); // truck completely obstructs board
        if((ty2<=by2)&&(ty1>=by1))
            h = (by2-by1)-(ty2-ty1); //full length of truck covers the board
        if((ty1>by1)&&(ty2>by2))
            h = by2-ty1; //cuts top part

        if((tx1<bx1)&&(tx2<bx2))
            w = tx2-bx1;
        if((tx2>=bx2)&&(tx1<=bx1))
            w = (bx2-bx1);
        if((tx2<=bx2)&&(tx1>=bx1))
            w = (bx2-bx1)-(tx2-tx1);
        if((tx1>bx1)&&(tx2>bx2))
            w = bx2-tx1;

        return (area-(h*w));

    }
    private static long calcArea(int x1, int y1, int x2, int y2)
    {
        return ((long)(x2-x1)*(long)(y2-y1));
    }

}
