/**
 * This class is generated by jOOQ
 */
package it.giacomobergami.jOOQ.model;


import it.giacomobergami.jOOQ.model.tables.CurrentDeptEmp;
import it.giacomobergami.jOOQ.model.tables.Departments;
import it.giacomobergami.jOOQ.model.tables.DeptEmp;
import it.giacomobergami.jOOQ.model.tables.DeptEmpLatestDate;
import it.giacomobergami.jOOQ.model.tables.DeptManager;
import it.giacomobergami.jOOQ.model.tables.Salaries;
import it.giacomobergami.jOOQ.model.tables.Titles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Employees extends SchemaImpl {

    private static final long serialVersionUID = 1267630218;

    /**
     * The reference instance of <code>employees</code>
     */
    public static final Employees EMPLOYEES = new Employees();

    /**
     * VIEW
     */
    public final CurrentDeptEmp CURRENT_DEPT_EMP = it.giacomobergami.jOOQ.model.tables.CurrentDeptEmp.CURRENT_DEPT_EMP;

    /**
     * The table <code>employees.departments</code>.
     */
    public final Departments DEPARTMENTS = it.giacomobergami.jOOQ.model.tables.Departments.DEPARTMENTS;

    /**
     * The table <code>employees.dept_emp</code>.
     */
    public final DeptEmp DEPT_EMP = it.giacomobergami.jOOQ.model.tables.DeptEmp.DEPT_EMP;

    /**
     * VIEW
     */
    public final DeptEmpLatestDate DEPT_EMP_LATEST_DATE = it.giacomobergami.jOOQ.model.tables.DeptEmpLatestDate.DEPT_EMP_LATEST_DATE;

    /**
     * The table <code>employees.dept_manager</code>.
     */
    public final DeptManager DEPT_MANAGER = it.giacomobergami.jOOQ.model.tables.DeptManager.DEPT_MANAGER;

    /**
     * The table <code>employees.employees</code>.
     */
    public final it.giacomobergami.jOOQ.model.tables.Employees EMPLOYEES_ = it.giacomobergami.jOOQ.model.tables.Employees.EMPLOYEES_;

    /**
     * The table <code>employees.salaries</code>.
     */
    public final Salaries SALARIES = it.giacomobergami.jOOQ.model.tables.Salaries.SALARIES;

    /**
     * The table <code>employees.titles</code>.
     */
    public final Titles TITLES = it.giacomobergami.jOOQ.model.tables.Titles.TITLES;

    /**
     * No further instances allowed
     */
    private Employees() {
        super("employees", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            CurrentDeptEmp.CURRENT_DEPT_EMP,
            Departments.DEPARTMENTS,
            DeptEmp.DEPT_EMP,
            DeptEmpLatestDate.DEPT_EMP_LATEST_DATE,
            DeptManager.DEPT_MANAGER,
            it.giacomobergami.jOOQ.model.tables.Employees.EMPLOYEES_,
            Salaries.SALARIES,
            Titles.TITLES);
    }
}
