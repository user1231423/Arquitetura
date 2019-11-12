/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.uma.ctesp.student;

/**
 *
 * @author joaogouveia
 */
public class Student implements Comparable<Student>{
    private int number;
    private String name;
    
    @Override
    public boolean equals (Object obj){
        if(this == obj){
            return true;
        }else if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        Student other =(Student) obj;
        return number == other.number && name == other.name;
    }
    
    @Override
    public int compareTo(Student obj) {
        return 0;
    }
    
}
