import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="users")
@Builder
@NoArgsConstructor
@AllArgsContructor
@Getter
@Setter
public class User extends BasicModel {
    @Id
    @GeneratedValue(strategy = GeneratedValue.IDENTITY)
    private Long id;

    private String name;

    private String password;

    private String email;

    private String phone;

    @Column(name = "perfil_image")
    private String perfilImage;
}
