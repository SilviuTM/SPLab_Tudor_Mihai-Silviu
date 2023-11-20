package ro.uvt.info.proiectsp.models;

import java.util.Vector;

public interface Picture {
    public String url();
    public Vector<Integer> dim();
    public int[] content();
}
