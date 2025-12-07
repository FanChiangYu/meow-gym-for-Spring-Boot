package tw.idv.fan. web.blacklist.dao;

import tw.idv.fan.web.user.pojo.User;

import java.util.List;



public interface BlockListDao {

	int updateBlockState(User user);
	
	List<User> selectAllBlock();

}
