public class Main {
    public static void main(String[] args) {
        Car[] car = {
                new Car("car1", 4),
                new Car("car2", 4),
        };

        Truck[] truck = {
                new Truck("truck1", 6),
                new Truck("truck2", 8)
        };

        Bicycle[] bicycle = {
                new Bicycle("bicycle1", 2),
                new Bicycle("bicycle2", 2),
        };
// вывели отдельно каждый вид транспорта
        Interface printAll = new AdditionalClass();
        UpdateTyre updateTyre = new AdditionalClassForUpdateTyre();
        CheckTrailer checkTrailer = new AdditionalClassForCheckTrailer();
        CheckEngine checkEngine = new AdditionalClassForCheckEngine();


// вывели список всех транспортов
        ServiceStation[] serviceStations = new ServiceStation[car.length + truck.length + bicycle.length];
        for(int i = 0; i < car.length; i++){
            serviceStations[i] = car[i];
        }
        for(int i = 0; i < truck.length; i++){
            serviceStations[i + car.length] = truck[i];
        }
        for (int i = 0; i < bicycle.length; i++){
            serviceStations[i + car.length + truck.length] = bicycle[i];
        }

        printReport(printAll, car, truck, bicycle, serviceStations);
        printUpdateTrue(updateTyre,car, truck, bicycle, serviceStations);
        printCheckTrailer(checkTrailer, truck, serviceStations);
        printCheckEngine(checkEngine, car, truck, serviceStations);

    }

    private static void printReport(Interface allprint, Car[] car, Truck[] truck, Bicycle[] bicycle, ServiceStation[] serviceStations) {
        allprint.print(car);
        allprint.print(truck);
        allprint.print(bicycle);
        allprint.print(serviceStations);
    }
    private static void printUpdateTrue(UpdateTyre tyre, Car[] car, Truck[] truck, Bicycle[] bicycle, ServiceStation[] serviceStations){
        tyre.updateTyre(car);
        tyre.updateTyre(truck);
        tyre.updateTyre(bicycle);
        tyre.updateTyre(serviceStations);
    }
    private static void printCheckTrailer(CheckTrailer trailer, Truck[] truck, ServiceStation[] serviceStations) {
        trailer.checkTrailer(truck);
        trailer.checkTrailer(serviceStations);
    }
    private static void printCheckEngine(CheckEngine engine, Car[] cars, Truck[] trucks, ServiceStation[] serviceStations){
        engine.checkEngine(cars);
        engine.checkEngine(trucks);
        engine.checkEngine(serviceStations);
    }
}