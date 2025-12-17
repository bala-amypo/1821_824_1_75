import.jakarta.persistence.Entity;
import.jakarta.persistence.Id;
import.jakarta.persistence.PrePersist;

@Entity
public class Visitor{
    @Id
    private Long id;
    private ManyToOne Visitor visitor;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private String purpose;
    private String location;


public Long getid()
{
    return id;
}
public void setid(Long id)
{
    this.id=id;
}
public ManyToOne getvisitor()
{
    return visitor;
}
public  void setFname(ManyToOne Visitor)
{
    this.visitor=visitor;
}
public  LocalDateTime getentryTime(){
    return entryTime;
}
public void setemail(LocalDateTime entryTime)
{
    this.entryTime=entryTime;
}
public LocalDateTime getexitTime()
{
    return exitTime;
}
public void setphone(LocalDateTime exitTime)
{
    this.exitTime=exitTime;
}
public String getpurpose()
{
    return idpurpose;
}
public void setidp(String purpose)
{
    this.idpurpose=idpurpose;
}
public String getlocation()
{
    return location;
}
public void setlocation(String location)
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
    @PreUpdate
    public void validateExit(){
        if(exitTime !=null && exitTime.isBefore(entryTime)){
            throw new
            RuntimeException("exitTime must be after entryTime");
        }
    }
}
}