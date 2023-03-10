package isgp.micro.report.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.Instant;

/**
 * Created by Ulan on 1/9/2023
 */

@Data
@Document(collection = "report")
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Report {

    @Id
    private String id;

    @Field(name = "title")
    @NotNull
    private String title;

    @Field(name = "description")
    private String description;

    @Field(name = "dataset_id")
    @NotBlank
    private String datasetId;

    @Field(name = "created_by")
    @CreatedBy
    private String createdBy;

    @Field(name = "created_at")
    @CreatedDate
    private Instant createAt;

}
