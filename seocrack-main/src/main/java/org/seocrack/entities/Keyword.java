package org.seocrack.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Calendar;

/**
 * Ключевые слова
 * Created by meqqee on 30.01.2017.
 */
@Data
@Entity
public class Keyword {
    private long id;
    private int position;
    private Calendar checkDate;
    @ManyToOne
    private Project project;
//    private Page relevantPage; TODO need to choose field type: String or Page
}
