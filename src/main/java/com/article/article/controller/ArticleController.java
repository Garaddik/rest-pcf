package com.article.article.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.article.article.model.Article;

@RestController
@RequestMapping("/articles/articles")
public class ArticleController {

	@GetMapping
	public Article getArticle() {
		Article article = new Article();
		article.setTitle("articleapp1 - New way 2");
		return article;
	}
}
