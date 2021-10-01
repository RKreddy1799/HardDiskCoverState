package state;

public class HardDiskCoverState {

	public static void main(String[] args) {
		DiskCover diskCover = new DiskCover();
		
		System.out.println(diskCover);
		diskCover.powerOn();
		diskCover.powerOff();
		diskCover.eject();
		diskCover.read();
		diskCover.write();
		
		System.out.println(diskCover);
		diskCover.insert();
		System.out.println(diskCover);
		diskCover.powerOn();
		System.out.println(diskCover);
		diskCover.read();
		System.out.println(diskCover);
		diskCover.write();
		System.out.println(diskCover);
		diskCover.eject();
		System.out.println(diskCover);
		diskCover.powerOff();
		System.out.println(diskCover);
		diskCover.eject();
		
		System.out.println(diskCover);
		
		
	}

}
