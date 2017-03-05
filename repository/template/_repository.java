package app.<%= app %>.repository;

import app.<%= app %>.commun.dao.Dao;
import app.<%= app %>.model.referential.Alveolus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 *  Created by bk-generator
 */
public interface <<%= entity %>Repository extends Dao<<%= entity %>, String> {

    Page<<%= entity %>> findByIdLike(Pageable pageable, String userName);




}
