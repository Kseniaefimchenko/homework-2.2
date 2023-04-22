public abstract class WheeledTransport extends Transport {
    private int wheelsCount;

    public WheeledTransport(String modelName, int wheelsCount){
        super(modelName);
        this.wheelsCount = wheelsCount;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public void updateTyre(){
        System.out.println("Меняем покрышку");
    }
    @Override
    public void service(){
        super.service();
        for(int i = 0; i < wheelsCount; i++){
            updateTyre();
        }
    }
}
