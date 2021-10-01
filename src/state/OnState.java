package state;

public class OnState implements State {
	DiskCover diskCover;
	public OnState(DiskCover diskCover) {
		this.diskCover = diskCover;
	}

	@Override
	public void insertHDD() {
		System.out.println("Sorry HDD already inserted");
		
	}

	@Override
	public void ejectHDD() {
		System.out.println("Please power off the HDD first");
	}

	@Override
	public void powerOn() {
		System.out.println("HDD already on");

	}

	@Override
	public void powerOff() {
		
		System.out.println("Powering Off HDD");
	}

	@Override
	public void read() {
		System.out.println("Reading HDD");
		diskCover.setState(diskCover.getReadState());
	}

	@Override
	public void write() {
		System.out.println("Writing HDD");
		diskCover.setState(diskCover.getWriteState());

	}
	public String toString() {
		return " on state";
	}
}
