package ExpenseProject;

public class Friends{
    private String name;
    private String mobile;       
    private String address;
    private String id;
    private String pwd;
    
    /*public Friends(String name, String mobile, String address, String id, String pwd) {
         this.name = name;
         this.mobile = mobile;
         this.address = address;
         this.id = id;
        this.pwd = pwd;
    }
     public String getName() {
         return name;
     }
     public void setName(String name) {
         this.name = name;
     }
     public String getMobile() {
         return mobile;
     }
    public void setMobile(String mobile) {
         this.mobile = mobile;
    }
    public String getAddress() {
         return address;
    }
    public void setAddress(String address) {
         this.address = address;
     }
     public String getId() {
         return id;
    }
     public void setId(String id) {
        this.id = id;
    }
    public String getPwd() {
         return pwd;
     }
     public void setPwd(String pwd) {
         this.pwd = pwd;
     }
    public String toString() {
       return name+"|"+mobile+"|"+address+"|"+id+"|"+pwd;
}}
*/
     public Friends(String name, String mobile, String address, String id, String pwd) {
        this.name = name;
        this.mobile = mobile;
        this.address = address;
        this.id = id;
        this.pwd = pwd;
    }
     public String toString() {
         return name + "|" + mobile + "|" + address + "|" + id + "|" + pwd;
     }
 }
