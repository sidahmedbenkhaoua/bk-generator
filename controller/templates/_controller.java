package app.<%= app %>.controller;

import app.<%= app %>.commun.controller.GenericController;
import app.<%= app %>.commun.repository.GenericService;
import app.<%= app %>.model.referential.<%= entity %>;
import app.<%= app %>.service.<%= entity %>Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by bk-generator
 */

@Controller
@RequestMapping("/protected/<%= entity %>Controller")
public class CourseController extends GenericController< <%= entity %>> {


    @Autowired
    private  <%= entity %>Service service;

    @Override
    public GenericService<<%= entity %>> getGenericService() {
        return service;
    }
}
