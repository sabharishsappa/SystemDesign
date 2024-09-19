package WordProcessor;

public class DocumentCharacter implements ILetter{

    private char c;
    private String fontType;
    private int fontSize;

    DocumentCharacter(char c, String fontType, int fontSize) {
        this.c = c;
        this.fontType = fontType;
        this.fontSize = fontSize;
    }

    public char getChar() {
        return c;
    }

    public String getFontType() {
        return fontType;
    }

    public int getFontSize() {
        return fontSize;
    }

    @Override
    public void display(int x, int y) {
        System.out.println("Character : "+c);
        System.out.println("Font type : "+fontType);
        System.out.println("Font size : "+fontSize);
        System.out.println("Positioned at X: "+x+" Y: "+y);
    }
}
