package org.seocrack.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
    private long id;
    private int position;
    private Calendar checkDate;
    @ManyToOne
    private Project project;
//    private Page relevantPage; TODO need to choose field type: String or Page
}
