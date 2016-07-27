package com.builderbob;

import java.util.ArrayList;

/**
 * Created by localadmin on 7/27/16.
 */
public class House {
    private String name;
    private ArrayList<Room> rooms;

    public void addRoom(Room r){
        rooms.add(r);
    }
    public void deleteRoom(Room r){
        rooms.remove(r);
    }

    public House(String name) {
        this.name = name;
        this.rooms = new ArrayList<>();
    }

    public float floorCost(){

            return rooms.stream().map(r -> r.floorcost()).reduce(0f, (sum,val) -> sum + val);
        // return songs.stream().map(s -> s.getDuration()).reduce(0, (sum,val) -> sum + val);


    }

}
