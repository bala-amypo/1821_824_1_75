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
public getid()
{
    return id;
}
public setid(Long id)
{
    this.id=id;
}
public getfullname()
{
    return fullname;
}
public setFname(String fullname)
{
    this.fullname=fullname;
}
public getemail(){
    return email;
}
public setemail(String email)
{
    this.email=email;
}
public getphone()
{
    return phone;
}
public setphone(String phone)
{
    this.phone=phone;
}
public getidProof()
{
    return idProof;
}
public setidp(String idProof)
{
    this.idProof=idProof;
}
public getcreatedAt()
{
    return createdAt;
}
public setcreatedAt(LocalDateTime)
{
    this.createdAt=createdAt;
}
@PrePersist
public 