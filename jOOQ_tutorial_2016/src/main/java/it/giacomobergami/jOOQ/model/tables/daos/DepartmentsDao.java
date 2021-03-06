/**
 * This class is generated by jOOQ
 */
package it.giacomobergami.jOOQ.model.tables.daos;


import it.giacomobergami.jOOQ.model.tables.Departments;
import it.giacomobergami.jOOQ.model.tables.records.DepartmentsRecord;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DepartmentsDao extends DAOImpl<DepartmentsRecord, it.giacomobergami.jOOQ.model.tables.pojos.Departments, String> {

    /**
     * Create a new DepartmentsDao without any configuration
     */
    public DepartmentsDao() {
        super(Departments.DEPARTMENTS, it.giacomobergami.jOOQ.model.tables.pojos.Departments.class);
    }

    /**
     * Create a new DepartmentsDao with an attached configuration
     */
    public DepartmentsDao(Configuration configuration) {
        super(Departments.DEPARTMENTS, it.giacomobergami.jOOQ.model.tables.pojos.Departments.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(it.giacomobergami.jOOQ.model.tables.pojos.Departments object) {
        return object.getDeptNo();
    }

    /**
     * Fetch records that have <code>dept_no IN (values)</code>
     */
    public List<it.giacomobergami.jOOQ.model.tables.pojos.Departments> fetchByDeptNo(String... values) {
        return fetch(Departments.DEPARTMENTS.DEPT_NO, values);
    }

    /**
     * Fetch a unique record that has <code>dept_no = value</code>
     */
    public it.giacomobergami.jOOQ.model.tables.pojos.Departments fetchOneByDeptNo(String value) {
        return fetchOne(Departments.DEPARTMENTS.DEPT_NO, value);
    }

    /**
     * Fetch records that have <code>dept_name IN (values)</code>
     */
    public List<it.giacomobergami.jOOQ.model.tables.pojos.Departments> fetchByDeptName(String... values) {
        return fetch(Departments.DEPARTMENTS.DEPT_NAME, values);
    }

    /**
     * Fetch a unique record that has <code>dept_name = value</code>
     */
    public it.giacomobergami.jOOQ.model.tables.pojos.Departments fetchOneByDeptName(String value) {
        return fetchOne(Departments.DEPARTMENTS.DEPT_NAME, value);
    }
}
