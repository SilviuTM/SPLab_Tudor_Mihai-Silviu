package Books;

public class Image implements Element {
    String imageName;

    public Image() {
        imageName = "";
    }

    public Image(String _imageName) {
        imageName = _imageName;
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
}
