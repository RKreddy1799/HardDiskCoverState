package state;

public class OffState implements State {
	DiskCover diskCover;
	public OffState(DiskCover diskCover) {
		this.diskCover = diskCover;
	}

	@Override
	public void insertHDD() {
		System.out.println("HDD already inserted");
		
	}

	@Override
	public void ejectHDD() {
		System.out.println("Ejecting HDD");
		diskCover.setState(diskCover.getEjectState());

	}

	@Override
	public void powerOn() {
		System.out.println("Powering ON");
		diskCover.setState(diskCover.getOnState());

	}

	@Override
	public void powerOff() {
		System.out.println("HDD Powered off");

	}

	@Override
	public void read() {
		System.out.println("Cannot read when powered off");

	}

	@Override
	public void write() {
		System.out.println("Cannot write when powered off");
		
	}
	public String toString() {
		return " is off state";
	}
}
