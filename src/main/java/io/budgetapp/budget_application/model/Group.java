package io.budgetapp.budget_application.model;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "budget_group")
@Data
// TODO : : : > > The purpose of this group is to give the user the
//  flexibility to create a group for each category.
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
//    @ManyToOne
//    private User user;
}
