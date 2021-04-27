package com.example.springboot;
 
import java.util.ArrayList;
import java.util.List;
 
import com.example.springboot.Bebida;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class BebidasController {
 
 @GetMapping(value = "/bebidas")  
 public List<Bebida> getBebida()
 {
  List<Bebida> listOfBebidas = new ArrayList<Bebida>();
  listOfBebidas=createBebidaList();
  return listOfBebidas;
 }
 
  @GetMapping(value = "/bebidas/{id}")  
 public Bebida getBebidaById(@PathVariable int id) //Get by ID!!
 {
  List<Bebida> listOfBebidas = new ArrayList<Bebida>();
  listOfBebidas=createBebidaList();
 
  for (Bebida bebidas: listOfBebidas) {
   if(bebidas.getId()==id)
    return bebidas;
  }
 
  return null;
 }
 
// Create bebidas list
 public List<Bebida> createBebidaList()
 {
  Bebida Ron_Barcelo=new Bebida(1, "Ron Barcelo");
  Bebida Ginebra_Seagrams=new Bebida(2, "Seagrams");
  Bebida Beefeater=new Bebida(3, "Beefeater");
  Bebida Macallan25=new Bebida(4, "Macallan 25");
  Bebida PuertoIndias=new Bebida(5, "Puerto de Indias");
  Bebida Larios12=new Bebida(6, "Larios 12");
  
  
  List<Bebida> listOfBebidas = new ArrayList<Bebida>();
  listOfBebidas.add(Ron_Barcelo);
  listOfBebidas.add(Ginebra_Seagrams);
  listOfBebidas.add(Beefeater);
  listOfBebidas.add(Macallan25);
  listOfBebidas.add(PuertoIndias);
  listOfBebidas.add(Larios12);
  
 
 return listOfBebidas;
 }
}
