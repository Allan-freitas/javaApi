package br.com.api.dominio;

import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.Date;

public class Usuario {

    @MongoId
    private String id;

    private String username;

    private String password;

    private String email;

    private String gender;

    private Date dateOfBirth;

    private String knownAs;

    private Date lastActive;

    private String introduction;

    private String lookingFor;

    private String interests;

    private String city;

    private String country;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        id = id;
    }

    public void setName(String name) {
        name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPasswordHash(byte[] passwordHash) {
        password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        dateOfBirth = dateOfBirth;
    }

    public String getKnownAs() {
        return knownAs;
    }

    public void setKnownAs(String knownAs) {
        knownAs = knownAs;
    }

    public Date getLastActive() {
        return lastActive;
    }

    public void setLastActive(Date lastActive) {
        lastActive = lastActive;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        introduction = introduction;
    }

    public String getLookingFor() {
        return lookingFor;
    }

    public void setLookingFor(String lookingFor) {
        lookingFor = lookingFor;
    }

    public String getInterests() {
        return interests;
    }

    public void setInterests(String interests) {
        interests = interests;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        country = country;
    }
}
