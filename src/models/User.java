import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="users")
@Builder
@NoArgsConstructor
@AllArgsContructor
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GeneratedValue.IDENTITY)
    private Long id;

    private String name;

    private String password;

    private String email;

    private String phone;

    @Column(name = "perfil_image")
    private String perfilImage;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        updatedAt = LocalDateTime.now();
    }
}
