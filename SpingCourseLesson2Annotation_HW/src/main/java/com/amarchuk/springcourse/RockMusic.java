package com.amarchuk.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {

    private List<String> rockList = new ArrayList<>();

    {
        rockList.add("Rock song - 1");
        rockList.add("Rock song - 2");
        rockList.add("Rock song - 3");
    }

    @Override
    public String getSong(int num) {
        return rockList.get(num);
    }
}
