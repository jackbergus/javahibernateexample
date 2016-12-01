/**
 * This class is generated by jOOQ
 */
package it.giacomobergami.jOOQ.model.tables.pojos;


import java.io.Serializable;
import java.sql.Date;

import javax.annotation.Generated;


/**
 * VIEW
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DeptEmpLatestDate implements Serializable {

    private static final long serialVersionUID = -2017461922;

    private Integer empNo;
    private Date    fromDate;
    private Date    toDate;

    public DeptEmpLatestDate() {}

    public DeptEmpLatestDate(DeptEmpLatestDate value) {
        this.empNo = value.empNo;
        this.fromDate = value.fromDate;
        this.toDate = value.toDate;
    }

    public DeptEmpLatestDate(
        Integer empNo,
        Date    fromDate,
        Date    toDate
    ) {
        this.empNo = empNo;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public Integer getEmpNo() {
        return this.empNo;
    }

    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    public Date getFromDate() {
        return this.fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return this.toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DeptEmpLatestDate (");

        sb.append(empNo);
        sb.append(", ").append(fromDate);
        sb.append(", ").append(toDate);

        sb.append(")");
        return sb.toString();
    }
}