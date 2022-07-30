package com.rubypaper.persistence.jdbc;

import java.sql.Timestamp;
import java.util.List;

public class EmployeeServiceClient {
    public static void main(String[] args){
        EmployeeVO vo = new EmployeeVO();
        vo.setName("장료");
        vo.setStartDate(new Timestamp(System.currentTimeMillis()));
        vo.setTitle("장군");
        vo.setDeptName("위나라");
        vo.setSalary(2000.00);

        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.insertEmployee(vo);

        List<EmployeeVO> employeeList = employeeDAO.getEmployeeList();
        for(EmployeeVO employee : employeeList){
            System.out.println("---> " + employee.toString());
        }
    }
}
