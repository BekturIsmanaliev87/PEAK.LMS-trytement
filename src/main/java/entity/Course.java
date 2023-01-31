package entity;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import javax.persistence.*;

@Entity
@Table(name="courses")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
    @Column(name="course_id")
    private String courseName;
    @Column(name="duration_month")
    private String durationMonth;
   @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="company_id")
    private Company company;
}
