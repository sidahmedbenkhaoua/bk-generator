package app.<%= app %>.service;

import dz.software.<%= app %>.commun.dao.Dao;
import dz.software.<%= app %>.commun.repository.GenericService;
import dz.software.<%= app %>.model.referential.<%= entity %>;
import dz.software.<%= app %>.repository.<%= entity %>Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by bk-generator
 */

@Service
public class <%= entity %>Service extends GenericService<<%= entity %>> {

    @Autowired
    private <%= entity %>Repository repository;


    @Override
    public Dao<<%= entity %>, String> getDao() {
        return repository;
    }

    @Override
    public Page<<%= entity %>> executeQueryFindByName(int page, int maxResults, String name) {
        final PageRequest pageRequest = new PageRequest(page, maxResults, sortByNameASC());
        return repository.findByIdLike(pageRequest, "%" + name + "%");
    }


}
