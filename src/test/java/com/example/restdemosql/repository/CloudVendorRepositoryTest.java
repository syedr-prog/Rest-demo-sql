package com.example.restdemosql.repository;

import com.example.restdemosql.model.CloudVendor;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class CloudVendorRepositoryTest {
    //given - when - then

    @Autowired
    private CloudVendorRepository cloudVendorRepository;
    CloudVendor cloudVendor;

    //all initialization should all be in setup


    @BeforeEach
    void setUp() {
        cloudVendor = new CloudVendor("1", "Amazon", "USA", "xxxxx");
        cloudVendorRepository.save(cloudVendor);
    }

    @AfterEach
    void tearDown() {

    }

        
    //Test case Failure
}
