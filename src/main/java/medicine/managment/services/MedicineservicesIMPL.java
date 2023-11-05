package medicine.managment.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import medicine.managment.Dao.MedicineDao;
import medicine.managment.entity.Medicine;
@Service
public class MedicineservicesIMPL implements MedicineServices {
	@Autowired
	MedicineDao mediDao;


	@Override
	public String add(Medicine medi) {
		String status=mediDao.mAdd(medi);
		return status;
	}


	@Override
	public String Search() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String Delete() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
