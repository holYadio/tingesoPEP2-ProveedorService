package tingeso.proveedorservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tingeso.proveedorservice.entity.Proveedor;

import java.util.Optional;

public interface ProveedorRepository extends JpaRepository<Proveedor, Integer> {
   Proveedor findByCodigo(String codigo);
}
