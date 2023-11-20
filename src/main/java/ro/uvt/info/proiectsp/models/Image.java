package ro.uvt.info.proiectsp.models;

import java.util.Vector;
import java.util.concurrent.TimeUnit;

public class Image implements Picture {
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
}
