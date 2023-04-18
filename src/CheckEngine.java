public interface CheckEngine {
    default void checkEngine(ServiceStation[] serviceStations) {
        System.out.println();
    }
    void checkEngine (Car[] cars);
    void checkEngine (Truck[] trucks);
}
