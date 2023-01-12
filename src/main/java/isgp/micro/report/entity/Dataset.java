package isgp.micro.report.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Ulan on 1/9/2023
 */

@Data
@Document(collection = "dataset")
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Dataset {

    @Id
    private String id;

    public enum DatasetType {
        JSON, EXCEL, CSV, DATABASE
    }

}
