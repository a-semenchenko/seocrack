package org.seocrack.crawler.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by a.semenchenko on 12.05.2017.
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WebProject {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_gen")
  @SequenceGenerator(name = "seq_gen", sequenceName = "webProject_seq", allocationSize = 1)
  private Long id;
  private String name;
  @OneToMany(mappedBy = "webProject", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  private List<WebPage> pages = new ArrayList<>();
  @Temporal(TemporalType.TIMESTAMP)
  private Calendar created;
  @Temporal(TemporalType.TIMESTAMP)
  private Calendar lastUpdate;

  public void addPage(WebPage page) {
    pages.add(page);
  }
}
