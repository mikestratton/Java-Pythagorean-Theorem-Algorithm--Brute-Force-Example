import java.util.Scanner; // initialize scanner
public class coinCounter
{
public static void main( String[] args )
{
int combinations = 0;
for ( int q = 0; q <= 4; q++ )
{
for ( int d = 0; d <= 10; d++ )
{
for ( int n = 0; n <= 20; n++ )
{
for ( int p = 0; p <= 100; p++ )
{
if(p + (n*5) + (d*10) + (q*25) == 100)
{
System.out.printf( "%d Pennies, %d Nickels, %d Dimes, %d Quarters", p, n, d, q );
System.out.println();
combinations++;
} // end if
} // end end penny
} // end end nickel
} // end dime
} // end quarter
System.out.println();
System.out.printf("There were %d combinations. ", combinations);
} // end method main

} // end class PythagoreanTriple
