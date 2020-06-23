package com.hankki.app.dao;

import java.util.List;
import java.util.Map;

import com.hankki.app.model.StoreVO;

public interface IStoreRepository {
	int getStoreCount();
	int getStoreCount(String name);
	List<StoreVO> getStoreList();
	StoreVO getStoreInfo(int storeid);
	void updateStore(StoreVO store);
	void insertStore(StoreVO store);
	void deleteStore(int storeid);
	
}