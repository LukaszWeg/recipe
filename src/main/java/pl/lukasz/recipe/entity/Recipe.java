package pl.lukasz.recipe.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Recipe {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    private String directions;
    @Lob
    private Byte[] image;
    @OneToOne(cascade = CascadeType.ALL)
    private Notes notes;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "recipe")
    private Set<Ingredient> ingredients;
    @Enumerated(value = EnumType.STRING)
    private Difficulty difficulty;
    @ManyToMany
    @JoinTable(name = "recipe_categories", joinColumns = @JoinColumn(name = "recipe_id"), inverseJoinColumns = @JoinColumn(name = "category_id"))
    private Set<Category> categories;


}
