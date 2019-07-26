package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2019/7/25.
 */

public class Now {
    @SerializedName("temp")
    public String temperature;
    @SerializedName("cond")
    public More  more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
