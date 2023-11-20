package ro.uvt.info.proiectsp.services;

import ro.uvt.info.proiectsp.models.Paragraph;

public class AlignRight implements AlignStrategy {
    public void render(Paragraph p) {
        System.out.println("# # # # " + p.GetText());
    }
}
