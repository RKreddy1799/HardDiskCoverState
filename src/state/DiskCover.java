package state;

public class DiskCover {
	State ejectState;
	State insertState;
	State offState;
	State onState;
	State readState;
	State writeState;
	State state;
	
	public DiskCover() {
		ejectState = new EjectState(this);
		insertState = new InsertState(this);
		offState = new OffState(this);
		onState = new OnState(this);
		readState = new ReadState(this);
		writeState = new WriteState(this);
		
		state = ejectState;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public State getEjectState() {
		return ejectState;
	}
	public State getInsertState() {
		return insertState;
	}
	public State getOffState() {
		return offState;
	}
	public State getOnState() {
		return onState;
	}
	public State getReadState() {
		return readState;
	}
	public State getWriteState() {
		return writeState;
	}
	public void powerOn() {
		state.powerOn();
	}
	public void eject() {
		state.ejectHDD();
	}
	public void insert() {
		state.insertHDD();
	}
	public void powerOff() {
		state.powerOff();
	}
	public void read() {
		state.read();
	}
	public void write() {
		state.write();
	}
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("\n---------IBM Research Lab-------\n");
		result.append("Hard Disk Cover " + state + "\n");
		return result.toString();
	}
}
