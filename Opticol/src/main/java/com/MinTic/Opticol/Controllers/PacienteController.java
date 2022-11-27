package com.MinTic.Opticol.Controllers;
    
@RestController
@RequestMapping("/api")
public class PacienteController {
     //Metodos

    //CRUD Pacientes

    //Listar todos los pacientes
    @GetMapping("/pacientes")
    public List<Pacientes> findAll(){
        return pacienteService.listar();
    }
    //Agregar un Paciente
    @PostMapping("/pacientes")
    public ResponseEntity<Object> create (@RequestBody Pacientes paciente, @RequestHeader HttpHeaders headers){
         return pacienteService.guardar(paciente,headers);
    }
    //Buscar Paciente por id
    @GetMapping("/pacientes/{id}")
    public ResponseEntity<Pacientes> findById(@PathVariable String id){
        return pacienteService.buscarPorId(id);
    }
    //Modificar Paciente por id
    @PutMapping("/pacientes")
    public ResponseEntity<Pacientes> update(@RequestBody Pacientes paciente, @RequestHeader HttpHeaders headers){
        return pacienteService.modificarPaciente(paciente, headers);
    }
    //Eliminar por id
    @DeleteMapping("/pacientes/{id}")
    public ResponseEntity<Pacientes> delete(@PathVariable String id){
        return pacienteService.eliminarPaciente(id);
    }

    
}
