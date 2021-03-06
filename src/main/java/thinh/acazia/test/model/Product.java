package thinh.acazia.test.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Entity
@Data
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "product's name must be fill")
    private String name;

//    private String categoryTag;

    @NotNull(message = "price must be fill")
    @Positive
    private double price;

    @ManyToOne (targetEntity = Category.class)
    @JoinColumn(name = "category_tag")
    private Category category;

}
