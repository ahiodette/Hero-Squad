package models;

import java.util.ArrayList;

public class Squad {

    private int squadId;
    private String squadName;
    private int squadSize;
    private String cause;
    private ArrayList<models.Hero>  squadMembers = new ArrayList<>();
    private static ArrayList<Squad> instances = new ArrayList<>();


    public Squad(String name, int size, String cause ){
        squadName = name;
        squadSize = size;
        this.cause = cause;
        this.squadMembers = new ArrayList<>();
        instances.add(this);
        this.squadId = instances.size();

    }
    public int getSquadId(){return squadId;}
    public static Squad findBySquadId(int id) {return instances.get(id-1);}
    public String getSquadName() {return squadName;}
    public int getSize() {return squadSize;}
    public String getCause() {return this.cause;}
    public static ArrayList<Squad> getInstances(){return instances;}
    public ArrayList<models.Hero> getSquadMembers(){
        return squadMembers;
    }
    public void setSquadMembers(models.Hero newMember) {
        squadMembers.add(newMember);
    }
    public static void clearAllSquads(){ instances.clear(); }
    public void clearAllSquadMembers(){ getSquadMembers().clear(); }

    public static Squad setUpNewSquad(){return new Squad("Imanzi",5,"Peace making");}
    public static Squad setUpNewSquad1(){return new Squad("Ibigwi",5,"Intore");}

}

