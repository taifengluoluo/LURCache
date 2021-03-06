package com.github.taifengluoluo.cache;

public interface Cache<K,V> {
	void put(K key,V value);
	
	V get(K key);
	
	int size();
	
	void clear();
	
	V remove(K key);
     
}
