package com.rubypaper.persistence.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmployeeDAO {

    // JDBC 변수 선언
    private Connection conn = null;
    private PreparedStatement stmt = null;
    private ResultSet rs = null;

    // S_EMP 테이블 관련 SQL 구문
    private String INSERT_EMP =
            "insert into s_emp(id, name, start_date, title, dept_name, salary) " +
            "values((select nvl(max(id), 0) + 1 from s_emp), ?, ?, ?, ?, ?)";
    private String LIST_EMP =
            "select id, name, start_date, title, dept_name, slary " +
            "from s_emp order by name";
}
