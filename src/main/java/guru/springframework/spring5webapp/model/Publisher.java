package guru.springframework.spring5webapp.model;

import javax.persistence.*;

@Entity
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String pubName;
    private String pubAddress;

    public Publisher() {
    }

    public Publisher(String pubName, String pubAddress) {
//        this.id = id;
        this.pubName = pubName;
        this.pubAddress = pubAddress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPubName() {
        return pubName;
    }

    public void setPubName(String pubName) {
        this.pubName = pubName;
    }

    public String getPubAddress() {
        return pubAddress;
    }

    public void setPubAddress(String pubAddress) {
        this.pubAddress = pubAddress;
    }

}
