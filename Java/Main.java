class Main {
    public static void main(String[] args) {
         System.out.println("Hola Mundo");
        UberX uberX = new UberX("AMQ123", new Account("Andres Herrera", "AND123"), "Chevrolet", "Sonic");
        uberX.setPassenger(4);
        uberX.printDataCar();


         UberVan uberVan = new UberVan("FGH345", new Account("Andres Herrera", "AND123"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();
        // uberX.setPassenger(2);
        // uberX.printDataCar();

        // Car car2 = new Car();
        // car2.license = "QWE567";
        // car2.driver = "Andrea Herrera";
        // car2.passegenger = 3;
        // car2.printDataCar();
    }
}//NOTA: ENCAPSULAR = HACER QUE UN DATO SEA INVIOLABLE SE LE ASIGNE UN MODIFICADOR DE ACCESO

//cap 31 min 47