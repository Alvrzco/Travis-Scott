package com.example.springboot;
 
import java.util.ArrayList;
import java.util.List;
 
import com.example.springboot.Local;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class OcioCorunaController {
 
 @GetMapping(value = "/locales")  
 public List<Local> getLocal()
 {
  List<Local> listOfLocales = new ArrayList<Local>();
  listOfLocales=createLocalList();
  return listOfLocales;
 }
 
  @GetMapping(value = "/locales/{id}")  
 public Local getLocalById(@PathVariable int id) //Get by ID!!
 {
  List<Local> listOfLocales = new ArrayList<Local>();
  listOfLocales=createLocalList();
 
  for (Local locales: listOfLocales) {
   if(locales.getId()==id)
    return locales;
  }
 
  return null;
 }
 
// Create locales list
 public List<Local> createLocalList()
 {
  Local Sala_Pelicano=new Local(1, "Sala Pelicano", "Jueves, Viernes, Sabado");
  Local My_Dux=new Local(2, "My by Dux","Jueves, Viernes, Sabado, Domingo");
  Local Amura=new Local(3, "Amura","Miercoles, Domingo");
  Local Brit=new Local(4, "The Brit Wave","Jueves, Viernes, Sabado");
  Local Inn_Club=new Local(5, "Inn Club", "Lunes, Martes, Miercoles");
  Local Anden=new Local(6, "Anden Beach Club", "Jueves, Viernes, Sabado, Domingo");
  
  
  List<Local> listOfLocales = new ArrayList<Local>();
  listOfLocales.add(Sala_Pelicano);
  listOfLocales.add(My_Dux);
  listOfLocales.add(Amura);
  listOfLocales.add(Brit);
  listOfLocales.add(Inn_Club);
  listOfLocales.add(Anden);
  
 
 return listOfLocales;
 }
}
