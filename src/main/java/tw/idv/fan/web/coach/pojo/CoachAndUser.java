package tw.idv.fan. web.coach.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tw.idv.fan.web.user.pojo.User;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CoachAndUser {
	private CoachProfiles coachProfiles;
	private User user;
}
