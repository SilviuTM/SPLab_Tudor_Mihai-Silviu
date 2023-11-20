package ro.uvt.info.proiectsp.models;

import java.util.Vector;

public class ImageProxy extends Element implements Picture {
    String imageName;
    Vector<Integer> dim;
    int[] content;

    Image realImg;

    public ImageProxy(String _imageName) {
        imageName = _imageName;
    }

    public ImageProxy(ImageProxy other) {
        imageName = other.imageName;
        dim = other.dim;
        content = other.content;
        realImg = other.realImg;
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

    public Image loadContent() {
        if (realImg == null) {
            realImg = new Image(imageName);
        }

        return realImg;
    }

    public void print() {
        loadContent();
        realImg.print();
    }

    public ImageProxy clone() {
        return new ImageProxy(this);
    }
}
