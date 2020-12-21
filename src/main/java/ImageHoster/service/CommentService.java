package ImageHoster.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ImageHoster.model.Comment;
import ImageHoster.repository.CommentRepository;

@Service
public class CommentService {

@Autowired
    private CommentRepository commentRepository;

    //The method calls the createComment() method in the Repository and passes the comments
    public Comment createComment(Comment comment) {
        return commentRepository.createComment(comment);
    }

    //This method get all the Comments in the database based on image id
    public List<Comment> getAllComments(Integer imageId, String imageTitle) {
        return commentRepository.getAllComments(imageId, imageTitle);
    }

}
