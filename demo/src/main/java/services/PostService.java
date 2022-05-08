package services;

import com.example.demo.models.Post;
import com.example.demo.repositories.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record PostService(PostRepository postRepository) {

    public List<Post> list() {
        return postRepository.findAll();
    }
}
