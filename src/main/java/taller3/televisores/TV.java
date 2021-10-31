package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	private static int numTV = 0;
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		TV.numTV ++;
	}
	
	public Marca getMarca() {
		return marca;
	}
	
	public void setMarca(Marca marca) {
		this.marca = marca;
	} 

	public Control getControl() {
		return control;
	}
	
	public void setControl(Control control) {
		this.control = control;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		if (volumen > 7 || volumen <0 || estado == false)
			return;
		this.volumen = volumen;
	}
	
	public int getCanal() {
		return canal;
	}
	
	public void setCanal(int canal) {
		if (canal >120 || canal < 1 || estado == false)
			return;
		this.canal = canal;
	}
 
	public int getNumTV() {
		return numTV;
	}
	
	public void setNumTV(int numTV) {
		TV.numTV = numTV;
	}
	
	public void turnOn () {
		estado = true;
	}

	public void turnOff () {
		estado = false;
	}

	public boolean getEstado() {
		return estado;
	}
	
	public void canalUp() {
		if (canal+1 >120 || estado == false)
			return;
		canal ++;
	}
	
	public void canalDown() {
		if (canal-1<1 || estado == false)
			return;
		canal --;
	}

	public void volumenUp() {
		if (volumen +1 >7 || estado == false)
			return;
		volumen ++;
	}

	public void volumenDown() {
		if (volumen -1 <0 || estado == false)
		volumen --;
	}
	
	
}
