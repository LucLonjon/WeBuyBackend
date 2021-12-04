package com.webuy.backend.control;

import com.webuy.backend.boundary.AnnonceRepository;
import com.webuy.backend.entity.Annonce;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AnnonceController {


    private final AnnonceRepository annonceRepository;

    public AnnonceController(AnnonceRepository annonceRepository) {
        this.annonceRepository = annonceRepository;
    }

    @GetMapping("/annonces")
    public List<Annonce> getAnnonces() {
        return (List<Annonce>) annonceRepository.findAll();
    }

    @PostMapping("/annonces")
    void addAnnonce(@RequestBody Annonce annonce) {
        annonceRepository.save(annonce);
    }

    @PostMapping("/annonces/bulk")
    void addAnnonces(@RequestBody List<Annonce> annonces) {
        annonceRepository.saveAll(annonces);
    }

    @DeleteMapping("/annonces")
    void deleteAnnonce(@RequestBody Annonce annonce) {
        annonceRepository.delete(annonce);
    }

    @DeleteMapping("/annonces/all")
    void deleteAllAnnonces() {
        annonceRepository.deleteAll();
    }
}
