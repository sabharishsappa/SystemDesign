package WordProcessor;

public class Client {

    public static void main(String[] args) {
        ILetter obj1 = LetterFactory.createLetter('c');
        obj1.display(0,0);

        System.out.println();

        ILetter obj2 = LetterFactory.createLetter('t');
        obj2.display(1,1);



    }
}
