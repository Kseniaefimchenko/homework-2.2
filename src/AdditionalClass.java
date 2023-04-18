public class AdditionalClass implements Interface {

    @Override
    public void print(ServiceStation[] serviceStations) {
        System.out.println("Размер списка всех транспортов " + serviceStations.length);
        for (int i = 0; i < serviceStations.length; i++) {
            ServiceStation serviceStation = serviceStations[i];
            System.out.println("Название модели " + serviceStation.getModelName()
                    + "; Количество колес = " + serviceStation.getWheelsCount());
        }
        System.out.println();
    }
    @Override
    public void print(Car[] cars) {
        System.out.println("Размер списка машин " + cars.length);
        for (int i = 0; i < cars.length; i++) {
            Car car = cars[i];
            System.out.println("Название модели " + car.getModelName()
                    + "; Количество колес = " + car.getWheelsCount());
        }
        System.out.println();
    }

    @Override
    public void print(Truck[] trucks) {
        System.out.println("Размер списка грузовиков " + trucks.length);
        for (int i = 0; i < trucks.length; i++) {
            Truck truck = trucks[i];
            System.out.println("Название модели " + truck.getModelName()
                    + "; Количество колес = " + truck.getWheelsCount());
        }
        System.out.println();
    }

    @Override
    public void print(Bicycle[] bicycles) {
        System.out.println("Размер списка велосипедов " + bicycles.length);
        for (int i = 0; i < bicycles.length; i++) {
            Bicycle bicycle = bicycles[i];
            System.out.println("Название модели " + bicycle.getModelName()
                    + "; Количество колес = " + bicycle.getWheelsCount());
        }
        System.out.println();
    }
}
