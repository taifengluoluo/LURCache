package com.github.taifengluoluo.cache;

import java.util.LinkedHashMap;
import java.util.Map;

public class MyHashMap<K,V> extends LinkedHashMap<K, V> {
	  private int capacity;
      public MyHashMap(int capacity){
          this.capacity = capacity;
      }
	@Override
	protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {
		// TODO Auto-generated method stub
		return this.size() > this.capacity;
	}
      
      
}
