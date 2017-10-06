
package com.chepesko.bob.dirble_v4.Shems;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Image {

    @SerializedName("url")
    @Expose
    private Object url;
    @SerializedName("thumb")
    @Expose
    private Thumb thumb;

    public Object getUrl() {
        return url;
    }

    public void setUrl(Object url) {
        this.url = url;
    }

    public Thumb getThumb() {
        return thumb;
    }

    public void setThumb(Thumb thumb) {
        this.thumb = thumb;
    }

}
