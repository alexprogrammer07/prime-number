class prime_range_recursion
{
    int j=2;
    int is_prime(int n)
    {
        if(j<n)
        {
            if(n%j==0)
            {
                return 0;                
            }
            j++;
            return is_prime(n);
        }
        else if(n>2){
            return 0;
        }
        else {
            return 1;
        }
    }

    void range_prime()
    {
        for(int i=1; i<=100; i++)
        {
            j = 2;
            int output = is_prime(i);
            if(output == 1)
                System.out.println("Prime Number:\t" + i);
        }
    }

    public static void main(String args[])
    {
        prime_range_recursion_2 ob1=new prime_range_recursion_2();
        ob1.range_prime();
    }
}

