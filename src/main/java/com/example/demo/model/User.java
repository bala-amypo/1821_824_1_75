import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.column;

@Entity
public class User{
    @Id
    private Long id;
    @column(unique=true)
    private String email;
    

    public Long getid{
        return id;
    }
    public void setid{
        this.id=id;
    }
    public String getemail{
        this.email=email;
    }

}