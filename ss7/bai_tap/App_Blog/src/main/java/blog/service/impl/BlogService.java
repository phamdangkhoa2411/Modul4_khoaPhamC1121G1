package blog.service.impl;

import blog.model.Blog;
import blog.repository.IBlogRepository;
import blog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService implements IBlogService {

    @Autowired
    private IBlogRepository iBlogRepository;

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return this.iBlogRepository.findAll(pageable);
    }

    @Override
    public void save(Blog blog) {
        this.iBlogRepository.save(blog);
    }

    @Override
    public Blog findById(Integer id) {
        return iBlogRepository.findById(id).orElse(null);
    }

    @Override
    public void remove(Integer id) {
        this.iBlogRepository.deleteById(id);
    }

    @Override
    public Page<Blog> findByName(String keyword, Pageable pageable) {
        return iBlogRepository.findAllByWriterContaining(keyword,pageable);
    }

    @Override
    public List<Blog> findBlogCategoryById(Integer idCategory) {
        return iBlogRepository.findAllCategoryById(idCategory);
    }


}
