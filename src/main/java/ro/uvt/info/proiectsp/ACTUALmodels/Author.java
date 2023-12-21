package ro.uvt.info.proiectsp.ACTUALmodels;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Author {
    @Id
    @GeneratedValue
    Long Id;

    @Column
    String name;
}
