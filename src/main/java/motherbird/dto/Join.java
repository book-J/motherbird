package motherbird.dto;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable
public class Join {

    public Join (){

    }

    public Join(User user, Team team, boolean isHired) {
        this.user = user;
        this.team = team;
        this.isHired = isHired;
    }

    @DatabaseField(id = true, foreign = true, columnName = "user_id")
    private User user;
    @DatabaseField(id = true, foreign = true, columnName = "team_id")
    private Team team;
    @DatabaseField(canBeNull = false, columnName = "is_hired")
    private boolean isHired;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public boolean isHired() {
        return isHired;
    }

    public void setHired(boolean hired) {
        isHired = hired;
    }
}
