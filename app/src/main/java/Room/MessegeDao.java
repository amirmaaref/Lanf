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
public interface MessegeDao {
    @Query("SELECT * FROM Messege")
    List<Messege> getAllMesseges();

    @Insert
    void insertOne(Messege messege);

    @Insert
    void insertList(List<Messege> messegeList);

    @Delete
    void deleteOne(Messege messege);

    @Update
    void Update(Messege messege);
}
