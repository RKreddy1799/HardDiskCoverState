package state;

public class InsertState implements State {
	DiskCover diskCover;
	public InsertState(DiskCover diskCover) {
		this.diskCover = diskCover;
	}

	@Override
	public void insertHDD() {
		System.out.println("HDD already inserted");

	}

	@Override
	public void ejectHDD() {
		System.out.println("HDD ejected");
		diskCover.setState(diskCover.getEjectState());

	}

	@Override
	public void powerOn() {
		System.out.println("HDD powered ON");
		diskCover.setState(diskCover.getOnState());

	}

	@Override
	public void powerOff() {
		System.out.println("HDD powered off");
		diskCover.setState(diskCover.getOffState());
		
	}

	@Override
	public void read() {
		System.out.println("Read operation only after powering HDD");

	}

	@Override
	public void write() {
		System.out.println("Write operation only after powering HDD");

	}
	public String toString() {
		return " insert state";
	}
}
