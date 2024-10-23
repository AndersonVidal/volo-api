import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="spends")
@Builder
@NoArgsConstructor
@AllArgsContructor
@Getter
@Setter
public class Spend extends BasicModel {
    @Id
    @GeneratedValue(strategy = GeneratedValue.IDENTITY)
    private Long id;

    private String type;

    private String category;

    private String name;

    private float value;

    private LocalDateTime paid;
}
