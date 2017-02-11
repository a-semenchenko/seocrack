package org.seocrack.utils.errors;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by meqqee on 30.01.2017.
 */
@Getter
@Setter
public class ErrorsHolder {
    private List<ErrorItem> errors;
}
