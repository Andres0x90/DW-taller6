/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dw.taller6;

/**
 *
 * @author Andres
 */
public class DWTaller6 
{
    public static int mayor(int[] array)
    {
        int numMayor = array[0];
        
        for (int elemento: array)
        {
            if (elemento > numMayor)
                numMayor = elemento;
        }
            
        return numMayor;
    }
    
    public static boolean esPalindromo(String palabra)
    {
        StringBuilder sbuilder = new StringBuilder();
        sbuilder.append(palabra);
        
        return sbuilder.reverse().toString().equalsIgnoreCase(palabra);
    }
    
    public static int multiplicacion(int a, int b)
    {
        int resultado = 0;
        for (int i=1; i<=b; i++)
        {
            resultado +=a;
        }
        
        return resultado;
    }
    
    public static int potenciacion(int n, int m)
    {
        int resultado=0;
        
        if (m == 0)
            resultado = 1;
        else if (m == 1)
            resultado = n;
        else
        {
            resultado = 0;
            int multiplicacion = n;
            for (int i=1; i<m; i++)
            {
                resultado = 0;
                for (int j=1; j<=n; j++)
                {
                    resultado += multiplicacion;
                }
                multiplicacion = resultado;
            }
        }
        
        return resultado;
    }
    
    public static Estudiante[] crearEstudiantes()
    {
        Estudiante[] estudiantes = new Estudiante[5];
        float matricula = 1800000;
        estudiantes[0] = new Estudiante("10057883", "Carlos", "Perez", "Carrera 14B");
        estudiantes[0].setBecado(true);
        estudiantes[0].asignarMatricula(matricula);
        
        estudiantes[1] = new Estudiante("17886123", "Juan", "Caicedo", "Calle 54A");
        estudiantes[1].asignarMatricula(matricula);
        
        estudiantes[2] = new Estudiante("75311145", "Santiago", "Alvarez", "Calle 21");
        estudiantes[2].asignarMatricula(matricula);
        
        estudiantes[3] = new Estudiante("48883341", "Andres", "Cano", "Carrera 72F");
        estudiantes[3].asignarMatricula(matricula);
        
        estudiantes[4] = new Estudiante("91154783", "Esteban", "Guzman", "Carrera 32");
        estudiantes[4].setBecado(true);
        estudiantes[4].asignarMatricula(matricula);
        
        return estudiantes;
    }
    
    public static Tren[] crearTrenes()
    {
        Tren[] trenes = new Tren[5];
        trenes[0] = new Tren("001", "Henshel", "CK1", 2015);
        trenes[1] = new Tren("002", "Kawasaki", "G7-P", 2018);
        
        trenes[2] = new Tren("003", "Bombardier", "Z4", 2022);
        trenes[2].setAltaVelocidad(true);
        trenes[3] = new Tren("004", "Alstom", "AAD", 2017);
        trenes[3].setAltaVelocidad(true);
        
        trenes[4] = new Tren("005", "Hitachi", "K321", 2020);
        
        return trenes;
    }

    public static void main(String[] args) 
    {
        
    }
    
}
