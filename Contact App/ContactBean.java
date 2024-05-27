
import java.io.Serializable;

public class ContactBean implements Comparable, Serializable {

    private String name;
    private String email;
    private String phonenumber;

    public ContactBean(String name, String email, String phonenumber) {
        this.name = name;
        this.email = email;
        this.phonenumber = phonenumber;
    }

    public ContactBean() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        if (obj instanceof ContactBean) {

            ContactBean b = (ContactBean) obj;

            if (this.name.equals(b.name) && this.email.equals(b.email) && this.phonenumber.equals(b.phonenumber)) {
                return true;
            }

        }
        return false;

    }

    @Override
    public int hashCode() {
        return (name + email + phonenumber).hashCode();
    }

    @Override
    public String toString() {
        return "name : " + name + " email:" + email + " phonenumber: " + phonenumber;
    }

    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        if (o instanceof ContactBean) {
            ContactBean b = (ContactBean) o;

            return this.getName().compareTo(b.getName());

        }
        throw new IllegalArgumentException("invalid object passed");
    }

}
