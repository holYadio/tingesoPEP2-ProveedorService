package tingeso.proveedorservice.entity;


import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Proveedor {
    @Id
    private String codigo;
    private String nombre;
    private String categoria;
    private String retencion;
}
