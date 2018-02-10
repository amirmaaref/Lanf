package Room;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by amirhossein on 2/8/18.
 */

@Database(entities = {SportActivity.class,Messege.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract SportActivityDao activityDao();
    public abstract MessegeDao messegeDao();
}