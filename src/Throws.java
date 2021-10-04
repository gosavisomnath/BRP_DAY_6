public class Throws {
    public void m1() throws ArithmeticException
    {
        throw new ArithmeticException("Exception Hamdle");
    }
    public static void main(String[] args) throws ArithmeticException{
        Throws o=new Throws();
        o.m1();
    }
}
