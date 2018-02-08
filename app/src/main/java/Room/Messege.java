package Room;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by amirhossein on 2/8/18.
 */

@Entity
public class Messege {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "messege_title")
    private String title;

    @ColumnInfo(name = "messege_text")
    private String text;

    @ColumnInfo(name = "messege_status")
    private String status;

    @ColumnInfo(name = "messege_datetime")
    private String date_time;

    @ColumnInfo(name = "messege_type")
    private String type_messege;

    @ColumnInfo(name = "messege_from")
    private String from;

    @ColumnInfo(name = "messege_to")
    private String to;

    public Messege(int id, String title, String text, String status, String date_time, String type_messege, String from, String to) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.status = status;
        this.date_time = date_time;
        this.type_messege = type_messege;
        this.from = from;
        this.to = to;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate_time() {
        return date_time;
    }

    public void setDate_time(String date_time) {
        this.date_time = date_time;
    }

    public String getType_messege() {
        return type_messege;
    }

    public void setType_messege(String type_messege) {
        this.type_messege = type_messege;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    // Getters and setters are ignored for brevity,
    // but they're required for Room to work.
}
