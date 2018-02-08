package Room;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

/**
 * Created by amirhossein on 2/8/18.
 */
@Dao
public interface ActivityDao {

    @Query("SELECT * FROM Activity")
    List<Activity> getAllActivities();

    @Insert
    void insertOne(Activity activity);

    @Insert
    void insertList(List<Activity> activityList);

    @Delete
    void deleteOne(Activity activity);

    @Update
    void Update(Activity activity);
}
