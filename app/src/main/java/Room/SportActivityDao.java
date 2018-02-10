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
public interface SportActivityDao {

    @Query("SELECT * FROM SportActivity")
    List<SportActivity> getAllActivities();

    @Insert
    void insertOne(SportActivity activity);

    @Insert
    void insertList(List<SportActivity> activityList);

    @Delete
    void deleteOne(SportActivity activity);

    @Update
    void Update(SportActivity activity);
}
