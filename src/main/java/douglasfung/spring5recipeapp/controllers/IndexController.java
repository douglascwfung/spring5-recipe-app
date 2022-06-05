package douglasfung.spring5recipeapp.controllers;

import douglasfung.spring5recipeapp.domain.Category;
import douglasfung.spring5recipeapp.domain.UnitOfMeasure;
import douglasfung.spring5recipeapp.repositories.CategoryRepository;
import douglasfung.spring5recipeapp.repositories.UnitOfMeasureRepository;
import douglasfung.spring5recipeapp.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Slf4j
@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {
        log.debug("Getting Index page");

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}