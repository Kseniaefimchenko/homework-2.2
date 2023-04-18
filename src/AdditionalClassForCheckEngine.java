public class AdditionalClassForCheckEngine implements CheckEngine{
    @Override
    public void checkEngine(Car[] cars){
        System.out.println("Количество машин, которым нужно проверить двигатель = " + cars.length);
        System.out.println("Название модели ");
        printServiceUpdateTyre(cars);
        System.out.println();
    }
    @Override
    public void checkEngine(Truck[] trucks){
        System.out.println("Количество грузовиков, которым нужно проверить двигатель = " + trucks.length);
        System.out.println("Название модели ");
        printServiceUpdateTyre(trucks);
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
