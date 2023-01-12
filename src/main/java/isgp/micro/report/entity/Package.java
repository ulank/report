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

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.time.Instant;
import java.util.Set;

/**
 * Created by Ulan on 1/12/2023
 */

@Data
@Document(collection = "package")
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Package {
    @Id
    private String id;

    @Field(name = "name")
    @NotBlank
    private String name;

    @Field(name = "description")
    private String description;

    @Field(name = "reports")
    private Set<@Valid Report> reports;

    @Field(name = "created_by")
    @CreatedBy
    private String createdBy;

    @Field(name = "created_at")
    @CreatedDate
    private Instant createAt;

}
