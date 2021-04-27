package com.example.springboot;
 
public class Local{
 
 int id;
 String name; 
 String apertura;
 
 public Local(int id, String name, String apertura) {
 super();
 this.id = id;
 this.name = name;
 this.apertura = apertura;
 }
 public int getId() {
 return id;
 }
 public void setId(int id) {
 this.id = id;
 }
 public String getName() {
 return name;
 }
 public void setName(String name) {
 this.name = name;
 } 
 public String getApertura() {
 return apertura;
 }
 public void setApertura(String Apertura) {
 this.apertura = apertura;
 } 
 
 
}
 
