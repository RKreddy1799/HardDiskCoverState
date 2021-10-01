package state;

public class EjectState implements State {
	DiskCover diskCover;
	public EjectState(DiskCover diskCover) {
		this.diskCover = diskCover;
	}

	@Override
	public void insertHDD() {
		System.out.println("Inserting HDD");
		diskCover.setState(diskCover.getInsertState());
	}

	@Override
	public void ejectHDD() {
		System.out.println("Ejected HDD");
	
	}

	@Override
	public void powerOn() {
		System.out.println("Cannot power on HDD removed");

	}

	@Override
	public void powerOff() {
		System.out.println("No HDD found to Power off");

	}

	@Override
	public void read() {
		System.out.println("No HDD found to read");

	}

	@Override
	public void write() {
		System.out.println("No HDD found to write");
	}
	public String toString() {
		return " eject state";
	}
}
