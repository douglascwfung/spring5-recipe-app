package douglasfung.spring5recipeapp.services;

import douglasfung.spring5recipeapp.commands.RecipeCommand;
import douglasfung.spring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
