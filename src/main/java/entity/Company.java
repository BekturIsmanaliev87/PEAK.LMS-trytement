package entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="companies")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
public class Company {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(name="company_name")
    private String companyName;
    @Column(name="country")
    private String locatedCountry;

    @OneToMany(cascade={CascadeType.PERSIST,CascadeType.REFRESH},mappedBy="company")
    List<Course> courses;

}
