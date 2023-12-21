package ro.uvt.info.proiectsp.Persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.uvt.info.proiectsp.ACTUALmodels.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
