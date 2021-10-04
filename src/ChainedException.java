import java.io.IOException;

public class ChainedException {

    public void main(String[] args) throws Throwable {
        try {
            throw new ArithmeticException("Top Level Exception.")
                    .initCause(new IOException("IO cause."));
        }
        catch(ArithmeticException e) {
            System.out.println("Caught : " + e);
            System.out.println("Actual cause: "+ e.getCause());
        }
    }
}