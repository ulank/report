package isgp.micro.report.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotBlank;
import java.util.List;
import java.util.Map;

/**
 * Created by Ulan on 1/9/2023
 */

@Data
@Document(collection = "visualization")
@AllArgsConstructor
@NoArgsConstructor
public class Visualization {
    @Id
    private String id;

    @NotBlank
    @Field(name = "type")
    private VisualizationType type;

    @Field(name = "values")
    private List<Map<String, Boolean>> values;

    public enum VisualizationType {
        TABLE
    }
}
