package ro.uvt.info.proiectsp.ACTUALmodels;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
public class Book extends Section {
    @ManyToMany
    List<Author> authorList;
}
