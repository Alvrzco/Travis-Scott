package com.example.springboot;
 
import java.util.ArrayList;
import java.util.List;
 
import com.example.springboot.City;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class CitiesController {
 
 @GetMapping(value = "/cities")  
 public List<City> getCities()
 {
  List<City> listOfCities = new ArrayList<City>();
  listOfCities=createCityList();
  return listOfCities;
 }
 
 @GetMapping(value = "/cities/{id}")  
 public City getCityById(@PathVariable int id) //Get by ID!!
 {
  List<City> listOfCities = new ArrayList<City>();
  listOfCities=createCityList();
 
  for (City cities: listOfCities) {
   if(cities.getId()==id)
    return cities;
  }
 
  return null;
 }

// Create cities list
 public List<City> createCityList()
 {
  City Santiago=new City(1, "Santiago de Compostela", "A Coruña");
  City Coruna=new City(2, "A Coruña","A Coruña");
  City Pontevedra=new City(3, "Pontevedra","Pontevedra");
  City Ourense=new City(4, "Ourense","Ourense");
  City Lugo=new City(5, "Lugo","Lugo");
  City Sanxenxo=new City(6, "Sanxenxo","Pontevedra");
  City Portosin=new City(7, "Portosin","A Coruña");
  City Betanzos=new City(8, "Betanzos","A Coruña");
  City Sada=new City(9, "Sada","A Coruña");
  City Pedrafita=new City(10, "Pedrafita do Cebreiro","Lugo");
 
  List<City> listOfCities = new ArrayList<City>();
  listOfCities.add(Santiago);
  listOfCities.add(Coruna);
  listOfCities.add(Pontevedra);
  listOfCities.add(Ourense);
  listOfCities.add(Lugo);
  listOfCities.add(Sanxenxo);
  listOfCities.add(Portosin);
  listOfCities.add(Betanzos);
  listOfCities.add(Sada);
  listOfCities.add(Pedrafita);
  return listOfCities;
 }
}
