package tw.idv.fan. web.promotions.dao;

import java.util.List;

import tw.idv.fan.web.promotions.pojo.CoursePromo;

public interface PromotionsDao {

	List<CoursePromo> selectPromo();

	int insert(CoursePromo coursePromo);

	int deleteById(CoursePromo coursePromo);

}
