package Books;

public class Image extends Element {
    String imageName;

    public Image() {
        imageName = "";
    }

    public Image(String _imageName) {
        imageName = _imageName;
    }

    public Image(Image other) {
        super(other);
        imageName = other.imageName;
    }

    public String GetImageName() {
        return imageName;
    }

    public void SetImageName(String _imageName) {
        imageName = _imageName;
    }

    public void print() {
        System.out.println("Image: " + imageName);
    }

    public Image clone() {
        return new Image(this);
    }
}
