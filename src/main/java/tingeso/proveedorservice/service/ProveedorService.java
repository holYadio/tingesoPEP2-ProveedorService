package tingeso.proveedorservice.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tingeso.proveedorservice.entity.Proveedor;
import tingeso.proveedorservice.repository.ProveedorRepository;

import java.util.List;

@Service
public class ProveedorService {
    @Autowired
    ProveedorRepository proveedorRepository;

    public List<Proveedor> getAllProveedores() {
        return proveedorRepository.findAll();
    }

    public Proveedor createProveedor(Proveedor proveedor) {
        return proveedorRepository.save(proveedor);
    }

    public Proveedor getProveedorById(int id) {
        return proveedorRepository.findById(id).orElse(null);
    }
}
