package Room;

import android.app.Application;
import android.arch.persistence.room.Room;
import android.content.Context;
import android.os.AsyncTask;

import java.util.List;

/**
 * Created by amirhossein on 2/9/18.
 */

public class App extends Application {

    private AppDatabase appDatabase;
    private Context c;
    public App (Context con){
            appDatabase = Room.databaseBuilder(con, AppDatabase.class
                    , "a.db").build();
    }
    private class sinn extends AsyncTask<Void,Void,Void>{

        @Override
        protected Void doInBackground(Void... voids) {

            return null;
        }
    }

    public  AppDatabase getAppDatabase(){
        return appDatabase;
    }

}
