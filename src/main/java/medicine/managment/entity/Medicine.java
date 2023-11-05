package medicine.managment.entity;

public class Medicine {
	public int mid;
	public String mName;
	public int mCount;
	public String mDescription;
	
	public Medicine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Medicine(int mid, String mName, int mCount, String mDescription) {
		super();
		this.mid = mid;
		this.mName = mName;
		this.mCount = mCount;
		this.mDescription = mDescription;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public int getmCount() {
		return mCount;
	}
	public void setmCount(int mCount) {
		this.mCount = mCount;
	}
	public String getmDescription() {
		return mDescription;
	}
	public void setmDescription(String mDescription) {
		this.mDescription = mDescription;
	}
	
	
 
}
