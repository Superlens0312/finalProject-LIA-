package finalprojectpart2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenny Manset
 */
 /** 
This class defines an address using a street, 
city, state, and zipcode. 
*/ 
public class Address 
{ 
private String street; 
private String city; 
private String state; 
private String zip; 
/** 
Constructor 
@param road Describes the street number and name. 
@param town Describes the city. 
@param st Describes the state. 
@param zipCode Describes the zip code. 
*/ 
public Address(String road, String town, String st, 
String zipCode) 
{ 
street = road; 
city = town; 
state = st; 
zip = zipCode; 
 }
/** 
The toString method 
@return Information about the address. 
*/ 
public String toString() 
{ 
return (street + ", " + city + 
", " + state + " " + zip); 
} 
} 