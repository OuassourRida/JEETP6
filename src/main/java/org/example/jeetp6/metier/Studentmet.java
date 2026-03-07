package org.example.jeetp6.metier;

import org.example.jeetp6.dao.Studentdao;
import org.example.jeetp6.model.Student;

public class Studentmet {
   public Studentmet() {
   }

   private Student student  ;
   private Studentdao stdao =new Studentdao();
   public void studentappend(Student student ){
String name=student.getName();
double age=student.getAge();
stdao.studentspush(name,age);


   }

}
