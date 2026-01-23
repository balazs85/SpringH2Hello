package hu.nbt.SpringH2Hello.customMapper.mapper;
import hu.nbt.SpringH2Hello.customMapper.dto.UserSimpleDto;
import hu.nbt.SpringH2Hello.customMapper.entity.CustomUser;
import org.springframework.stereotype.Service;

@Service
public class UserSimpleMapper {

    public UserSimpleDto toSimpleDto(CustomUser user) {
        if (user == null) {
            return null;
        }

        return new UserSimpleDto(
                user.getId(),
                user.getName(),
                user.getEmail()
        );
    }

}
