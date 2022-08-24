package io.budgetapp.budget_application.services;

import io.budgetapp.budget_application.exceptions.CategoryException;
import io.budgetapp.budget_application.model.Category;
import io.budgetapp.budget_application.model.Group;
import io.budgetapp.budget_application.payload.CategoryRequest;
import io.budgetapp.budget_application.repository.CategoryRepository;
import io.budgetapp.budget_application.repository.GroupRepository;
import io.budgetapp.budget_application.repository.TransactionRepository;
//import io.budgetapp.budget_application.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Slf4j
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private GroupRepository groupRepository;

    @Autowired
    private TransactionRepository transactionRepository;

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public Category createCategory(CategoryRequest categoryRequest) throws CategoryException {
        Category newCategory = new Category();
        Group group = new Group();
        Category checkForDuplicateName = categoryRepository
                .findByCategoryName(categoryRequest.getCategoryName().toUpperCase());

        if (checkForDuplicateName != null){
            throw new CategoryException("You can't have two budgets with the same name");
        }

        modelMapper.map(categoryRequest.getGroup(), group);
        Group savedGroup = groupRepository.save(group);
        log.info("Group saved");

        modelMapper.map(categoryRequest, newCategory);
        newCategory.setGroup(savedGroup);
        log.info("Category created successfully");
        return categoryRepository.save(newCategory);
    }

    @Override
    public Category getCategoryByName(String name) throws CategoryException {
        Category checkCategory = categoryRepository
                .findByCategoryName(name.toUpperCase());

        if (checkCategory == null){
            log.info("Can't find any budget with the name");
            throw new CategoryException("Can't find any budget with the name");
        }
        return checkCategory;
    }

    @Override
    public List<Category> getCategoryByStartDate(LocalDateTime localDateTime) {
        return null;
    }

    @Override
    public List<Category> getCategoryByEndDate(LocalDateTime localDateTime) {
        return null;
    }

    @Override
    public List<Category> getCategoryByGroupName(String groupName) throws CategoryException {
        Category findCategory = categoryRepository.findByCategoryName(groupName);

        if (findCategory == null){
            throw new CategoryException("Can't find a budget with the name");
        }
        return categoryRepository.findCategoriesByGroup_Name(groupName);
    }

    @Override
    public void deleteACategoryById(Long categoryId) throws CategoryException {
        Category categoryToDelete = categoryRepository.findById(categoryId)
                .orElseThrow(() -> new CategoryException("Can't find a budget with the name"));
        categoryRepository.delete(categoryToDelete);
    }

    @Override
    public Category updateCategory(CategoryRequest categoryRequest, Long id) throws CategoryException {
        Category categoryToUpdate = categoryRepository.findById(id)
                .orElseThrow(() -> new CategoryException("Can't find a budget with the name"));

        Group group = new Group();

        log.info("Group saved");

        modelMapper.map(categoryRequest.getGroup(), group);
        Group savedGroup = groupRepository.save(group);

        categoryToUpdate.setGroup(savedGroup);
        modelMapper.map(categoryRequest, categoryToUpdate);
        log.info("Update Successful");
        return categoryRepository.save(categoryToUpdate);
    }
}
