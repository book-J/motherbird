package motherbird.dto;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable
public class Pick {

    public Pick() {

    }

    public Pick(User user, Activity activity) {
        this.user = user;
        this.activity = activity;
    }

    @DatabaseField(id = true, foreign = true)
    private User user;
    @DatabaseField(id = true, foreign = true)
    private Activity activity;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
}
