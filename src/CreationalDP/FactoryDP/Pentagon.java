package CreationalDP.FactoryDP;

/*public*/ class Pentagon implements Shape{

    private String name;

    private int angle;

    private int edge;

    //param const
    public Pentagon(String name, int angle, int edge) {
        this.name = name;
        this.angle = angle;
        this.edge = edge;
    }

    @Override
    public void draw() {

    }
}
