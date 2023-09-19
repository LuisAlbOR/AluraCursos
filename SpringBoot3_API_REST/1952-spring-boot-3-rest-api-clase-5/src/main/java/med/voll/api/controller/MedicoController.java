package med.voll.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.medico.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository medicoRepository;

    @PostMapping
    public void registrarMedico(@RequestBody @Valid DatosRegistroMedico datosRegistroMedico) {
        medicoRepository.save(new Medico(datosRegistroMedico));
    }

    /*@GetMapping
    public List<DatosListadoMedico> listadoMedicos(){
        return medicoRepository.findAll().stream().map(DatosListadoMedico::new).toList();
    }*/

    @GetMapping                                     //Tamaño por defecto cambiado a 5, se muestra por nombre y pagina 0
    public Page<DatosListadoMedico> listadoMedicos(@PageableDefault(page = 0,size = 5,  sort={"nombre"}) Pageable paginacion){
//        return medicoRepository.findAll(paginacion).map(DatosListadoMedico::new);
        return medicoRepository.findByActivoTrue(paginacion).map(DatosListadoMedico::new);
    }

    @PutMapping
    @Transactional
    public void actualizarMedico(@RequestBody @Valid DatosActualizaMedico datosActualizaMedico){
        Medico medico = medicoRepository.getReferenceById(datosActualizaMedico.id());
        medico.actualizarDatos(datosActualizaMedico);
    }

    /*Borrar fisicamente de la base de datos
    @DeleteMapping("/{id}")
    @Transactional
    public void eliminarMedicoFisicamente(@PathVariable Long id){
        Medico medico = medicoRepository.getReferenceById(id);
        medicoRepository.delete(medico);
    }*/

    //Delete lógico
    @DeleteMapping("/{id}")
    @Transactional
    public void eliminarMedicoLogicamente(@PathVariable Long id) {
        Medico medico = medicoRepository.getReferenceById(id);
        medico.desactivarMedico();
    }
}
