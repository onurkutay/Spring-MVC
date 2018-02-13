/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sprhib.dao;

import java.io.Serializable;
import java.util.List;

import com.sprhib.model.Contact;

/**
 * http://www.mballem.com/
 * @author Marcio Ballem
 */
public interface IContactDao<T extends Serializable> {
    
    void save(Contact contact);
    
    List<Contact> findAll();
    
    Contact findByName(String firstName, String lastName);
    
    List<Contact> findByFirstName(String firstName);
}
