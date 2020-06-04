package motherbird.dto;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "users")
public class User {
    @DatabaseField(id = true, columnName = "user_id")
    private Long id;
    @DatabaseField(canBeNull = false, columnName = "user_name")
    private String name;
    @DatabaseField(columnName = "image_path")
    private String image_path;
    @DatabaseField(canBeNull = false)
    private Integer age;
    @DatabaseField(canBeNull = false, columnName = "is_male")
    private boolean isMale;
    @DatabaseField
    private String email;
    @DatabaseField(canBeNull = false)
    private String phone;
    @DatabaseField
    private String education;
    @DatabaseField
    private String interesting;

    public User() {
        // ORMLite needs a no-arg constructor
    }

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage_path() {
        return image_path;
    }

    public void setImage_path(String image_path) {
        this.image_path = image_path;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getInteresting() {
        return interesting;
    }

    public void setInteresting(String interestings) {
        this.interesting = interestings;
    }
}

