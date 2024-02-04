package com.epam.mjc.collections.combined;

import java.util.*;
import java.util.stream.Collectors;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> res = projects.keySet()
                .stream()
                .filter(k -> projects.get(k).contains(developer))
                .collect(Collectors.toList());

        if (res.stream().allMatch(v -> v.length() == res.get(0).length()))
            Collections.reverse(res);

        return res;
    }
}
