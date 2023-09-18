/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author melian
 */
public class Empleado {
    String codigo, nombre;
    double horas, valor, retencion, salarioBruto;
    
    //constructor
    public Empleado(String codigo, String nombre, double horas, double valor, double porcentaje){
        this.codigo = codigo;
        this.nombre = nombre;
        this.horas = horas;
        this.valor = valor;
        retencion = porcentaje/100;
    }
    
    public double salarioBruto(){
        return (horas*valor);
    }
    public double salarioNeto(){
        salarioBruto = this.salarioBruto();
        return (salarioBruto - (salarioBruto*retencion));
    }
    
}
