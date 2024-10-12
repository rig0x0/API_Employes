package com.upiiz.employes.repository;

import com.upiiz.employes.models.Employes;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class EmployesRepository {
    private List<Employes> empleados = new ArrayList<>();
    private AtomicLong id = new AtomicLong();

    public Employes guardar(Employes empleado){
        empleado.setEmployee_id(id.incrementAndGet());
        empleados.add(empleado);
        return empleado;
    }

    public List<Employes> getEmpleados(){
        return empleados;
    }

    public Employes obtenerPorId(Long id){
        return empleados.stream().filter(empleados -> empleados.getEmployee_id().equals(id)).findFirst().orElse(null);
    }

    public void eliminar(Long id){
        empleados.removeIf(empleados -> empleados.getEmployee_id().equals(id));
    }

    public Employes actualizar(Employes empleado){
        eliminar(empleado.getEmployee_id());
        empleados.add(empleado);
        return empleado;
    }
}
