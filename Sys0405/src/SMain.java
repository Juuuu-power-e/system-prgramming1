import java.util.Scanner;

public class //keywords
SMain //user defined symbols
{ //keywords 의 일종
    private SPaser parser;
    private SLex lex;
    private Scanner scanner;

    public void SMain(){
        lex = new SLex();
        parser = new SPaser();
        parser.associate(lex);

    }
    public void sInitialize(){
        scanner = new Scanner("source\\exe1");
    }
    public void sFinalize(){
        scanner.close();
    }
    public static void main(String[] args) {
        SMain main = new SMain();
        main.sRun();
    }


    public void sRun(){

    }
}