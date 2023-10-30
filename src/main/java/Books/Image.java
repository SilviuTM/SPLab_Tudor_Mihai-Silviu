package Books;

import java.util.Vector;
import java.util.concurrent.TimeUnit;

public class Image extends Element implements Picture {
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
        super(other);
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

    public void print() {
        System.out.println("Image: " + imageName);
    }

    public Image clone() {
        return new Image(this);
    }
}
