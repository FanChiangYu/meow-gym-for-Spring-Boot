package tw.idv.fan. web.index.dao;

import java.util.List;

import tw.idv.fan.core.dao.CoreDao;
import tw.idv.fan.web.coach.pojo.CoachProfiles;
import tw.idv.fan.web.promotions.pojo.CoursePromo;
import tw.idv.fan.web.user.pojo.User;

public interface IndexDao extends CoreDao<CoursePromo, Integer>{

	List<CoachProfiles> selectAllCoach();

	User selectUserById(Integer userId);

}
