package tw.idv.fan. web.chat.service;

import tw.idv.fan.web.chat.pojo.Chats;

public interface ChatService {
	 //copy the saveAndLoad method from DAO to Service layer.
	Chats saveAndLoad(Chats chats);
}
