package medicine.managment.Dao;

import medicine.managment.entity.Medicine;

public interface MedicineDao {
	
	public String mAdd(Medicine medi);
	public String mDelete(int mid);
	public Medicine mSearch(int mid);

}
