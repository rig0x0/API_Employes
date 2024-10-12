package com.upiiz.employes.controllers;

import com.upiiz.employes.models.Employes;
import com.upiiz.employes.services.EmployesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employes")
public class EmployesController {

    EmployesService employesService;

    public EmployesController(EmployesService employesService) {
        this.employesService = employesService;
    }

    @GetMapping
    public ResponseEntity<List<Employes>> getEmpleados(){
        return ResponseEntity.ok(employesService.getAllEmployes());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employes> getEmpleadoPorId(@PathVariable Long id){
        return ResponseEntity.ok(employesService.getEmployesById(id));
    }

    @PostMapping
    public ResponseEntity<Employes> addEmpleado(@RequestBody Employes empleado){
        return ResponseEntity.ok(employesService.guardarEmpleado(empleado));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Employes> actualizarEmpleado(@RequestBody Employes empleado, @PathVariable Long id){
        empleado.setEmployee_id(id);
        return ResponseEntity.ok(employesService.updateEmpleado(empleado));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarEmpleado(@PathVariable Long id){
        employesService.deleteEmpleado(id);
        return ResponseEntity.noContent().build();
    }

}
