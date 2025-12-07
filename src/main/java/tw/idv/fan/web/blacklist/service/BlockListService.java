package tw.idv.fan. web.blacklist.service;

import java.util.List;

import tw.idv.fan.web.user.pojo.User;

public interface BlockListService {

	List<User> selectAllBlockService();

	int updateBlockStateService(User user);

	int updateUnlockStateService(User user);
}
