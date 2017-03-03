package com.github.taifengluoluo.cache;

import java.util.Collections;
import java.util.Map;

public class CacheImpl<K,V> implements Cache<K,V>{

	
	private Map<K,V> cache;
	
	public CacheImpl(int capacity){
		cache = Collections.synchronizedMap(new MyHashMap<K,V>(capacity));
	}
	@Override
	public void put(K key, V value) {
		// TODO Auto-generated method stub
		cache.put(key, value);
	}

	@Override
	public V get(K key) {
		// TODO Auto-generated method stub
		return cache.get(key);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return cache.size();
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		cache.clear();
	}

	@Override
	public V remove(K key) {
		// TODO Auto-generated method stub
		return cache.remove(key);
	}
    
}
