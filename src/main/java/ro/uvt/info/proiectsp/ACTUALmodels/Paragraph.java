package ro.uvt.info.proiectsp.ACTUALmodels;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Paragraph extends Element {
    @Column
    String text;
}