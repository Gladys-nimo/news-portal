package dao;

import models.News;

import java.util.List;

public interface NewsDao {
    void addGeneralNews(News news);
    void addDepartmentNews(News news);
    List<News> getAllNews();
    List<News> getGeneralNews();


}
