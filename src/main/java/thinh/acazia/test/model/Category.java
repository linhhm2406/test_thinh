package thinh.acazia.test.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="category")
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "category's name must be fill")
    private String name;

    @NotNull(message = "tag's name must be fill")
    @Column(unique = true, name = "category_tag")
    private String tag;

}
