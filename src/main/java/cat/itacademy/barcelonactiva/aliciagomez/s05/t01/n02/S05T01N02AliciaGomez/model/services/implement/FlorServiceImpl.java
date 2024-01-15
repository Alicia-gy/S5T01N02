package cat.itacademy.barcelonactiva.aliciagomez.s05.t01.n02.S05T01N02AliciaGomez.model.services.implement;

import cat.itacademy.barcelonactiva.aliciagomez.s05.t01.n02.S05T01N02AliciaGomez.model.domain.Flor;
import cat.itacademy.barcelonactiva.aliciagomez.s05.t01.n02.S05T01N02AliciaGomez.model.dto.FlorDTO;
import cat.itacademy.barcelonactiva.aliciagomez.s05.t01.n02.S05T01N02AliciaGomez.model.repository.FlorRepository;
import cat.itacademy.barcelonactiva.aliciagomez.s05.t01.n02.S05T01N02AliciaGomez.model.services.FlorService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class FlorServiceImpl implements FlorService {


    @Autowired
    private FlorRepository florRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public FlorDTO save(FlorDTO florDTO) {
        Flor entity = modelMapper.map(florDTO, Flor.class);
        florRepository.save(entity);
        return modelMapper.map(entity, FlorDTO.class);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        florRepository.deleteById(id);

    }

    @Override
    @Transactional(readOnly = true)
    public Optional<FlorDTO> findById(int id) {
        FlorDTO dto = modelMapper.map(florRepository.findById(id), FlorDTO.class);
        return Optional.ofNullable(dto);
    }

    @Override
    @Transactional(readOnly = true)
    public List<FlorDTO> findAll() {
        List<Flor> flors = florRepository.findAll();
        return flors.stream().map(flor -> modelMapper.map(flor, FlorDTO.class)).collect(Collectors.toList());
    }

}
