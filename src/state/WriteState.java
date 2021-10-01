package state;

public class WriteState implements State {
	DiskCover diskCover;
	public WriteState(DiskCover diskCover) {
		this.diskCover = diskCover;
	}

	@Override
	public void insertHDD() {
		System.out.println("HDD already inside");
		
	}

	@Override
	public void ejectHDD() {
		System.out.println("Power of the HDD first to eject");

	}

	@Override
	public void powerOn() {
		System.out.println("HDD already on");

	}

	@Override
	public void powerOff() {
		System.out.println("HDD powered off");
		diskCover.setState(diskCover.offState);
	}

	@Override
	public void read() {
		System.out.println("Reading HDD");
		diskCover.setState(diskCover.getReadState());

	}

	@Override
	public void write() {
		
		System.out.println("Writing to HDD");
	}
	public String toString() {
		return " write state";
	}
}
