package com.dxc.learning.demoapp.Controllers;

import java.time.LocalDate;

import java.util.List;

import javax.sound.sampled.Line;

import com.dxc.learning.demoapp.model.Person;
import com.dxc.learning.demoapp.services.PersonService;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PersonController {


    @Autowired
    private PersonService personService;

    @Autowired
    private ModelMapper modelMapper;


    @GetMapping("/person")
    public ResponseEntity<List<Person>> getAllPersons(){
        List<Person> persons=personService.getAllPersons();
        return ResponseEntity.status(HttpStatus.OK).body(persons);
    }
    
    @PostMapping("/pesron")
    public Person createPerson(@RequestBody Person newPerson){
        person.setCreationDate(LocalDate.now());
        return personService.createPerson(newPerson);
    }

    @GetMapping("/person/{id}")
    public Person getpersonById(@PathVariable int id) {
        return personService.getPersonById(id);
    }

    @PutMapping("/person/{id}")
   public Person updatePerson(@RequestBody Person person, @PathVariable Integer id) {  
    return personService.updatePerson(person);
   }

   @DeleteMapping("/person/{id}")
  public void deletePerson(@PathVariable Integer id) {
    personService.deletePerson(id);
}
