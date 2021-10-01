package state;

public class ReadState implements State {
	DiskCover diskCover;
	public ReadState(DiskCover diskCover) {
		this.diskCover = diskCover;
	}

	@Override
	public void insertHDD() {
		System.out.println("Sorry already HDD inside");

	}

	@Override
	public void ejectHDD() {
		System.out.println("Please Power off the HDD first");

	}

	@Override
	public void powerOn() {
		System.out.println("HDD already on");

	}

	@Override
	public void powerOff() {
		System.out.println("HDD powering off");
		diskCover.setState(diskCover.getOffState());

	}

	@Override
	public void read() {
		System.out.println("Reading HDD");

	}

	@Override
	public void write() {
		System.out.println("Writing HDD");
		diskCover.setState(diskCover.getWriteState());

	}
	public String toString() {
		return " read state";
	}
}
