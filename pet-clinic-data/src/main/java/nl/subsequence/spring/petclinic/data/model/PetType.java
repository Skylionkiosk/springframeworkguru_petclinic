package nl.subsequence.spring.petclinic.data.model;

public class PetType extends BaseEntity {

    private String name;

    public String getName() {
        return name;
    }

    public PetType setName(String name) {
        this.name = name;
        return this;
    }
}
