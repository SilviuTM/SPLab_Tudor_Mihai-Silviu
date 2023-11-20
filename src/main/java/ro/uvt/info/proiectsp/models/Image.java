package ro.uvt.info.proiectsp.models;

import java.util.Vector;
import java.util.concurrent.TimeUnit;

public class Image extends Element implements Picture, Visitee {
    String imageName;
    Vector<Integer> dim;
    int[] content;

    public Image() {
        imageName = "";
    }

    public Image(String _imageName) {
        imageName = _imageName;

        try {
            TimeUnit.SECONDS.sleep(5);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Image(Image other) {
        imageName = other.imageName;
        dim = other.dim;
        content = other.content;
    }

    public String url() {
        return imageName;
    }

    public Vector<Integer> dim() {
        return dim;
    }

    public int[] content() {
        return content;
    }

    public String getImageName() { return imageName; }

    public Image clone() {
        return new Image(this);
    }

    public void accept(Visitor visitor) {
        visitor.visitImage(this);
    }
}
