public class recursion 
{
    int func (int n) 
    {
        int result;
        if (n == 1)
            return 1;
        result = n*func (n - 1);
        return result;
    }
} 
class Output 
{
    public static void main(String args[]) 
    {
        recursion obj = new recursion() ;
        System.out.print(obj.func(5));
    }
}