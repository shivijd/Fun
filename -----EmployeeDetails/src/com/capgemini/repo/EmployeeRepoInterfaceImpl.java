package com.capgemini.repo;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.capgemini.beans.Employee;

public class EmployeeRepoInterfaceImpl implements EmployeeRepoInterface {
	HashMap<Integer, Employee> hm = new HashMap<>();

	@Override
	public boolean save(Employee employee) {
		if (hm.containsKey(employee.getId())) {
			return false;
		} else {
			hm.put(employee.getId(), employee);
			return true;
		}

	}

	@Override
	public List<Employee> findByName(String name) {
		List<Employee> list = new ArrayList<>();
		for (java.util.Map.Entry<Integer, Employee> entry : hm.entrySet()) {
			if (entry.getValue().getName().equals(name))
				;
			list.add(entry.getValue());
		}

		return list;
	}

	
	}

}