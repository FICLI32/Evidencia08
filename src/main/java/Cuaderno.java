import java.util.ArrayList;

public class Cuaderno {
	private String titulo;
	private ArrayList<Hoja> hojas;

	public Cuaderno(String titulo) {
		this.titulo = titulo;
		this.hojas = new ArrayList<Hoja>();
	}

	public ArrayList<Hoja> getHojas() {
		return hojas;
	}

	public void agregarHojas(Hoja hoja) {
		hojas.add(hoja);
	}

	public void quitarHojas(Hoja hoja) {
		hojas.remove(hoja);
	}

	public void modificarHojas(int indice, Hoja hoja) {
		hojas.set(indice,hoja);
	}

	public void mostrarhojas() {
		System.out.println(hojas);
	}
}