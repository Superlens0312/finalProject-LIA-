/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectpart2;

/**
 *
 * @author Lenny Manset
 */
/** 
This class defines a person by name and address. 
*/ 
public class Person
{ 
private String lastName; 
private String firstName; 
private Address home; 


/** 
Constructor 
@param last The person's last name. 
@param first The person's first name. 
@param residence The person's address.
*/  
public Person(String last, String first, 
Address residence) 
{ 
lastName = last; 
firstName = first; 
home = residence; 
} 
/** 
The toString method 
@return Information about the person. 
*/ 
public String toString() 
{ 
return(firstName + " " + lastName + 
", " + home.toString()); 
    } 
}
