
public abstract class Carros extends VeiculosLocacao implements Locação {
    private Hatch hatch;
    private Sedan sedan;
    private Minivan minivan;
    private Suv suv;
    private double bbConforto = 0;
    private double cadeirinha = 0;
    private double asseleve = 0;
    private double gps = 0;
    private double km;
    private int status;
    private boolean dev = false;
    public Carros() {

    }
    public void setDev(boolean dev) {
        this.dev = dev;
    }
    public boolean getDev(){
        return this.dev;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public int getStatus(){
        return this.status;
    }
     public void setKm(double km) {
        this.km = km;
    }
    public double getKm() {
        return km;
    }
    public void setbbConforto(double bbConforto) {
        this.bbConforto = bbConforto;
    }

    public void setCadeirinha(double cadeirinha) {
        this.cadeirinha = cadeirinha;
    }

    public void setAssento(double asseleve) {
        this.asseleve = asseleve;
    }

    public void setGps(double gps) {
        this.gps = gps;
    }

    public double getBBconforto() {
        return this.bbConforto;
    }

    public double getCadeirinha() {
        return this.cadeirinha;
    }

    public double getAssento() {
        return this.asseleve;
    }

    public double getGps() {
        return this.gps;
    }

    public void tamFrota() {
        int total = (hatch.getQuantidade() + sedan.getQuantidade() + suv.getQuantidade() + minivan.getQuantidade());
        System.out.println("O tamanho da frota é:" + total + " de Veículos");
    }

    @Override
    public String toString() {
        return "Carro\nPlaca:" + this.getPlaca() + "\nMotivo:" + this.getMotivo() + "\nData:" + this.getData()
                + "\nDias locados:" + this.getDias();
    }
}