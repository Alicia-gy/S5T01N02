package cat.itacademy.barcelonactiva.aliciagomez.s05.t01.n02.S05T01N02AliciaGomez.controllers;

import java.util.List;
import java.util.Optional;

import cat.itacademy.barcelonactiva.aliciagomez.s05.t01.n02.S05T01N02AliciaGomez.model.dto.FlorDTO;
import cat.itacademy.barcelonactiva.aliciagomez.s05.t01.n02.S05T01N02AliciaGomez.model.services.FlorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/flor")
public class FlorController {

    @Autowired
    private FlorService florService;


    //create new
    @PostMapping("/add")
    public ResponseEntity<?> create (@RequestBody FlorDTO florDTO){
        return ResponseEntity.status(HttpStatus.CREATED).body(florService.save(florDTO));
    }

    //read by id
    @GetMapping("/getOne/{id}")
    public ResponseEntity<?> read(@PathVariable(value = "id") int id){
        Optional<FlorDTO> flor = florService.findById(id);

        if(flor.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(flor);
    }

    //read all
    @GetMapping("/getAll")
    public List<FlorDTO> readAll() {
        return florService.findAll();
    }

    //update
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@RequestBody FlorDTO florDetails, @PathVariable(value = "id") int id) {
        Optional<FlorDTO> flor = florService.findById(id);

        if(flor.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        flor.get().setNomFlor(florDetails.getNomFlor());
        flor.get().setPaisFlor(florDetails.getPaisFlor());
        flor.get().setPk_FlorID(id);

        return ResponseEntity.status(HttpStatus.CREATED).body(florService.save(flor.get()));

    }

    //delete
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable(value = "id") int id){
        if(florService.findById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        florService.deleteById(id);
        return ResponseEntity.ok().build();

    }

}
