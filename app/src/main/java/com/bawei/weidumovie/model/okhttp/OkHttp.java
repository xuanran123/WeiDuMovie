package com.bawei.weidumovie.model.okhttp;

/**
 * <p>文件描述：<p>
 * <p>作者：染<p>
 * <p>创建时间：2019/11/6<p>
 * <p>更改时间：2019/11/6<p>
 */
public class OkHttp {
    private static final OkHttp ourInstance = new OkHttp();

    public static OkHttp getInstance() {
        return ourInstance;
    }

    private OkHttp() {
    }
}