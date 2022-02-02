package com.dxc.learning.demoapp.services;

import java.util.List;



import com.dxc.learning.demoapp.model.Person;

public interface PersonService {

    public Person getPersonById(int id);

    public Person getPersonByEmail(String email);

    public Person createPerson(Person person);

    public Person updatePerson(Person person);

    public Person deletePerson(int id);

    public List<Person> getAllPersons();
    
}
