package api.payload;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
     int id;
     String username;
     String firstName;
     String  lastName;
     String email;
     String password;
     String phone;
     int  userStatus = 0;
}
