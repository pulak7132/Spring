package com.pulak.springframework.petclinic.services.map;

import com.pulak.springframework.petclinic.model.BaseEntity;
import com.pulak.springframework.petclinic.services.CrudService;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AbstractMapService <T extends BaseEntity, ID extends Number> implements CrudService <T, ID>{
    protected Map<ID, T> map = new HashMap<>();
    private long keyGen = 0L;
    public Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    public T findById(ID id){
        return map.get(id);
    }

    public T save(T object){
        if(object.getId() == null){
            object.setId(getNewId());
            map.put((ID)object.getId(), object);
        }
        return object;
    }

    private Long getNewId() {
        return ++keyGen;
//        if(map.isEmpty())
//            return 1L;
//        else
//           return  Collections.max(map.keySet()) + 1L;
    }

    public void deleteById(ID id){
        map.remove(id);
    }

    public void delete(T object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }
}
