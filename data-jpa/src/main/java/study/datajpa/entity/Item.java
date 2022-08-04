package study.datajpa.entity;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Getter
@Entity
public class Item {

    @GeneratedValue
    private Long id;

}
