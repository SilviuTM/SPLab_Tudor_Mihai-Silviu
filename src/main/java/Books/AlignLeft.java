package Books;

public class AlignLeft implements AlignStrategy {
    public void render(Paragraph p) {
        System.out.println(p.GetText() + " # # # #");
    }
}
