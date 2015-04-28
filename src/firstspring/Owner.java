
package firstspring;

import java.util.Objects;

/**
 *
 * @author mbrester1
 */
public class Owner {
    private String name;
    private Animal pet;

    public Owner(Animal pet) {
        this.pet = pet;
    }

    public Owner(String name, Animal pet) {
        this.name = name;
        this.pet = pet;
    }

    public Owner() {
    }

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Owner other = (Owner) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Owner{" + "name=" + name + '}';
    }

    
    
    
    
    public Animal getPet() {
        return pet;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }
    
    
    
    
    
}
