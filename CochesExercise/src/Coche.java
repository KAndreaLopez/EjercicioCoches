class Coche
{
    
       /*DEFINIMOS LOS ATRIBUTOS QUE TENDRAN LOS COCHES, EN ESTE CASO:
      -MARCA
      -MODELO
      -COLOR
      -NÚMERO DE PUERTAS
      -VELOCIDAD
      -CONTADOR DE KILÓMETROS
      -Y UNA VARIABLE TIPO BOOLEAN QUE MOSTRARÁ SI EL COCHE ESTA ARRANCADO O NO.
      */
    
  String marca;
  String modelo;
  String color;
  String placa;
  int numeroDePuertas;
  int cuentaKilometros;
  int velocidad;
  double precio;
  
  boolean arrancado;
  
  void arrancar()
  {
    arrancado = true;
  }
  
  void parar()
  {
    arrancado = false;
  }
  
  void acelerar()
  {
    velocidad = velocidad + 1;
  }
  
  void frenar()
  {
    velocidad = velocidad - 1;
  }
  
  void claxon()
  {
    System.out.println("Piiiiiiiiiiiiiiiiiip");
  }
  
  int consultarCuentaKilometros()
  {
    return cuentaKilometros;
  }
}