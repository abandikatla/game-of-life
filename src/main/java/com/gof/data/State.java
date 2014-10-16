package com.gof.data;

/**
 * @author abandik
 * State is the enum denoting state of a cell
 */
public enum State {

	ALIVE("X"),
	DEAD("-");
	
	private final String key;
	
	/**
	 * Constructor
	 * 
	 * @param key
	 */
	State(String key) {
		this.key = key;
	}
	
	public String getKey() {
		return key;
	}
	
	public static State fromKey(String key) {
        for (State state : values()) {
            if (state.getKey().equalsIgnoreCase(key)) {
                return state;
            }
        }
        return State.valueOf(key);
    }
}
