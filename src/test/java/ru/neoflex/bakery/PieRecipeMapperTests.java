package ru.neoflex.bakery;

import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import org.springframework.boot.test.context.SpringBootTest;
import ru.neoflex.bakery.dto.PieDtoView;
import ru.neoflex.bakery.mapper.PieRecipeMapper;
import ru.neoflex.bakery.model.Pie;
import ru.neoflex.bakery.model.Recipe;

@SpringBootTest
public class PieRecipeMapperTests {
    PieRecipeMapper pieRecipeMapper = Mappers.getMapper(PieRecipeMapper.class);

    @Test
    public void getPieDtoView(){
        Pie pie = new Pie();
        pie.setId(101L);
        pie.setName("пирог с вишней");
        pie.setPrice(327.0);
        pie.setAmount(1);

        Recipe recipe = new Recipe();
        recipe.setId(pie.getId());
        recipe.setDescription("description");
        recipe.setUsefulness(15);
        recipe.setCalories(540);
        recipe.setTtm(95);

        PieDtoView pieDtoView = pieRecipeMapper.pieDtoView(pie, recipe);
        System.out.println(pie.toString());
        System.out.println(recipe.toString());
        System.out.println(pieDtoView.toString());
    }
}
