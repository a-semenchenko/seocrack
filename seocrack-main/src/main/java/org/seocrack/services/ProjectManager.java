package org.seocrack.services;

import org.seocrack.dto.ResultOutput;
import org.seocrack.entities.Keyword;
import org.seocrack.entities.Project;

import java.util.List;

/**
 * Менеджер проектов
 * Created by meqqee on 30.01.2017.
 */
public interface ProjectManager {
    /**
     * Добавление проекта в систему
     * @param region регион продвижения
     * @param url URL проекта
     * @param budget бюджет
     * @return стандартный ответ {@link org.seocrack.dto.ResultOutput}
     */
    ResultOutput addProject(String region, String url, int budget);

    /**
     * Удаление проекта из системы
     * @param id уникальный идентификатор проекта
     * @return стандартный ответ {@link org.seocrack.dto.ResultOutput}
     */
    ResultOutput deleteProject(long id);

    /**
     * Получение проекта по идентификатору
     * @param id уникальный идентификатор проекта
     * @return стандартный ответ {@link org.seocrack.entities.Project}
     */
    Project getProject(long id);

    /**
     * Получение списка ключевых слов по идентификатору проекта
     * @param id уникальный индентификатор проекта
     * @return стандартный ответ {@link org.seocrack.entities.Project}
     */
    List<Keyword> getProjectKeywords(long id);

    /**
     * Добавление ключевых слов к проекту по индентификатору
     * @param id уникальный идентификатор проекта
     * @param keywords список ключевых слов для добавления, содержит {@link org.seocrack.entities.Keyword}
     */
    void setProjectKeywords(long id, List<Keyword> keywords);

    /**
     * Активация проекта по идентификатору
     * @param id уникальный индентификатор проекта
     */
    void activateProject(long id);

    /**
     * Добавление комментария по идентификатору
     * @param id уникальный идентификатор проекта
     * @param comment текста комментария
     */
    void setComment(long id, String comment);
}
