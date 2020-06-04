package motherbird.dto;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "teams")
public class Team {

    public Team() {

    }

    public Team(Long id, String name, User leader, Long activityId, Integer memberLimit, String description) {
        this.id = id;
        this.name = name;
        this.leader = leader;
        this.activityId = activityId;
        this.memberLimit = memberLimit;
        this.description = description;
    }

    @DatabaseField(id = true, columnName = "team_id")
    private Long id;
    @DatabaseField(canBeNull = false, columnName = "team_name")
    private String name;
    @DatabaseField(canBeNull = false, foreign = true, columnName = "leader_id")
    private User leader;
    @DatabaseField(canBeNull = false, columnName = "activity_id")
    private Long activityId;
    @DatabaseField(columnName = "member_limit")
    private Integer memberLimit;
    @DatabaseField(columnName = "team_description")
    private String description;

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

    public User getLeader() {
        return leader;
    }

    public void setLeader(User leader) {
        this.leader = leader;
    }

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public Integer getMemberLimit() {
        return memberLimit;
    }

    public void setMemberLimit(Integer memberLimit) {
        this.memberLimit = memberLimit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
