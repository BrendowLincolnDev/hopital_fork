/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadecontrolehospital.backend.Model;

/**
 *
 * @author linco
 */
public class  DatabaseConstants {
    public static Long enfermeiroId = 0L;
    
    public static Long getModelId(ModelKey key){
        
        switch (key) {
            case Enfermeiro:
                return DatabaseConstants.enfermeiroId =+ 1L;
                
            default:
                return (Long) 0L;
        }
        
    }
}


