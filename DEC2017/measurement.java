/*ID: sritaru1
LANG: JAVA
TASK: measurement
*/
import java.util.*;
import java.io.*;
public class measurement{
public static void main(String args[]) throws IOException {
        PrintStream output = new PrintStream(new FileOutputStream("measurement.out"));
        Scanner s = new Scanner(new File("measurement.in"));
        int days = s.nextInt();
String []cow = new String [101];
int[] diff = new int [101];
for(int k = 0; k<days; k++)
{
int n = s.nextInt();
cow[n] = s.next();
diff[n] = s.nextInt();

}
int Bessie = 7; int Elsie = 7; int Mildred = 7;
String first = "";
int change = 0;
for(int a = 0; a<100; a++)
{
if(cow[a] == null) continue;
if(((cow[a]).equals("Bessie")))

Bessie += diff[a];
//if((Bessie>Elsie)&&(Bessie>Mildred)&&(!(first.equals("Bessie")))) first = "Bessie";change++;}
else if((cow[a]).equals("Elsie"))
{
Elsie += diff[a];
//if((Elsie>Bessie)&&(Elsie>Mildred))first = "Elsie";change++;
}

else if((cow[a]).equals("Mildred"))
{
Mildred += diff[a];
//if((Mildred>Bessie)&&(Mildred>Elsie))first = "Mildred";change++;
}

int max = 0;
String newfirst = "";
if (Bessie>Elsie)
{
if (Bessie >= Mildred) max = Bessie;
else max = Mildred;
}
else
{
if (Elsie >= Mildred) max = Elsie;
else max = Mildred;
}
if (Bessie == max) newfirst+=("Bessie");
if (Elsie == max) newfirst+=("Elsie");
if (Mildred == max) newfirst+=("Mildred");
//System.out.println(max+" N"+newfirst);
if(!(newfirst.equals(first))) 
{
change++; 
first = newfirst;
}
}
output.println(change);
//System.out.println(change);

}}
