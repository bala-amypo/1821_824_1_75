import.jakarta.persistence.Entity;
import.jakarta.persistence.Id;

@Entity
public class Visitor{
    @Id
    private Long id;
    private ManyToOne Visitor visitor;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private String purpose;
    private String location;

}
public getid()
{
    return id;
}
public setid(Long id)
{
    this.id=id;
}
public getvisitor()
{
    return visitor;
}
public setFname(ManyToOne Visitor)
{
    this.visitor=visitor;
}
public getentryTime(){
    return entryTime;
}
public setemail(LocalDateTime entryTime)
{
    this.entryTime=entryTime;
}
public getexitTime()
{
    return exitTime;
}
public setphone(LocalDateTime exitTime)
{
    this.exitTime=exitTime;
}
public getpurpose()
{
    return idpurpose;
}
public setidp(String purpose)
{
    this.idpurpose=idpurpose;
}
public getlocation()
{
    return location;
}
public setlocation(String location)
{
    this.location=location;
}
@PrePersist
public void validateExit(){
    entryTime=LocalDateTime.now();
    if(purpose ==null||location==null){
        throw new 
        RuntimeException("purpose and location required");
    }
    P
}