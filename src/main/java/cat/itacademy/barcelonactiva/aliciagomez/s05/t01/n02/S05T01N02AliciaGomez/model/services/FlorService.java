package cat.itacademy.barcelonactiva.aliciagomez.s05.t01.n02.S05T01N02AliciaGomez.model.services;

import cat.itacademy.barcelonactiva.aliciagomez.s05.t01.n02.S05T01N02AliciaGomez.model.domain.Flor;
import cat.itacademy.barcelonactiva.aliciagomez.s05.t01.n02.S05T01N02AliciaGomez.model.dto.FlorDTO;

import java.util.List;
import java.util.Optional;

public interface FlorService {

    public FlorDTO save(FlorDTO florDTO);

    public void deleteById(int id);

    public Optional<FlorDTO> findById(int id);

    public List<FlorDTO> findAll();

}
