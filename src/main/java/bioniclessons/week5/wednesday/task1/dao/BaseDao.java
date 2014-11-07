package bioniclessons.week5.wednesday.task1.dao;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Владислав on 05.11.2014.
 */
public class BaseDao<T>  {

    private List<T> daos = new ArrayList<>();



    public List<T> getAll() {
        return daos;
    }

    public T getById(int i) {
        return daos.get(i);
    }

    public boolean add(T item) {
        return daos.add(item);
    }
}
