package com.topicos.topicosandroid.dao;

import com.topicos.topicosandroid.api.ApiRequest;
import com.topicos.topicosandroid.domain.Entity;
import com.topicos.topicosandroid.domain.User;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Pablo Gabriel on 31/10/2015.
 */
public abstract class GenericDao<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private Class<T> clazz;

    public void setClazz(final Class<T> clazz) {
        this.clazz = clazz;
    }

    public List<T> get(User user) {
        List<T> list = new ArrayList<>();
        try {
            for (Map<String, String> map : new ApiRequest(clazz.getSimpleName(), "GET", Entity.keys()).execute().get()) {
                Entity entity = new Entity();
                entity.setId(map.get("id"));

                list.add(clazz.cast(entity));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

}
