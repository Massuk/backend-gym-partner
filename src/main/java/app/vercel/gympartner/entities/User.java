package app.vercel.gympartner.entities;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;
    @Column(name = "name", length = 50, nullable = false)
    private String name;
    @Column(name = "lastname", length = 50, nullable = false)
    private String lastname;
    @Column(name = "gender", length = 50, nullable = false)
    private String gender;
    @Column(name = "age", nullable = false)
    private int age;
    @Column(name = "birthDate", nullable = false)
    private LocalDate birthDate;
    @Column(name = "cellphone", nullable = false)
    private int cellphone;
    @Column(name = "email", length = 100, nullable = false)
    private String email;
    @Column(name = "dni", length = 8,nullable = false)
    private String dni;
    @Column(name = "status", nullable = false)
    private boolean status;
    @ManyToOne
    @JoinColumn(name = "idRole")
    private Role role;

    public User() {
    }
    public User(int idUser, String name, String lastname, String gender, int age, LocalDate birthDate, int cellphone, String email, String dni, boolean status, Role role) {
        this.idUser = idUser;
        this.name = name;
        this.lastname = lastname;
        this.gender = gender;
        this.age = age;
        this.birthDate = birthDate;
        this.cellphone = cellphone;
        this.email = email;
        this.dni = dni;
        this.status = status;
        this.role = role;
    }

    public int getIdUser() {
        return idUser;
    }
    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
    public int getCellphone() {
        return cellphone;
    }
    public void setCellphone(int cellphone) {
        this.cellphone = cellphone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public Role getRole() {
        return role;
    }
    public void setRole(Role role) {
        this.role = role;
    }
}
