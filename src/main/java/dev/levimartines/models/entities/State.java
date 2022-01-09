package dev.levimartines.models.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "state")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class State extends PanacheEntityBase {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(mappedBy = "state")
    private List<City> cities = new ArrayList<>();

}
