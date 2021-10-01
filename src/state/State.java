package state;

public interface State {
	public void insertHDD();
	public void ejectHDD();
	public void powerOn();
	public void powerOff();
	public void read();
	public void write();
}
