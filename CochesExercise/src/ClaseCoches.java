public class ClaseCoches
  {
    public static void main(String[] args)
    {
     
      //INSTANCIAMOS LOS COCHES DENTRO DEL VOID PRINCIPAL
      Coche coche1 = new Coche();
      Coche coche2 = new Coche();
      Coche coche3 = new Coche();
      Coche coche4 = new Coche();
    
   
      
      //ASIGNAMOS LOS ATRIBUTOS A CADA COCHE.
      coche1.marca = "Mazda";
      coche1.modelo = "CX5 2019";
      coche1.color = "Gris";
      coche1.numeroDePuertas = 4;
      coche1.cuentaKilometros = 100;
      coche1.velocidad = 0;
       coche1.precio = 200000;
      coche1.placa ="P 536FPL";
      coche1.arrancado = false;
      
       coche2.marca = "Honda";
      coche2.modelo = "Civic Type R 2019";
      coche2.color = "Negro";
      coche2.numeroDePuertas = 4;
      coche2.cuentaKilometros = 150;
      coche2.velocidad = 0;
      coche2.precio = 250000;
      coche2.placa ="P 953VCJ";
      coche2.arrancado = true;
      
      coche3.marca = "Aston Martin ";
      coche3.modelo = "Vantaje 2019";
      coche3.color = "Blanco";
      coche3.numeroDePuertas = 2;
      coche3.cuentaKilometros = 1000;
      coche3.velocidad = 0;
      coche3.precio = 1200000;
      coche3.placa ="P 640LKA";
      coche3.arrancado = false;
      
      
      coche4.marca = "Toyota";
      coche4.modelo = "Fortuner 2019";
      coche4.color = "Negro";
      coche4.numeroDePuertas = 4;
      coche4.cuentaKilometros = 500;
      coche4.velocidad = 0;
      coche4.precio = 300000;
      coche4.placa ="P 862GGG";
      coche4.arrancado = true;
      
    
      
      
      
   
        /*DESPLEGAMOS EN PANTALLA LOS DATOS DEL COCHE 1, Y ASI SUSECIVAMENTE 
            PARA LOS DEMÁS COCHES
      */
      
         System.out.println("\t\n============ COCHE # 1 ============\t\n");
      //COCHE 1  
      System.out.println("Marca: " +coche1.marca);
      System.out.println("Modelo: " + coche1.modelo);
      System.out.println("Color: " + coche1.color);
      System.out.println("No. de Puertas: " + coche1.numeroDePuertas);
      System.out.println("KM Recorridos: "+coche1.cuentaKilometros);
      System.out.println("Velocidad: " +coche1.velocidad);
       System.out.println("Precio: Q." +coche1.precio);
        System.out.println("Placa: " +coche1.placa);
      System.out.println("¿Encendido?: " + coche1.arrancado);
      
      
       
         System.out.println("\t\n============ COCHE # 2 ============\t\n");
       
         //COCHE 2 
         System.out.println("Marca: " +coche2.marca);
      System.out.println("Modelo: " + coche2.modelo);
      System.out.println("Color: " + coche2.color);
      System.out.println("No. de Puertas: " + coche2.numeroDePuertas);
      System.out.println("KM Recorridos: "+coche2.cuentaKilometros);
      System.out.println("Velocidad: " +coche2.velocidad);
        System.out.println("Precio: Q." +coche2.precio);
        System.out.println("Placa: " +coche2.placa);
      System.out.println("¿Encendido?: " + coche2.arrancado);
      
      
         System.out.println("\t\n============ COCHE # 3 ============\t\n");
      
         //COCHE 3  
         System.out.println("Marca: " +coche3.marca);
      System.out.println("Modelo: " + coche3.modelo);
      System.out.println("Color: " + coche3.color);
      System.out.println("No. de Puertas: " + coche3.numeroDePuertas);
      System.out.println("KM Recorridos: "+coche3.cuentaKilometros);
      System.out.println("Velocidad: " +coche3.velocidad);
        System.out.println("Precio: Q." +coche3.precio);
        System.out.println("Placa: " +coche3.placa);
      System.out.println("¿Encendido?: " + coche3.arrancado);
      
  
         System.out.println("\t\n============ COCHE # 4 ============\t\n");
      
         //COCHE 4  
      System.out.println("Marca: " +coche4.marca);
      System.out.println("Modelo: " + coche4.modelo);
      System.out.println("Color: " + coche4.color);
      System.out.println("No. de Puertas: " + coche4.numeroDePuertas);
      System.out.println("KM Recorridos: "+coche4.cuentaKilometros);
      System.out.println("Velocidad: " +coche4.velocidad);
        System.out.println("Precio: Q." +coche4.precio);
        System.out.println("Placa: " +coche4.placa);
      System.out.println("¿Encendido?: " + coche4.arrancado);
      
      
      
  //==============================LLAMANDO A LOS MÉTODOS DENTRO DE LA CLASE COCHE ==========================================================
      //COCHE 1
  
         System.out.println("\t\n============ COCHE #1 ============\t\n");
      coche1.arrancar();
      System.out.println(coche1.arrancado);
      coche1.acelerar();
      System.out.println(coche1.velocidad);
      coche1.acelerar();
      System.out.println(coche1.velocidad);    
      coche1.acelerar();
      System.out.println(coche1.velocidad);    
      coche1.frenar();
      System.out.println(coche1.velocidad);    
      coche1.frenar();
      System.out.println(coche1.velocidad);    
      coche1.frenar();
      System.out.println(coche1.velocidad);
      coche1.parar();
      System.out.println(coche1.arrancado);
      coche1.consultarCuentaKilometros();
    
     
         System.out.println("\t\n============ COCHE #2 ============\t\n");
        //COCHE 2
      coche2.arrancar();
      System.out.println(coche2.arrancado);
      coche2.acelerar();
      System.out.println(coche2.velocidad);
      coche2.acelerar();
      System.out.println(coche2.velocidad);    
      coche2.acelerar();
      System.out.println(coche2.velocidad);    
      coche2.frenar();
      System.out.println(coche2.velocidad);    
      coche2.frenar();
      System.out.println(coche2.velocidad);    
      coche2.frenar();
      System.out.println(coche2.velocidad);
      coche2.parar();
      System.out.println(coche2.arrancado);
      coche2.claxon();
      coche2.consultarCuentaKilometros();
    
  
         System.out.println("\t\n============ COCHE #3 ============\t\n");   
        //COCHE 3
      coche3.arrancar();
      System.out.println(coche3.arrancado);
      coche3.acelerar();
      System.out.println(coche3.velocidad);
      coche3.acelerar();
      System.out.println(coche3.velocidad);    
      coche3.acelerar();
      System.out.println(coche3.velocidad);    
      coche3.frenar();
      System.out.println(coche3.velocidad);    
      coche3.frenar();
      System.out.println(coche3.velocidad);    
      coche3.frenar();
      System.out.println(coche3.velocidad);
      coche3.parar();
      System.out.println(coche3.arrancado);
    
      coche3.consultarCuentaKilometros();
    
             
         System.out.println("\t\n============ COCHE #4 ============\t\n");
      
        //COCHE 4
      coche4.arrancar();
      System.out.println(coche4.arrancado);
      coche4.acelerar();
      System.out.println(coche4.velocidad);
      coche4.acelerar();
      System.out.println(coche4.velocidad);    
      coche4.acelerar();
      System.out.println(coche4.velocidad);    
      coche4.frenar();
      System.out.println(coche4.velocidad);    
      coche4.frenar();
      System.out.println(coche4.velocidad);    
      coche4.frenar();
      System.out.println(coche4.velocidad);
      coche4.parar();
      System.out.println(coche4.arrancado);
      coche4.claxon();
      coche4.consultarCuentaKilometros();
    
      
    
    }
  }

