public abstract class Transport implements Interface{
    private String modelName;

    public Transport(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void service(){
        System.out.println("Обслуживаем " + modelName);
    }
}
