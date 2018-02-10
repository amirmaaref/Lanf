package com.amirmaaref313.lanf_e.Exersices;

import android.widget.TextView;

/**
 * Created by amirhossein on 2/10/18.
 */

public interface ListExersicesMethod {
    public String getTextContent(int position);
    public void initilizeExersicesListView();
    void startTextActivity(String Content);
    public String[] titles={
            "ورزش های احتقان زدایی"
            ,"ورزش های اندام فوقانی",
            "تنفس شکمی",
            "ورزش های گردن",
            "ورزش های شانه",
            "ورزش های دست",
            "ورزش های بازو و دست ها",
            "ورزش با دسته جارو",
            "ورزش با توپ نرم",
            "تنفس شکمی ۲",
            "به هم فشردن انگشتان",
            "باز کردن انگشتان از هم",
            "قوس دار کردن مچ پا",
            "چرخش مچ پا",
            "دوچرخه",
            "لغزاندن پاشنه پا",
            "لمس زانو و دست",
            "بلند کردن کپل"};
}
