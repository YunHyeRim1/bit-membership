package board.services;
<<<<<<< HEAD
import board.domains.ArticleDto;
import board.domains.ReplyDto;
public interface ArticleService {
    public void writeArticle(ArticleDto article);
    public void modifyArticle(ArticleDto article);
    public void removeArticle(ArticleDto article);
    public void writeReply(ReplyDto reply);
    public void removeReply(ReplyDto reply);
    public ArticleDto readArticle(int artId);
    public ReplyDto[] readReply(int artId);
}
=======

import board.domains.ArticleDTO;
import board.domains.ReplyDTO;

public interface ArticleService {
    public void writeArticle(ArticleDTO article);
	public void modifyArticle(ArticleDTO article);
    public void removeArticle(ArticleDTO article);
    public void writeReply(ReplyDTO reply);
    public void removeReply(ReplyDTO reply);
    public ArticleDTO readArticle(int artId);
    public ReplyDTO[] readReply(int artId);
}

>>>>>>> 02bb71477c4c8cdccfe81c1929f0e810d1379a8e
