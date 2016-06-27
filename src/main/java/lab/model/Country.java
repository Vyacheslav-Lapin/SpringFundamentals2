package lab.model;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Country implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;

    private String name;

    private String codeName;
}
