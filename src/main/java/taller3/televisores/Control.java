package taller3.televisores;

public class Control {
	private TV tv;
	
	public void turnOn() {
		this.tv.turnOn();
	}
	
	public void turnOff() {
		this.tv.turnOff();
	}

	public void canalUp() {
		this.tv.canalUp();
	}
	
	public void canalDown() {
		this.tv.canalDown();
	}
	
	public void volumenUp() {
		this.tv.volumenUp();
	}
	
	public void volumenDown() {
		this.tv.volumenDown();
	}

	public void setCanal(int canal) {
		this.tv.setCanal(canal);		
	}

	public void enlazar(TV TV) {
		tv = TV;
		TV.setControl(this);
	}
	
	public TV getTv() {
		return tv;
	}
	
	public void setTv(TV TV) {
		this.enlazar(TV);
	}

}



























