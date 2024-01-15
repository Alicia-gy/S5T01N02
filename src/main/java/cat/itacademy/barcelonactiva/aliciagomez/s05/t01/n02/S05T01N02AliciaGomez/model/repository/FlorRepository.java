package cat.itacademy.barcelonactiva.aliciagomez.s05.t01.n02.S05T01N02AliciaGomez.model.repository;

import cat.itacademy.barcelonactiva.aliciagomez.s05.t01.n02.S05T01N02AliciaGomez.model.domain.Flor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlorRepository extends JpaRepository<Flor, Integer> {
}
