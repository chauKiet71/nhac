
package model;

import javax.swing.Icon;


public class Model_GoiY {
    private String name;
    private String singer;
    private Icon image;

    public Model_GoiY() {
    }

    public Model_GoiY(String name, String singer, Icon image) {
        this.name = name;
        this.singer = singer;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public Icon getImage() {
        return image;
    }

    public void setImage(Icon image) {
        this.image = image;
    }
    
    
}
