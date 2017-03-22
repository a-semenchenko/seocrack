package org.seocrack.dto;

import lombok.Getter;
import lombok.Setter;
import org.seocrack.utils.errors.ErrorItem;

import java.io.Serializable;
import java.util.List;

/**
 * Created by meqqee on 22.03.2017.
 */
@Getter
@Setter
public class ResultOutput {

   private Serializable data;
   private List<ErrorItem> errors;
   private boolean success = true;
}
