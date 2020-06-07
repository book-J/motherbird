package motherbird.dto;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;

@DatabaseTable
public class Activity {

    @DatabaseField(id = true, columnName = "activity_id")
    private Long id;
    @DatabaseField(canBeNull = false, columnName = "activity_title")
    private String title;
    @DatabaseField(columnName = "image_path")
    private String imagePath;
    @DatabaseField(canBeNull = false)
    private String category;
    @DatabaseField
    private String location;
    @DatabaseField(canBeNull = false)
    private String host;
    @DatabaseField(canBeNull = false)
    private String link;
    @DatabaseField
    private String description;
    @DatabaseField(canBeNull = false, columnName = "start_date")
    private Date startDate;
    @DatabaseField(canBeNull = false, columnName = "end_data")
    private Date endDate;

    public Activity() {

    }

    public Activity(Long id, String title, String imagePath, String category, String location, String host, String link, Date startDate, Date endDate) {
        this.id = id;
        this.title = title;
        this.imagePath = imagePath;
        this.category = category;
        this.location = location;
        this.host = host;
        this.link = link;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
