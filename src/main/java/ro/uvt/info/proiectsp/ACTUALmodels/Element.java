package ro.uvt.info.proiectsp.ACTUALmodels;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@Inheritance (strategy = InheritanceType.JOINED)
public class Element {
    @Id
    @GeneratedValue
    long Id;

    @OneToMany(targetEntity = Element.class)
    protected List<Element> elements;
}