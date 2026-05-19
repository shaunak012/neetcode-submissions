class TimeMap {
    HashMap<String,TreeMap<Integer,String>> map;
    public TimeMap() {
        map=new HashMap<>();
    }
    public void set(String key, String value, int timestamp) {
        map.put(key,map.getOrDefault(key,new TreeMap<>()));
        map.get(key).put(timestamp,value);
    }
    
    public String get(String key, int timestamp) {
        TreeMap<Integer,String> t_map=map.get(key);
        if(t_map==null) return "";
        Map.Entry<Integer, String> entry = t_map.floorEntry(timestamp);
        return entry==null?"":entry.getValue();
    }
}
