import.jakarta.persistence.Entity;
import.jakarta.persistence.Id;
import.jakarta.persistence.PrePersist;

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
public Float getid()
{
    return id;
}
public void setid(Long id)
{
    this.id=id;
}
public String getfullname()
{
    return fullname;
}
public void setFname(String fullname)
{
    this.fullname=fullname;
}
public String getemail(){
    return email;
}
public void setemail(String email)
{
    this.email=email;
}
public String getphone()
{
    return phone;
}
public void setphone(String phone)
{
    this.phone=phone;
}
public String getidProof()
{
    return idProof;
}
public void setidp(String idProof)
{
    this.idProof=idProof;
}
public LocalDateTime getcreatedAt()
{
    return createdAt;
}
public void setcreatedAt(LocalDateTime createdAt)
{
    this.createdAt=createdAt;
}
@PrePersist
public void PrePersist(){
    if(phone==null || phone.isEmpty()){
        throw new RuntimeException("phone required");
    }
    createdAt=LocalDateTime.now();
}