public class MultipleCatch {
    public static void main(String[] args) {
        try{
            int a=100/0;
        }catch (ArithmeticException e){
            System.out.println(e);
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("Main Code");
        }
    }

}
