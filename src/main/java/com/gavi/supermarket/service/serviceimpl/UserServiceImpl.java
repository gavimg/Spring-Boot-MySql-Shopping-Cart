package com.gavi.supermarket.service.serviceimpl;

import com.gavi.supermarket.dto.AdderessDTO;
import com.gavi.supermarket.dto.LoginDTO;
import com.gavi.supermarket.dto.UserDTO;
import com.gavi.supermarket.dto.UserResponseDTO;
import com.gavi.supermarket.enums.Role;
import com.gavi.supermarket.exceptions.DataNotFoundException;
import com.gavi.supermarket.models.Address;
import com.gavi.supermarket.models.User;
import com.gavi.supermarket.repositories.UserRepository;
import com.gavi.supermarket.service.UserService;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Hi on 31-01-2018.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private DozerBeanMapper dozerBeanMapper;

    @Override
    public String addUser(UserDTO dto) {

        User user = dozerBeanMapper.map(dto, User.class);

        userRepository.save(user);

        return "SUCCESS";
    }

    @Override
    public String updateUser(UserDTO dto, Long userId) throws DataNotFoundException {

        User user = userRepository.findOne(userId);

        if(user != null) {
            user.setFirstName(dto.getFirstName());
            user.setLastName(dto.getLastName());
            user.setRole(Role.valueOf(dto.getRole()));
            Address address = user.getAddress();
            AdderessDTO addressDTO = dto.getAddresses();
            address.setCity(addressDTO.getCity());
            address.setLandmark(addressDTO.getLandmark());
            address.setPhoneNumber(addressDTO.getPhoneNumber());
            address.setPostboxNo(addressDTO.getPostboxNo());
            address.setZipcode(addressDTO.getZipcode());
            user.setAddress(address);
            user.setEmail(dto.getEmail());
            user.setUsername(dto.getUsername());
            user.setPassword(dto.getPassword());
            userRepository.flush();
            return "SUCCESS";

        } else {
            throw new DataNotFoundException("User Not Found");
        }

    }

    @Override
    public UserResponseDTO findByUserId(Long userId) {

        User user = userRepository.findOne(userId);
        return dozerBeanMapper.map(user, UserResponseDTO.class);
    }



    @Override
    public UserResponseDTO login(LoginDTO dto) throws DataNotFoundException {

        User user = userRepository.findByUsernameAndPassword(dto.getUsername(), dto.getPassword());

        if(user != null) {
            UserResponseDTO userResponseDTO = dozerBeanMapper.map(user, UserResponseDTO.class);

            return  userResponseDTO;
        } else {
            throw new DataNotFoundException("User Not Found");
        }
    }

    @Override
    public String deleteUser(Long userId) {

        userRepository.delete(userId);
        return "SUCCESS";
    }

}
