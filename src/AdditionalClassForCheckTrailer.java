public class AdditionalClassForCheckTrailer implements CheckTrailer{
    @Override
    public void checkTrailer(Truck[] trucks){
        System.out.println("Количество грузовиков, которым нужно проверить прицеп = " + trucks.length);
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
