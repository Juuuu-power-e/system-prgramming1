import java.util.Scanner;

public class SPaser {
    private SLex lex;
    public void associate(SLex lex) {
        this.lex = lex;
    }
    public void parse(Scanner scanner){
        String token = lex.getToken(scanner);
        while (!token.contentEquals("end")){

            token = lex.getToken(scanner);
        }
    }
}
