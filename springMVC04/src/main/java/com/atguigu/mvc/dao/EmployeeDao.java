package com.atguigu.mvc.dao;

import com.atguigu.mvc.domain.Employee;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class EmployeeDao {

    private static Map<Integer, Employee> employeeMap = null;
    static {
        employeeMap = new HashMap<Integer, Employee>();
        employeeMap.put(110,new Employee(110,"张三","123@qq.com",0));
        employeeMap.put(111,new Employee(111,"晴天","456@qq.com",1));
        employeeMap.put(112,new Employee(112,"sunny","789@qq.com",1));
        employeeMap.put(113,new Employee(113,"weekend","000@qq.com",0));
        employeeMap.put(114,new Employee(114,"冬季","666@qq.com",1));

    }
    private static Integer initId = 1006;
    public void save(Employee employee){
        Integer id = employee.getId();
        if (id == null){
            id = initId ++;
        }
        employee.setId(id);
        employeeMap.put(employee.getId(),employee);
    }

    public Employee getById(Integer id){
        Employee employee = employeeMap.get(id);
        return employee;
    }

    public void deleteById(Integer id){
        Employee remove = employeeMap.remove(id);
    }

    public Collection<Employee> getAll(){
        Collection<Employee> values = employeeMap.values();
        return values;
    }
}
