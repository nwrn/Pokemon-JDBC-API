package br.com.pokemon.beans;

public class pokemon {

    private String name;
    private String type;
    private long level;
    private long hp;
    private long atk;
    private short height;
    private short weight;

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getType() {return type;}
    public void setType(String type) {this.type = type;}

    public long getLevel() {return level;}
    public void setLevel(long level) {this.level = level;}

    public long getHp() {return hp;}
    public void setHp(long hp) {this.hp = hp;}

    public long getAtk() {return atk;}
    public void setAtk(long atk) {this.atk = atk;}

    public short getHeight() {return height;}
    public void setHeight(short height) {this.height = height;}

    public short getWeight() {return weight;}
    public void setWeight(short weight) {this.weight = weight;}

}
