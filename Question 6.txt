/*The sum of the squares of the first ten natural numbers is,

12 + 22 + ... + 102 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 - 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.*/
class sumSquareDifference
{
    /*With help of to loops we will find the square of the sum and sum of squares
     * then we can simply add the values to a varriable and find the difference
     */
    public static void main(String args[])
    {
        int n1=0,n2=0;
        for(int a=1; a<=100; a++)
        {
            n1=n1+(int)Math.pow(a,2);
        }
        for(int a=1; a<=100; a++)
        {
            n2=n2+a;
        }
        n2=(int)Math.pow(n2,2);
        int ans=n2-n1;
        System.out.print("Answer = "+ans);
    }
}