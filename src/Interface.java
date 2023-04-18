public interface Interface {
    default void print(ServiceStation[] serviceStations){
        System.out.println();
    }

    void print(Car[] cars);

    void print(Truck[] trucks);

    void print(Bicycle[] bicycles);
}
