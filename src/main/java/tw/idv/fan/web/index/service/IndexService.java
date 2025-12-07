package tw.idv.fan. web.index.service;

import java.util.List;

import tw.idv.fan.web.coach.pojo.CoachProfiles;
import tw.idv.fan.web.promotions.pojo.CoursePromo;
import tw.idv.fan.web.user.pojo.User;

public interface IndexService {
	List<CoursePromo> findAllPromo();
	Boolean isOnSale (CoursePromo coursePromo);
	List<CoachProfiles> findAllCoach();
	Boolean coachApprovalStatus(User user);
}
