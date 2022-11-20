class UberPool extends Car{
String brand;
String model;


    //PONEMOS EL METODO CONSTRUCTOR QUE COSINCIDE CON LA CLASE PADRE
public UberPool(String license, Account driver,String brand, String model){
    super(license,driver);
    this.brand = brand;
    this.model = model;

    
}

}
//nota: extend nos trate todos los metodos y atributos de la lcase car = padre