package test.stanislav.danylenko.bootangular;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SpecificRequest {

    private String operation;
    private String parameter;

}
