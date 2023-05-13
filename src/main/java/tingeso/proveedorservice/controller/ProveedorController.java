package tingeso.proveedorservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tingeso.proveedorservice.entity.Proveedor;
import tingeso.proveedorservice.service.ProveedorService;

import java.util.List;

@RestController
@RequestMapping("/proveedor")
public class ProveedorController {
    @Autowired
    ProveedorService proveedorService;

    @GetMapping
    public ResponseEntity<List<Proveedor>> getAll(){
        List<Proveedor> proveedores = proveedorService.getAllProveedores();
        if(proveedores.isEmpty())
            return ResponseEntity.noContent().build();
        return ResponseEntity.ok(proveedores);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Proveedor> getById(@PathVariable(value = "id") int id){
        Proveedor proveedor = proveedorService.getProveedorById(id);
        if(proveedor == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(proveedor);
    }

    @PostMapping()
    public ResponseEntity<Proveedor> createProveedor(@RequestBody Proveedor proveedor){
        Proveedor newProveedor = proveedorService.createProveedor(proveedor);
        if(newProveedor == null)
            return ResponseEntity.noContent().build();
        return ResponseEntity.ok(newProveedor);
    }
}
