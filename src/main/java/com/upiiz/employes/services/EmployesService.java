package com.upiiz.employes.services;

import com.upiiz.employes.models.Employes;
import com.upiiz.employes.repository.EmployesRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployesService {

    EmployesRepository employesRepository;

    public EmployesService(EmployesRepository employesRepository) {
        this.employesRepository = employesRepository;
    }

    public List<Employes> getAllEmployes(){
        return employesRepository.getEmpleados();
    }

    public Employes getEmployesById(Long id){
        return employesRepository.obtenerPorId(id);
    }

    public Employes guardarEmpleado(Employes empleado){
        return employesRepository.guardar(empleado);
    }

    public Employes updateEmpleado(Employes empleado){
        return employesRepository.actualizar(empleado);
    }

    public void deleteEmpleado(Long id){
        employesRepository.eliminar(id);
    }

}
