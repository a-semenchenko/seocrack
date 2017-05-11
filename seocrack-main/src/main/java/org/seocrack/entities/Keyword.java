package org.seocrack.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Calendar;

/**
 * Ключевые слова
 * Created by meqqee on 30.01.2017.
 */
@Entity
@Getter
@Setter
public class Keyword {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private int position;
    private Calendar checkDate;
    @ManyToOne
    private Project project;
//    private Page relevantPage; TODO need to choose field type: String or Page
}
