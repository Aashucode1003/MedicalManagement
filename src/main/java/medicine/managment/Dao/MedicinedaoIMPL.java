package medicine.managment.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.stereotype.Repository;

import medicine.managment.entity.Medicine;
@Repository
public class MedicinedaoIMPL implements MedicineDao {

	@Autowired
	JdbcTemplate JdbcTemplate;
	@Override
	public String mAdd(Medicine medi) {
		Medicine midi= mSearch(medi.getMid());
		if(midi==null)
		{
			int rowCount=JdbcTemplate.update("insert into medirecord values('"+medi.getMid()+"','"+medi.getmName()+"','"+medi.getmCount()+"','"+medi.getmDescription()+"')");
			if(rowCount==1)
			{
				return "success";
			}else {
				return "existed";
			}
		}else
		{
			return "existed";
		}
		
	}

	@Override
	public String mDelete(int mid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Medicine mSearch(int mid) {
		Medicine md;
		List<Medicine>mediList=JdbcTemplate.query("select * from medirecord where ID='"+mid+"'",(rs,rowCount) ->
		{
			Medicine m=new Medicine();
			m.setMid(mid);
			m.setmName(rs.getString("NAME"));
			m.setmCount(Integer.parseInt(rs.getString("COUNT")));
			m.setmDescription(rs.getString("DESCREPTION"));
			return m;
		});
		if(mediList.isEmpty()==true)
		{
			
			md=null;
		}else {
			
			return md=mediList.get(0);
		}
		return md;
		

	}



}
