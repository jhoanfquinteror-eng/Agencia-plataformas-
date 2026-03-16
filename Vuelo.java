public class Vuelo {
    private String idVuelo;
    private String destino;
    private double precio;

    public Vuelo(String idVuelo, String destino, double precio) {
        this.idVuelo = idVuelo;
        this.destino = destino;
        this.precio = precio;
    }

    public void mostrarDetalles() {
        System.out.println("Vuelo " + idVuelo + " con destino a " + destino);
    }
}