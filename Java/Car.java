class Car {
     private Integer id;
    private String license;
    private Account driver;
    private Integer passegenger;

    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }


    //nota: estos metodos permite alterar PRIVATE INTEGER PASSENGER

    void printDataCar() {
        if(passegenger != null){//DIF DE NULL PARA QUE SE PUEDA IMPRIMIR
            System.out.println("License: " + license + " Name Driver: " + driver.name + " Passengers: " + passegenger);
        }
        
    }


    public Integer getPassenger(){
        return passegenger;
    }

    public void setPassenger(Integer passenger) {
        if(passenger == 4){
            this.passegenger = passenger;
        }else{
            System.out.println("Necesitas asignar 4 pasajeros");
        }
    }

     /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the license
     */
    public String getLicense() {
        return license;
    }

    /**
     * @param license the license to set
     */
    public void setLicense(String license) {
        this.license = license;
    }

    /**
     * @return the driver
     */
    public Account getDriver() {
        return driver;
    }

    /**
     * @param driver the driver to set
     */
    public void setDriver(Account driver) {
        this.driver = driver;
    }

    
}

//NOTA: EL METODO PUBLICO LO PUEDE LLAMR FUERA DE LA CLASE
//NOTA: CON EL ENCAPSULAMIENTO ESCONSO EL DATO
//CLASES = COMP ATRIB Y METODOS
//NOTA: POLIMORFIRMOS = ES UN METODO QUE SE COMPARTE ENTRE MUCHAS CLASES Y CADA CLASE DA EL COMP QUE ELLA NECESITA
//POLIMORFIRMOS = CONSTRUIR METODOS CON EL ISMO NOMBRE PERO CON COMPOR DIFERENTE
//CONSTRUCTOR = PARA MANIPULAR LOS DATOS