package org.example;

import org.springframework.stereotype.Component;

@Component
public interface Worker {

    void setPay(double pay);
    double getPay();

    void workDescription();

}
