
import java.util.*;
import java.io.*;
public class shuffle{
public static void main(String args[]) throws IOException {
        PrintStream output = new PrintStream(new FileOutputStream("shuffle.out"));
        Scanner s = new Scanner(new File("shuffle.in"));
        
int num = s.nextInt();
int [] aN = new int [num+1];
for(int k = 1; k<num+1; k++)
{
aN[k] = s.nextInt();

}
int [] N = new int[num +1];
for(int m = 1; m<num+1;m++)
{
N[m] = s.nextInt();
}


for(int a = 0; a<3; a++)
{
int temp[] = new int [num+1];
for(int b = 1; b<num+1; b++)
{
temp[b] = N[aN[b]];
}
N = temp;
}

for(int c = 1; c<num +1; c++)
{
output.println(N[c]);
}
/*for(int c = 1; c<num +1; c++)
{
System.out.println(N[c]);
}*/

}
}
