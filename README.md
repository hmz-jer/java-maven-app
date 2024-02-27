 import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConverterUnitTest {

    @Test
    public void testConvertJsonSchemaExamples() {
        // Créer un exemple de schéma JSON avec plusieurs exemples
        Map<String, Object> schemaWithExamples = new HashMap<>();
        List<Object> examples = new ArrayList<>();
        examples.add("example1");
        examples.add("example2");
        schemaWithExamples.put("examples", examples);

        // Créer une instance de Converter avec le schéma JSON
        Converter converter = new Converter();
        
        // Appeler la méthode de conversion
        converter.convertJsonSchemaExamples(schemaWithExamples);

        // Vérifier si la conversion a été effectuée correctement
        assertFalse(schemaWithExamples.containsKey("examples")); // Vérifie si la clé "examples" a été supprimée
        assertTrue(schemaWithExamples.containsKey("example")); // Vérifie si la clé "example" a été ajoutée
        assertEquals("example1", schemaWithExamples.get("example")); // Vérifie si la valeur de "example" est correcte
    }
}
