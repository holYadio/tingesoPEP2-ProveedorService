package tingeso.proveedorservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tingeso.proveedorservice.entity.Proveedor;

public interface ProveedorRepository extends JpaRepository<Proveedor, Integer> {
}
