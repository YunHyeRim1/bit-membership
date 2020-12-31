package board.controllers;
<<<<<<< HEAD
import board.domains.ArticleDto;
import board.domains.ReplyDto;
import board.services.ArticleService;
import board.impls.ArticleServiceImpl;
public class ArticleController {
    private ArticleService articleService;
    public ArticleController(){
        articleService = new ArticleServiceImpl();
    }
    public void postArticle(ArticleDto article){
        articleService.writeArticle(article);
    }
    public void updateArticle(ArticleDto article){
        articleService.modifyArticle(article);
    }
    public void deleteArticle(ArticleDto article){
        articleService.removeArticle(article);
    }
    public void postReply(ReplyDto reply){
        articleService.writeReply(reply);
    }
    public void deleteReply(ReplyDto reply){
        articleService.removeReply(reply);
    }
    public ArticleDto getArticle(int artId){
        return articleService.readArticle(artId);
    }
    public ReplyDto[] getReply(int artId){
        return articleService.readReply(artId);
    }
    
}






=======

import board.domains.ArticleDTO;
import board.domains.ReplyDTO;
import board.impls.ArticleServiceImpl;
import board.services.ArticleService;

public class ArticleController {
    private ArticleService articleService;
    public ArticleController() {
        articleService = new ArticleServiceImpl();
    }
    public void postArticle(ArticleDTO article) {
        articleService.writeArticle(article);
    }
	public void updateArticle(ArticleDTO article) {
        articleService.modifyArticle(article);
    }
    public void deleteArticle(ArticleDTO article) {
        articleService.removeArticle(article);
    }
    public void postReply(ReplyDTO reply) {
        articleService.writeReply(reply);
    }
    public void deleteReply(ReplyDTO reply) {
        articleService.removeReply(reply);
    }
    public ArticleDTO getArticle(int artId) {
        return articleService.readArticle(artId);
    }
    public ReplyDTO[] getReply(int artId) {
        return articleService.readReply(artId);
    }

}
>>>>>>> 02bb71477c4c8cdccfe81c1929f0e810d1379a8e













