package ru.odintsov.rest.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.odintsov.rest.dto.AuthenticationDTO;
import ru.odintsov.rest.utils.JWTUtil;

import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {
    private final JWTUtil jwtUtil;
    private final ModelMapper modelMapper;
    private final AuthenticationManager authenticationManager;

    @Autowired
    public AuthenticationController(JWTUtil jwtUtil, ModelMapper modelMapper, AuthenticationManager authenticationManager) {
        this.jwtUtil = jwtUtil;
        this.modelMapper = modelMapper;
        this.authenticationManager = authenticationManager;
    }

    @PostMapping("/login")
    public Map<String, String> performLogin(@RequestBody AuthenticationDTO authenticationDTO) {
        String token = "";
        if (authenticationDTO.getPassword().equals("user") && authenticationDTO.getUsername().equals("user")) {
            token = jwtUtil.generateToken(authenticationDTO.getUsername());
        } else {
            return Map.of("message", "Incorrect credentials!");
        }
        return Map.of("demo-token-for-learn", token);
    }


}
