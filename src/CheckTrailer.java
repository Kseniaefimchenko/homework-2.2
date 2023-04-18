public interface CheckTrailer {
    default void checkTrailer(ServiceStation[] serviceStations){
        System.out.println();
    }
    void checkTrailer(Truck[] trucks);
}
