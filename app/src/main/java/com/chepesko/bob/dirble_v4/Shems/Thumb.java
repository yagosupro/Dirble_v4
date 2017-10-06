
package com.chepesko.bob.dirble_v4.Shems;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Thumb {

    @SerializedName("url")
    @Expose
    private Object url;

    public Object getUrl() {
        return url;
    }

    public void setUrl(Object url) {
        this.url = url;
    }

}
