package ro.uvt.info.proiectsp.ACTUALmodels;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Data
public class Section extends Element {
    @Column
    String title;
}
