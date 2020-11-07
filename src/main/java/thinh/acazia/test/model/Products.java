package thinh.acazia.test.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "products")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Products {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @NotNull
  @Column(name = "id")
  private Long id;
  @Column(name = "name")
  private String name;
  @Column(name = "price")
  private Double price;

  @ManyToOne
  @JoinColumn(name = "categoryTag")
  private Categories categoryTag;

}
