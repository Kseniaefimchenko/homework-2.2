public class AdditionalClassForUpdateTyre implements UpdateTyre {
    @Override
    public void updateTyre(ServiceStation[] serviceStations) {
        System.out.println("Количество транспорта, которым нужно поменять покрышку = " + serviceStations.length);
        System.out.println("Название модели ");
        printServiceUpdateTyre(serviceStations);
            System.out.println();
    }
    @Override
    public void updateTyre(Car[] cars) {
        System.out.println("Количество машин, которым нужно поменять покрышку = " + cars.length);
        System.out.println("Название модели ");
        printServiceUpdateTyre(cars);
        System.out.println();
    }

    @Override
    public void updateTyre(Truck[] trucks) {
        System.out.println("Количество грузовиков, которым нужно поменять покрышку = " + trucks.length);
        System.out.println("Название модели ");
        printServiceUpdateTyre(trucks);
        System.out.println();
    }

    @Override
    public void updateTyre(Bicycle[] bicycles) {
        System.out.println("Количество велосипедов, которым нужно поменять покрышку = " + bicycles.length);
        System.out.println("Название модели ");
        printServiceUpdateTyre(bicycles);
        System.out.println();
    }
    private void printServiceUpdateTyre(ServiceStation[] serviceStations){
        for (int i = 0; i < serviceStations.length; i++) {
            ServiceStation serviceStation = serviceStations[i];
            System.out.println(serviceStation.getModelName()
                    + "; Количество колес = " + serviceStation.getWheelsCount());
        }
    }
}
