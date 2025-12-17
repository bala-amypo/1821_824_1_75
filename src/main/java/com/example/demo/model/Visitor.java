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
public getFname()
{
    return Fname;
}
public setFname(String Fname){
    this.Fname=Fname;
}
public getemail(){
    return email;
}
public setemail(String email){
    this.email=email;
}
public getphone(){
    return phone;
}
public setphone(String phone){
    this.phone=phone;
}
public get