public interface UpdateTyre {
    default void updateTyre (ServiceStation[] serviceStations) {
        System.out.println();
    }
    void updateTyre (Car[] cars);
    void updateTyre (Truck[] trucks);
    void updateTyre (Bicycle[] bicycles);
}
