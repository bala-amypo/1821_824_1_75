import.jakarta.persistence.Entity;
import.jakarta.persistence.Id;

@Entity
public class Visitor{
    @Id
    private Long id;
    private String fulllName;
    private String email;
    private String phone;
    private String idProof;
    private LocalDateTime createdAt;

}
public